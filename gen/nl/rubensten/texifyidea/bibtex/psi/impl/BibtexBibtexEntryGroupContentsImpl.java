// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.rubensten.texifyidea.bibtex.psi.BibtexTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexBibtexEntryGroupContentsImpl extends ASTWrapperPsiElement implements BibtexBibtexEntryGroupContents {

  public BibtexBibtexEntryGroupContentsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitBibtexEntryGroupContents(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BibtexBibtexEntryTitle getBibtexEntryTitle() {
    return findNotNullChildByClass(BibtexBibtexEntryTitle.class);
  }

  @Override
  @NotNull
  public List<BibtexBibtexKeyValuePair> getBibtexKeyValuePairList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BibtexBibtexKeyValuePair.class);
  }

}