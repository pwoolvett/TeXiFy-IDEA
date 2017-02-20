package nl.rubensten.texifyidea.bibtex.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.grammar.psi.BnfTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.rubensten.texifyidea.bibtex.psi.BibtexTypes.*;

%%

%{
  public _BibtexLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _BibtexLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

WHITE_SPACE=[ \t\n\x0B\f\r]+
COMMAND_TOKEN=\\([a-zA-Z]+|.|\n|\r)
COMMENT_TOKEN=%[^\r\n]*
NORMAL_TEXT=[^@\\{}%\[\]$]+
TYPE_TOKEN=@([a-zA-Z]+)
CITATION_KEY=[^ @'\",\#}{~% ]+
VALUE=[^ @'\",\#}{~% ]+

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "\\["                { return DISPLAY_MATH_START; }
  "\\]"                { return DISPLAY_MATH_END; }
  "$"                  { return INLINE_MATH_START; }
  "$"                  { return INLINE_MATH_END; }
  "{"                  { return OPEN_BRACE; }
  "}"                  { return CLOSE_BRACE; }
  "["                  { return OPEN_BRACKET; }
  "]"                  { return CLOSE_BRACKET; }
  "*"                  { return STAR; }
  "="                  { return ASSIGNMENT; }
  ","                  { return SEPERATOR; }
  "\""                 { return QUOTATION_MARK; }
  "#"                  { return CONCATENATE; }

  {WHITE_SPACE}        { return WHITE_SPACE; }
  {COMMAND_TOKEN}      { return COMMAND_TOKEN; }
  {COMMENT_TOKEN}      { return COMMENT_TOKEN; }
  {NORMAL_TEXT}        { return NORMAL_TEXT; }
  {TYPE_TOKEN}         { return TYPE_TOKEN; }
  {CITATION_KEY}       { return CITATION_KEY; }
  {VALUE}              { return VALUE; }

}

[^] { return BAD_CHARACTER; }
