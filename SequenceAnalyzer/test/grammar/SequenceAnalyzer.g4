grammar SequenceAnalyzer; 

//PARSER RULES
init	:	func
		|	expr
		|	assign
		|	ID
		;
func	:	ID file
		|	ID '(' file ')'
		|	ID expr 
		|	ID '(' expr ')'
		|	ID '(' func ')'
		|	'(' func ')'
		;
assign	:	ID ':=' expr;
file	:	ID FILE_EXT ;
expr	:   expr ('*'|'/') expr   
		|   expr ('+'|'-') expr   
		|	USER_ALPHA
		|   INT                                       
		|   '(' expr ')'         
		;


//LEXER RULES
ID  	:   LETTER (LETTER | INT)* ;
INT 	:   [0-9]+ ;         // match integers
USER_ALPHA	:	[0-1]+;		 // user defined
FILE_EXT:	'.' ID* ;
LETTER	: 	[a-zA-Z] ;
NEWLINE	:	'\r'? '\n' ;     // return newlines to parser (end-statement signal)
LN_COMMENT :   '//' .*? '\n' -> skip;
COMMENT	:	'/*' .*? '*/' -> skip ;
WS  	:   [ \t]+ -> skip ; // toss out whitespace