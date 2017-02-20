package nl.rubensten.texifyidea.file;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import nl.rubensten.texifyidea.BibtexLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Ruben Schellekens
 */
public class BibliographyFile extends PsiFileBase {

    public BibliographyFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, BibtexLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return BibliographyFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Bibliography file";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
