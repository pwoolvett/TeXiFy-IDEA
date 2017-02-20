// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi.impl;

import nl.rubensten.texifyidea.latex.psi.LatexGroup;
import nl.rubensten.texifyidea.latex.psi.LatexRequiredParam;
import nl.rubensten.texifyidea.latex.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.psi.*;

public class LatexRequiredParamImpl extends ASTWrapperPsiElement implements LatexRequiredParam {

  public LatexRequiredParamImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitRequiredParam(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatexGroup getGroup() {
    return findNotNullChildByClass(LatexGroup.class);
  }

}
