grammar SequenceAnalyzer; 

//PARSER RULES
init	:	func
		|	expr
		|	ID
		;
func	:	ID file
		|	ID '(' file ')'
		|	ID expr 
		|	ID '(' expr ')'
		|	ID '(' func ')'
		|	'(' func ')'
		;
file	:	ID FILE_EXT ;
expr	:   expr ('*'|'/') expr   
		|   expr ('+'|'-') expr   
		|   INT                                       
		|   '(' expr ')'         
		;


//LEXER RULES
ID  	:   LETTER (LETTER | INT)* ;
INT 	:   [0-9]+ ;         // match integers
FILE_EXT:	'.' ID* ;
LETTER	: 	[a-zA-Z] ;
NEWLINE	:	'\r'? '\n' ;     // return newlines to parser (end-statement signal)
LN_COMMENT :   '//' .*? '\n' -> skip;
COMMENT	:	'/*' .*? '*/' -> skip ;
WS  	:   [ \t]+ -> skip ; // toss out whitespace