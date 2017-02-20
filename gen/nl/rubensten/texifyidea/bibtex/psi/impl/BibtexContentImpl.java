// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexContentImpl extends ASTWrapperPsiElement implements BibtexContent {

  public BibtexContentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitContent(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BibtexMathEnvironment getMathEnvironment() {
    return findChildByClass(BibtexMathEnvironment.class);
  }

  @Override
  @Nullable
  public BibtexNoMathContent getNoMathContent() {
    return findChildByClass(BibtexNoMathContent.class);
  }

}
