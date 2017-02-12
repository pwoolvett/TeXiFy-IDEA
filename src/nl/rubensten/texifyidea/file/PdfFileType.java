package nl.rubensten.texifyidea.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.rubensten.texifyidea.LatexLanguage;
import nl.rubensten.texifyidea.TexifyIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Ruben Schellekens
 */
public class PdfFileType extends LanguageFileType {

    public static final PdfFileType INSTANCE = new PdfFileType();

    private PdfFileType() {
        super(LatexLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "PDF file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "PDF file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pdf";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TexifyIcons.PDF_FILE;
    }
}
