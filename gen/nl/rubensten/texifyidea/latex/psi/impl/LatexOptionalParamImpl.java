// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.latex.psi.impl;

import nl.rubensten.texifyidea.latex.psi.LatexOpenGroup;
import nl.rubensten.texifyidea.latex.psi.LatexOptionalParam;
import nl.rubensten.texifyidea.latex.psi.LatexVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.psi.*;

public class LatexOptionalParamImpl extends ASTWrapperPsiElement implements LatexOptionalParam {

  public LatexOptionalParamImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LatexVisitor visitor) {
    visitor.visitOptionalParam(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) accept((LatexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatexOpenGroup getOpenGroup() {
    return findNotNullChildByClass(LatexOpenGroup.class);
  }

}
