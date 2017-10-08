grammar SequenceAnalyzer; 

//PARSER RULES
prog	:	init+;

init	:	cmd //need this?
		//|	assignment
		|	func
		|	expr
		|	ID
		;
cmd		:	vardef
		|	strcmd
		|	predef
		;
vardef	:	assignment
		//|	alphadef
		;
strcmd	:	'sub'
		|	'cmp'
		;
predef	:	'ct'
		|	'sp'
		|	'build'
		|	'sm'
		|	'wordcount'
		|	'concat'
		;
		
assignment	:	expr NEWLINE        # printExpr
		|	ID '=' expr NEWLINE  	# assign
		|   NEWLINE                 # blank
		;
		
func	:	assignment
		|	cmd file
		|	cmd file file
		|	cmd '(' file ')'
		|	cmd '(' file ')' '(' file ')'
		|	cmd expr expr
		|	cmd '(' expr ')' 
		|	cmd '(' expr ')' '(' expr ')'
		|	cmd '(' func ')'
		|	cmd '(' func ')' '(' func ')'
		|	'(' func ')'
		;
		



file	:	ID FILE_EXT;		 

expr	:   expr op=('*'|'/') expr # MulDiv  
		|   expr op=('+'|'-') expr # AddSub  
		/*|	USER_ALPHA			   # UserAlpha*/
		|	ID					   # id
		|   INT                    # int                   
		|   '(' expr ')'           # parens
		;


//LEXER RULES
ID  	:   LETTER /*(LETTER | INT)**/ ;
INT 	:   [0-9]+ ;         // match integers
USER_ALPHA	:	[0-1]+;		 // user defined
FILE_EXT:	'.' ID* ;
MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
LETTER	: 	[a-zA-Z]+ ;
NEWLINE	:	'\r'? '\n' ;     // return newlines to parser (end-statement signal)
LN_COMMENT :   '//' .*? '\n' -> skip;
COMMENT	:	'/*' .*? '*/' -> skip ;
WS  	:   [ \t]+ -> skip ; // toss out whitespace