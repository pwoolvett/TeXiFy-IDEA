package nl.rubensten.texifyidea;

import com.intellij.lexer.FlexAdapter;
import nl.rubensten.texifyidea.bibtex.grammar._BibtexLexer;

/**
 * @author Ruben Schellekens
 */
public class BibtexLexerAdapter extends FlexAdapter {

    public BibtexLexerAdapter() {
        super(new _BibtexLexer(null));
    }
}
