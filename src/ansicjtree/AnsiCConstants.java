/* Generated By:JJTree&JavaCC: Do not edit this line. AnsiCConstants.java */
package ansicjtree;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface AnsiCConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int DEFINE_ID = 11;
  /** RegularExpression Id. */
  int IF_ID = 15;
  /** RegularExpression Id. */
  int IFN_ID = 20;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 27;
  /** RegularExpression Id. */
  int DECIMAL_LITERAL = 28;
  /** RegularExpression Id. */
  int HEX_LITERAL = 29;
  /** RegularExpression Id. */
  int OCTAL_LITERAL = 30;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 31;
  /** RegularExpression Id. */
  int EXPONENT = 32;
  /** RegularExpression Id. */
  int CHARACTER_LITERAL = 33;
  /** RegularExpression Id. */
  int STRING_LITERAL = 34;
  /** RegularExpression Id. */
  int CONTINUE = 35;
  /** RegularExpression Id. */
  int VOLATILE = 36;
  /** RegularExpression Id. */
  int REGISTER = 37;
  /** RegularExpression Id. */
  int UNSIGNED = 38;
  /** RegularExpression Id. */
  int TYPEDEF = 39;
  /** RegularExpression Id. */
  int DFLT = 40;
  /** RegularExpression Id. */
  int DOUBLE = 41;
  /** RegularExpression Id. */
  int SIZEOF = 42;
  /** RegularExpression Id. */
  int SWITCH = 43;
  /** RegularExpression Id. */
  int RETURN = 44;
  /** RegularExpression Id. */
  int EXTERN = 45;
  /** RegularExpression Id. */
  int STRUCT = 46;
  /** RegularExpression Id. */
  int STATIC = 47;
  /** RegularExpression Id. */
  int SIGNED = 48;
  /** RegularExpression Id. */
  int WHILE = 49;
  /** RegularExpression Id. */
  int BREAK = 50;
  /** RegularExpression Id. */
  int UNION = 51;
  /** RegularExpression Id. */
  int CONST = 52;
  /** RegularExpression Id. */
  int FLOAT = 53;
  /** RegularExpression Id. */
  int SHORT = 54;
  /** RegularExpression Id. */
  int ELSE = 55;
  /** RegularExpression Id. */
  int CASE = 56;
  /** RegularExpression Id. */
  int LONG = 57;
  /** RegularExpression Id. */
  int ENUM = 58;
  /** RegularExpression Id. */
  int AUTO = 59;
  /** RegularExpression Id. */
  int VOID = 60;
  /** RegularExpression Id. */
  int CHAR = 61;
  /** RegularExpression Id. */
  int GOTO = 62;
  /** RegularExpression Id. */
  int FOR = 63;
  /** RegularExpression Id. */
  int INT = 64;
  /** RegularExpression Id. */
  int IF = 65;
  /** RegularExpression Id. */
  int DO = 66;
  /** RegularExpression Id. */
  int IDENTIFIER = 67;
  /** RegularExpression Id. */
  int LETTER = 68;
  /** RegularExpression Id. */
  int DIGIT = 69;
  /** RegularExpression Id. */
  int SEMICOLON = 70;
  /** RegularExpression Id. */
  int LBRACE = 71;
  /** RegularExpression Id. */
  int RBRACE = 72;
  /** RegularExpression Id. */
  int COMMA = 73;
  /** RegularExpression Id. */
  int COLON = 74;
  /** RegularExpression Id. */
  int LPAREN = 75;
  /** RegularExpression Id. */
  int RPAREN = 76;
  /** RegularExpression Id. */
  int LBRACKET = 77;
  /** RegularExpression Id. */
  int RBRACKET = 78;
  /** RegularExpression Id. */
  int STAR = 79;
  /** RegularExpression Id. */
  int DOTS = 80;
  /** RegularExpression Id. */
  int EQ = 81;
  /** RegularExpression Id. */
  int STAR_EQ = 82;
  /** RegularExpression Id. */
  int SLASH_EQ = 83;
  /** RegularExpression Id. */
  int PERCENT_EQ = 84;
  /** RegularExpression Id. */
  int PLUS_EQ = 85;
  /** RegularExpression Id. */
  int MINUS_EQ = 86;
  /** RegularExpression Id. */
  int SM_SM_EQ = 87;
  /** RegularExpression Id. */
  int GR_GR_EQ = 88;
  /** RegularExpression Id. */
  int AND_EQ = 89;
  /** RegularExpression Id. */
  int OVER_EQ = 90;
  /** RegularExpression Id. */
  int OR_EQ = 91;
  /** RegularExpression Id. */
  int HOOK = 92;
  /** RegularExpression Id. */
  int OR_OR = 93;
  /** RegularExpression Id. */
  int AND_AND = 94;
  /** RegularExpression Id. */
  int OR = 95;
  /** RegularExpression Id. */
  int AND = 96;
  /** RegularExpression Id. */
  int OVER = 97;
  /** RegularExpression Id. */
  int EQ_EQ = 98;
  /** RegularExpression Id. */
  int NOT_EQ = 99;
  /** RegularExpression Id. */
  int SM = 100;
  /** RegularExpression Id. */
  int GR = 101;
  /** RegularExpression Id. */
  int SM_EQ = 102;
  /** RegularExpression Id. */
  int GR_EQ = 103;
  /** RegularExpression Id. */
  int SM_SM = 104;
  /** RegularExpression Id. */
  int GR_GR = 105;
  /** RegularExpression Id. */
  int PLUS = 106;
  /** RegularExpression Id. */
  int MINUS = 107;
  /** RegularExpression Id. */
  int SLASH = 108;
  /** RegularExpression Id. */
  int PERCENT = 109;
  /** RegularExpression Id. */
  int PLUS_PLUS = 110;
  /** RegularExpression Id. */
  int MINUS_MINUS = 111;
  /** RegularExpression Id. */
  int COMP = 112;
  /** RegularExpression Id. */
  int NOT = 113;
  /** RegularExpression Id. */
  int DOT = 114;
  /** RegularExpression Id. */
  int ARROW = 115;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int DEFINE = 1;
  /** Lexical state. */
  int IFDEF = 2;
  /** Lexical state. */
  int IFNDEF = 3;
  /** Lexical state. */
  int IGNORE = 4;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\"#define\"",
    "\"#ifdef\"",
    "\"#ifndef\"",
    "\"#endif\"",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\t\"",
    "<token of kind 9>",
    "<token of kind 10>",
    "<DEFINE_ID>",
    "\"\\n\"",
    "\"\\r\\n\"",
    "<token of kind 14>",
    "<IF_ID>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\t\"",
    "<IFN_ID>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\t\"",
    "\"#endif\"",
    "<token of kind 26>",
    "<INTEGER_LITERAL>",
    "<DECIMAL_LITERAL>",
    "<HEX_LITERAL>",
    "<OCTAL_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<CHARACTER_LITERAL>",
    "<STRING_LITERAL>",
    "\"continue\"",
    "\"volatile\"",
    "\"register\"",
    "\"unsigned\"",
    "\"typedef\"",
    "\"default\"",
    "\"double\"",
    "\"sizeof\"",
    "\"switch\"",
    "\"return\"",
    "\"extern\"",
    "\"struct\"",
    "\"static\"",
    "\"signed\"",
    "\"while\"",
    "\"break\"",
    "\"union\"",
    "\"const\"",
    "\"float\"",
    "\"short\"",
    "\"else\"",
    "\"case\"",
    "\"long\"",
    "\"enum\"",
    "\"auto\"",
    "\"void\"",
    "\"char\"",
    "\"goto\"",
    "\"for\"",
    "\"int\"",
    "\"if\"",
    "\"do\"",
    "<IDENTIFIER>",
    "<LETTER>",
    "<DIGIT>",
    "\";\"",
    "\"{\"",
    "\"}\"",
    "\",\"",
    "\":\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"*\"",
    "\"...\"",
    "\"=\"",
    "\"*=\"",
    "\"/=\"",
    "\"%=\"",
    "\"+=\"",
    "\"-=\"",
    "\"<<=\"",
    "\">>=\"",
    "\"&=\"",
    "\"^=\"",
    "\"|=\"",
    "\"?\"",
    "\"||\"",
    "\"&&\"",
    "\"|\"",
    "\"&\"",
    "\"^\"",
    "\"==\"",
    "\"!=\"",
    "\"<\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"<<\"",
    "\">>\"",
    "\"+\"",
    "\"-\"",
    "\"/\"",
    "\"%\"",
    "\"++\"",
    "\"--\"",
    "\"~\"",
    "\"!\"",
    "\".\"",
    "\"->\"",
  };

}
