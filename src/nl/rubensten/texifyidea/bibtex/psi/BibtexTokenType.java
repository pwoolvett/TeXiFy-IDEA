package nl.rubensten.texifyidea.bibtex.psi;

import com.intellij.psi.tree.IElementType;
import nl.rubensten.texifyidea.BibtexLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Ruben Schellekens, Sten Wessel
 */
public class BibtexTokenType extends IElementType {

    public BibtexTokenType(@NotNull @NonNls String debugName) {
        super(debugName, BibtexLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "BibtexTokenType." + super.toString();
    }
}
