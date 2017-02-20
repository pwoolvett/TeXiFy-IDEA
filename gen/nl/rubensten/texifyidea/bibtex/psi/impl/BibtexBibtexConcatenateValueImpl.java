// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.rubensten.texifyidea.bibtex.psi.*;

public class BibtexBibtexConcatenateValueImpl extends ASTWrapperPsiElement implements BibtexBibtexConcatenateValue {

  public BibtexBibtexConcatenateValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BibtexVisitor visitor) {
    visitor.visitBibtexConcatenateValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BibtexVisitor) accept((BibtexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BibtexBibtexConcatenateValue getBibtexConcatenateValue() {
    return findChildByClass(BibtexBibtexConcatenateValue.class);
  }

  @Override
  @NotNull
  public List<BibtexBibtexString> getBibtexStringList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BibtexBibtexString.class);
  }

}
