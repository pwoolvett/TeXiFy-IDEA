package nl.rubensten.texifyidea.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import nl.rubensten.texifyidea.BibtexLanguage;
import nl.rubensten.texifyidea.TexifyIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Ruben Schellekens
 */
public class BibliographyFileType extends LanguageFileType {

    public static final BibliographyFileType INSTANCE = new BibliographyFileType();

    private BibliographyFileType() {
        super(BibtexLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Bilbiography file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Bibliography file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "bib";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return TexifyIcons.BIBLIOGRAPHY_FILE;
    }
}
