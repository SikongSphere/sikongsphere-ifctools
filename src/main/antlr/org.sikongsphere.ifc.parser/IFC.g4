/*
 * Copyright 2022 SikongSphere
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */

grammar IFC;

ifcmodel :
        isoTag T_SEMICOLON
        header
        data
        T_END T_SUB isoTag
     ;

header :
       T_HEADER T_SEMICOLON
       T_FILE_DESCRIPTION T_OPEN_P fileDescription=exprFuncParams? T_CLOSE_P T_SEMICOLON
       T_FILE_NAME T_OPEN_P fileName=exprFuncParams? T_CLOSE_P T_SEMICOLON
       T_FILE_SCHEMA T_OPEN_P fileSchema=exprFuncParams? T_CLOSE_P T_SEMICOLON
       T_ENDSEC T_SEMICOLON
     ;

data :
       T_DATA T_SEMICOLON
       dataItem*
       T_ENDSEC T_SEMICOLON
     ;

dataItem :
       T_WELL stepNumber=intNumber T_EQUAL exprFunc T_SEMICOLON
     ;

isoTag :
       T_ISO_10303_21
     ;

expr :
       expr T_MUL expr
     | expr T_DIV expr
     | expr T_ADD expr
     | expr T_SUB expr
     | exprFunc
     | exprAtom
     | T_WELL intNumber
     | T_DOT ident T_DOT
     | T_OPEN_P expr (T_COMMA expr)* T_CLOSE_P
     ;

exprAtom :
       boolLiteral
     | ident
     | string
     | decNumber
     | intNumber
     | scientificCountingNumber
     | nullConst
     ;

exprFunc :
       ident T_OPEN_P exprFuncParams? T_CLOSE_P
     ;

exprFuncParams :
       funcParam (T_COMMA funcParam)*
     ;

funcParam :
     | expr (T_COMMA expr)*
     | T_MUL
     | T_DOLLAR
     ;

/*---------------------------- third party parser----------------------------*/
ident :
      L_ID
     ;

string :                                   // String literal (single or double quoted)
       L_S_STRING                          # singleQuotedString
     | L_D_STRING                          # doubleQuotedString
     ;

intNumber :                               // Integer (positive or negative)
     (T_SUB | T_ADD)? L_INT
     ;

decNumber :                               // Decimal number (positive or negative)
     (T_SUB | T_ADD)? L_DEC
     ;

scientificCountingNumber :
     decNumber 'E' intNumber
     ;

boolLiteral :                            // Boolean literal
       T_TRUE
     | T_FALSE
     ;

nullConst :                              // NULL constant
       T_NULL
     ;

T_DATA         : D A T A ;
T_END          : E N D ;
T_ENDSEC       : E N D S E C ;
T_FALSE        : F A L S E ;
T_FILE_DESCRIPTION  : F I L E '_' D E S C R I P T I O N ;
T_FILE_NAME    : F I L E '_' N A M E ;
T_FILE_SCHEMA  : F I L E '_' S C H E M A ;
T_HEADER       : H E A D E R ;
T_NULL         : N U L L ;
T_TRUE         : T R U E ;


T_ISO_10303_21 : I S O T_SUB '10303' T_SUB '21' ;

T_ADD          : '+' ;
T_COLON        : ':' ;
T_COMMA        : ',' ;
T_PIPE         : '||' ;
T_DIV          : '/' ;
T_DOT          : '.' ;
T_DOT2         : '..' ;
T_DOLLAR       : '$' ;
T_EQUAL        : '=' ;
T_EQUAL2       : '==' ;
T_NOTEQUAL     : '<>' ;
T_NOTEQUAL2    : '!=' ;
T_GREATER      : '>' ;
T_GREATEREQUAL : '>=' ;
T_LESS         : '<' ;
T_LESSEQUAL    : '<=' ;
T_MUL          : '*' ;
T_OPEN_B       : '{' ;
T_OPEN_P       : '(' ;
T_OPEN_SB      : '[' ;
T_CLOSE_B      : '}' ;
T_CLOSE_P      : ')' ;
T_CLOSE_SB     : ']' ;
T_SEMICOLON    : ';' ;
T_SUB          : '-' ;
T_WELL         : '#' ;

L_ID        : L_ID_PART                                                // Identifier
            ;
L_S_STRING  : '\'' (('\'' '\'') | ('\\' '\'') | ~('\''))* '\''         // Single quoted string literal
            ;
L_D_STRING  : '"' (L_STR_ESC_D | .)*? '"'                              // Double quoted string literal
            ;
L_INT       : L_DIGIT+ ;                                               // Integer
L_DEC       :
            L_DIGIT+ '.' L_DIGIT*                               // Decimal number
            | '.' L_DIGIT+
            | L_DIGIT '.'
            ;
L_WS        : L_BLANK+ -> skip ;                                       // Whitespace
L_M_COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;                       // Multiline comment
L_S_COMMENT : ('--' | '//')  .*? '\r'? '\n' -> channel(HIDDEN) ;       // Single line comment

L_FILE      : ([a-zA-Z] ':' '\\'?)? L_ID ('\\' L_ID)*                  // File path (a/b/c Linux path causes conflicts with division operator and handled at parser level)
            ; 

//L_LABEL     : ([a-zA-Z] | L_DIGIT | '_')* ':' ;

fragment
L_ID_PART  :
             [a-zA-Z] ([a-zA-Z] | L_DIGIT | '_')*                           // Identifier part
            | '$' '{' .*? '}'
//            | ('_' | '@' | '#' | '$') ([a-zA-Z] | L_DIGIT | '_' | '@' | '#' | '$')+     // (at least one char must follow special char)
            //| '"' .*? '"'                                                   // Quoted identifiers
            | '[' .*? ']'
            | '`' .*? '`'
            ;
fragment
L_STR_ESC_D :                                                          // Double quoted string escape sequence
              '""' | '\\"' 
            ;            
fragment
L_DIGIT     : [0-9]                                                    // Digit
            ;
fragment
L_BLANK     : (' ' | '\t' | '\r' | '\n')
            ;

// Support case-insensitive keywords and allowing case-sensitive identifiers
fragment A : ('a'|'A') ;
fragment B : ('b'|'B') ;
fragment C : ('c'|'C') ;
fragment D : ('d'|'D') ;
fragment E : ('e'|'E') ;
fragment F : ('f'|'F') ;
fragment G : ('g'|'G') ;
fragment H : ('h'|'H') ;
fragment I : ('i'|'I') ;
fragment J : ('j'|'J') ;
fragment K : ('k'|'K') ;
fragment L : ('l'|'L') ;
fragment M : ('m'|'M') ;
fragment N : ('n'|'N') ;
fragment O : ('o'|'O') ;
fragment P : ('p'|'P') ;
fragment Q : ('q'|'Q') ;
fragment R : ('r'|'R') ;
fragment S : ('s'|'S') ;
fragment T : ('t'|'T') ;
fragment U : ('u'|'U') ;
fragment V : ('v'|'V') ;
fragment W : ('w'|'W') ;
fragment X : ('x'|'X') ;
fragment Y : ('y'|'Y') ;
fragment Z : ('z'|'Z') ;
