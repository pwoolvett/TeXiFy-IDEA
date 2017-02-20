// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexMathEnvironmentImpl extends ASTWrapperPsiElement implements BibtexMathEnvironment {

  public BibtexMathEnvironmentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitMathEnvironment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BibtexDisplayMath getDisplayMath() {
    return findChildByClass(BibtexDisplayMath.class);
  }

  @Override
  @Nullable
  public BibtexInlineMath getInlineMath() {
    return findChildByClass(BibtexInlineMath.class);
  }

}