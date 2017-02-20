package nl.rubensten.texifyidea;

import com.intellij.lang.Language;

/**
 * @author Sten Wessel
 */
public class BibtexLanguage extends Language {

    public static final BibtexLanguage INSTANCE = new BibtexLanguage();

    private BibtexLanguage() {
        super("Bibtex");
    }

}
