// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi.impl;

import nl.rubensten.texifyidea.latex.psi.LatexOptionalParam;
import nl.rubensten.texifyidea.latex.psi.LatexParameter;
import nl.rubensten.texifyidea.latex.psi.LatexRequiredParam;
import nl.rubensten.texifyidea.latex.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.psi.*;

public class LatexParameterImpl extends ASTWrapperPsiElement implements LatexParameter {

  public LatexParameterImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitParameter(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LatexOptionalParam getOptionalParam() {
    return findChildByClass(LatexOptionalParam.class);
  }

  @Override
  @Nullable
  public LatexRequiredParam getRequiredParam() {
    return findChildByClass(LatexRequiredParam.class);
  }

}
