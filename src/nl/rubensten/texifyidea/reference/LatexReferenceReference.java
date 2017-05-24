package nl.rubensten.texifyidea.reference;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import nl.rubensten.texifyidea.TexifyIcons;
import nl.rubensten.texifyidea.index.LatexCommandsIndex;
import nl.rubensten.texifyidea.psi.*;
import nl.rubensten.texifyidea.util.TexifyUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Ruben Schellekens
 */
public class LatexReferenceReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    private String key;

    public LatexReferenceReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);

        this.key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        Collection<LatexCommands> commands = LatexCommandsIndex.getIndexedCommands(project);
        List<ResolveResult> results = new ArrayList<>();

        for (LatexCommands command : commands) {
            for (PsiElement psi : getNormalText(command)) {
                results.add(new PsiElementResolveResult(psi));
            }
        }

        return results.toArray(new ResolveResult[results.size()]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        if (resolveResults.length == 1) {
            return resolveResults[0].getElement();
        }
        else {
            return null;
        }
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project project = myElement.getProject();
        Collection<LatexCommands> commands = LatexCommandsIndex.getIndexedCommands(project);
        List<LookupElement> variants = new ArrayList<>();

        for (LatexCommands command : commands) {
            for (PsiElement psi : getNormalText(command)) {
                String text = psi.getText();
                if (text != null && text.length() > 0) {
                    variants.add(LookupElementBuilder.create(psi)
                            .withIcon(TexifyIcons.DOT_LABEL)
                            .withTypeText(psi.getContainingFile().getName()));
                }
            }
        }

        return variants.toArray();
    }

    private List<PsiElement> getNormalText(LatexCommands commands) {
        List<PsiElement> list = new ArrayList<>();

        for (LatexRequiredParam required : TexifyUtil.getRequiredParameters(commands)) {
            LatexGroup group = required.getGroup();
            if (group == null || group.getContentList().isEmpty()) {
                continue;
            }

            LatexContent content = group.getContentList().get(0);
            if (content == null) {
                continue;
            }

            LatexNoMathContent noMath = content.getNoMathContent();
            if (noMath == null) {
                continue;
            }

            list.add(noMath.getNormalText());
        }

        return list;
    }
}
