// This is a generated file. Not intended for manual editing.
package nl.rubensten.texifyidea.bibtex.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import nl.rubensten.texifyidea.bibtex.psi.impl.*;

public interface BibtexTypes {

  IElementType BIBTEX_BRACE_VALUE = new BibtexElementType("BIBTEX_BRACE_VALUE");
  IElementType BIBTEX_CONCATENATE_VALUE = new BibtexElementType("BIBTEX_CONCATENATE_VALUE");
  IElementType BIBTEX_CONTENT = new BibtexElementType("BIBTEX_CONTENT");
  IElementType BIBTEX_ENTRY = new BibtexElementType("BIBTEX_ENTRY");
  IElementType BIBTEX_ENTRY_GROUP = new BibtexElementType("BIBTEX_ENTRY_GROUP");
  IElementType BIBTEX_ENTRY_GROUP_CONTENTS = new BibtexElementType("BIBTEX_ENTRY_GROUP_CONTENTS");
  IElementType BIBTEX_ENTRY_TITLE = new BibtexElementType("BIBTEX_ENTRY_TITLE");
  IElementType BIBTEX_KEY = new BibtexElementType("BIBTEX_KEY");
  IElementType BIBTEX_KEY_VALUE_PAIR = new BibtexElementType("BIBTEX_KEY_VALUE_PAIR");
  IElementType BIBTEX_STRING = new BibtexElementType("BIBTEX_STRING");
  IElementType BIBTEX_VALUE = new BibtexElementType("BIBTEX_VALUE");
  IElementType COMMANDS = new BibtexElementType("COMMANDS");
  IElementType COMMENT = new BibtexElementType("COMMENT");
  IElementType DISPLAY_MATH = new BibtexElementType("DISPLAY_MATH");
  IElementType GROUP = new BibtexElementType("GROUP");
  IElementType INLINE_MATH = new BibtexElementType("INLINE_MATH");
  IElementType LATEX_CONTENT = new BibtexElementType("LATEX_CONTENT");
  IElementType MATH_ENVIRONMENT = new BibtexElementType("MATH_ENVIRONMENT");
  IElementType NO_MATH_CONTENT = new BibtexElementType("NO_MATH_CONTENT");
  IElementType OPEN_GROUP = new BibtexElementType("OPEN_GROUP");
  IElementType OPTIONAL_PARAM = new BibtexElementType("OPTIONAL_PARAM");
  IElementType PARAMETER = new BibtexElementType("PARAMETER");
  IElementType REQUIRED_PARAM = new BibtexElementType("REQUIRED_PARAM");

  IElementType ASSIGNMENT = new BibtexTokenType("=");
  IElementType CITATION_KEY = new BibtexTokenType("CITATION_KEY");
  IElementType CLOSE_BRACE = new BibtexTokenType("}");
  IElementType CLOSE_BRACKET = new BibtexTokenType("]");
  IElementType COMMAND_TOKEN = new BibtexTokenType("COMMAND_TOKEN");
  IElementType COMMENT_TOKEN = new BibtexTokenType("COMMENT_TOKEN");
  IElementType CONCATENATE = new BibtexTokenType("#");
  IElementType DISPLAY_MATH_END = new BibtexTokenType("\\]");
  IElementType DISPLAY_MATH_START = new BibtexTokenType("\\[");
  IElementType INLINE_MATH_END = new BibtexTokenType("$");
  IElementType INLINE_MATH_START = new BibtexTokenType("INLINE_MATH_START");
  IElementType NORMAL_TEXT = new BibtexTokenType("NORMAL_TEXT");
  IElementType OPEN_BRACE = new BibtexTokenType("{");
  IElementType OPEN_BRACKET = new BibtexTokenType("[");
  IElementType QUOTATION_MARK = new BibtexTokenType("\"");
  IElementType SEPERATOR = new BibtexTokenType(",");
  IElementType STAR = new BibtexTokenType("*");
  IElementType TYPE_TOKEN = new BibtexTokenType("TYPE_TOKEN");
  IElementType VALUE = new BibtexTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == BIBTEX_BRACE_VALUE) {
        return new BibtexBibtexBraceValueImpl(node);
      }
      else if (type == BIBTEX_CONCATENATE_VALUE) {
        return new BibtexBibtexConcatenateValueImpl(node);
      }
      else if (type == BIBTEX_CONTENT) {
        return new BibtexBibtexContentImpl(node);
      }
      else if (type == BIBTEX_ENTRY) {
        return new BibtexBibtexEntryImpl(node);
      }
      else if (type == BIBTEX_ENTRY_GROUP) {
        return new BibtexBibtexEntryGroupImpl(node);
      }
      else if (type == BIBTEX_ENTRY_GROUP_CONTENTS) {
        return new BibtexBibtexEntryGroupContentsImpl(node);
      }
      else if (type == BIBTEX_ENTRY_TITLE) {
        return new BibtexBibtexEntryTitleImpl(node);
      }
      else if (type == BIBTEX_KEY) {
        return new BibtexBibtexKeyImpl(node);
      }
      else if (type == BIBTEX_KEY_VALUE_PAIR) {
        return new BibtexBibtexKeyValuePairImpl(node);
      }
      else if (type == BIBTEX_STRING) {
        return new BibtexBibtexStringImpl(node);
      }
      else if (type == BIBTEX_VALUE) {
        return new BibtexBibtexValueImpl(node);
      }
      else if (type == COMMANDS) {
        return new BibtexCommandsImpl(node);
      }
      else if (type == COMMENT) {
        return new BibtexCommentImpl(node);
      }
      else if (type == DISPLAY_MATH) {
        return new BibtexDisplayMathImpl(node);
      }
      else if (type == GROUP) {
        return new BibtexGroupImpl(node);
      }
      else if (type == INLINE_MATH) {
        return new BibtexInlineMathImpl(node);
      }
      else if (type == LATEX_CONTENT) {
        return new BibtexLatexContentImpl(node);
      }
      else if (type == MATH_ENVIRONMENT) {
        return new BibtexMathEnvironmentImpl(node);
      }
      else if (type == NO_MATH_CONTENT) {
        return new BibtexNoMathContentImpl(node);
      }
      else if (type == OPEN_GROUP) {
        return new BibtexOpenGroupImpl(node);
      }
      else if (type == OPTIONAL_PARAM) {
        return new BibtexOptionalParamImpl(node);
      }
      else if (type == PARAMETER) {
        return new BibtexParameterImpl(node);
      }
      else if (type == REQUIRED_PARAM) {
        return new BibtexRequiredParamImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
