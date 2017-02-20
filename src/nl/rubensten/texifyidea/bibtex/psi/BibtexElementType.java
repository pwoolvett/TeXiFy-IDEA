package nl.rubensten.texifyidea.bibtex.psi;

import com.intellij.psi.tree.IElementType;
import nl.rubensten.texifyidea.BibtexLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Ruben Schellekens, Sten Wessel
 */
public class BibtexElementType extends IElementType {

    public BibtexElementType(@NotNull @NonNls String debugName) {
        super(debugName, BibtexLanguage.INSTANCE);
    }
}
