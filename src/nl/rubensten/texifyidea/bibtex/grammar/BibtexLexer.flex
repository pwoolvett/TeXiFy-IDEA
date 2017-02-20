package nl.rubensten.texifyidea.bibtex.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.rubensten.texifyidea.bibtex.psi.BibtexTypes.*;

%%

%{
  private boolean startedInlineMath = false;

  public BibtexLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class BibtexLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

DISPLAY_MATH_START="\["
DISPLAY_MATH_END="\]"
OPEN_BRACKET="["
CLOSE_BRACKET="]"
OPEN_BRACE="{"
CLOSE_BRACE="}"

COMMAND_TOKEN=\\([a-zA-Z]+|.|\n|\r)
COMMENT_TOKEN=%[^\r\n]*
NORMAL_TEXT=[^\\{}%\[\]$]+
TYPE_TOKEN=@([a-zA-Z]+)
CITATION_KEY=[^ @'\",\#}{~% ]+
VALUE=[^ @'\",\#}{~% ]+

%states INLINE_MATH
%%
{WHITE_SPACE}          { return com.intellij.psi.TokenType.WHITE_SPACE; }

"\\["                  { return DISPLAY_MATH_START; }
"\\]"                  { return DISPLAY_MATH_END; }

<YYINITIAL> {
    "$"                { yybegin(INLINE_MATH); return INLINE_MATH_START; }
}

<INLINE_MATH> {
    "$"                { yybegin(YYINITIAL); return INLINE_MATH_END; }
}

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

[^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
