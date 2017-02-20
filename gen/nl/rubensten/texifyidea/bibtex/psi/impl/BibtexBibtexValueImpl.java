// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexBibtexValueImpl extends ASTWrapperPsiElement implements BibtexBibtexValue {

  public BibtexBibtexValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitBibtexValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BibtexBibtexBraceValue getBibtexBraceValue() {
    return findChildByClass(BibtexBibtexBraceValue.class);
  }

  @Override
  @Nullable
  public BibtexBibtexConcatenateValue getBibtexConcatenateValue() {
    return findChildByClass(BibtexBibtexConcatenateValue.class);
  }

  @Override
  @Nullable
  public BibtexBibtexString getBibtexString() {
    return findChildByClass(BibtexBibtexString.class);
  }

}
