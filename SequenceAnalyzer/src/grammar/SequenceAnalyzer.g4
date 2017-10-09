grammar SequenceAnalyzer; 

//PARSER RULES
prog	:	init+;			//allows for multiple branches in tree

init	:	//declares options for beginning of parse tree
			cmd				
		|	func
		|	expr
		|	ID
		;
		
cmd		:	//first branch of command hierarchy
			vardef			//variable definition
		|	strcmd			//string command
		|	predef			//predefined function
		;
		
vardef	:	assignment		
		//|	alphadef		//for future implementation of a user defined alphabet
		;
		
strcmd	:	'sub'			//substitution command
		|	'cmp'			//compare command
		;
		
predef	:	'ct'			//cutting times
		|	'sp'			//star product
		|	'build'			
		|	'sm'			//shift maximality
		|	'wordcount'		//word count
		|	'concat'		//concatonate
		;
		
assignment	:	expr NEWLINE        # printExpr		//alternative to allow printing of assignment
		|	ID ':=' expr NEWLINE  	# assign		//variable assignment syntax
		|   NEWLINE                 # blank
		;
		
func	:	assignment					//assignment function
		|	cmd file					//command on single file
		|	cmd file file				//command on 2 files
		|	cmd LP file RP				//command on file within parenthesis
		|	cmd LP file RP LP file RP	//command on 2 files within parenthesis
		|	cmd expr					//command on single expression
		|	cmd expr expr				//command on 2 expressions
		|	cmd LP expr RP 				//command on expression within parenthesis
		|	cmd LP expr RP LP expr RP	//command on 2 expressions within parenthesis
		|	cmd func					//command on single function
		|	cmd LP func RP				//command on function within parenthesis
		|	cmd LP func RP LP func RP	//command on function within parenthesis
		|	LP func RP					//generic function within parenthesis
		;
		



file	:	ID FILE_EXT;		 //file name with . extension

expr	:   expr op=('*'|'/') expr # MulDiv  	//multiplication or division of expressions
		|   expr op=('+'|'-') expr # AddSub  	//addition or subtraction of expressions
		/*|	USER_ALPHA			   # UserAlpha*///for later implementation of user defined alphabet
		|	ID					   # id			//expression as single ID
		|   INT                    # int        //expression as single Int  
		|   '(' expr ')'           # parens		//expression within parenthesis
		;


//LEXER RULES
ID  	:   LETTER (LETTER | INT)* ;	//defines ID as one letter and 0 or many letters or digits
INT 	:   [0-9]+ ;         // match integers
USER_ALPHA	:	[0-1]+;		 // user defined
FILE_EXT:	'.' ID+ ;		//defines file extension as a '.' follwed by one or more IDs
LP		:	'(';			//assigns token name to left parenthesis
RP		:	')';			//assigns token name to right parenthesis
MUL 	:   '*' ; 			//assigns token name to '*' for multiplication
DIV 	:   '/' ;			//assigns token name to '/' for division
ADD 	:   '+' ;			//assigns token name to '+' for addition
SUB 	:   '-' ;			//assigns token name to '-' for subtraction
LETTER	: 	[a-zA-Z]+ ;		//defines letters as lowercase and uppercase
NEWLINE	:	'\r'? '\n' ;    //return newlines to parser (end-statement signal)
LN_COMMENT :   '//' .*? '\n' -> skip;	//skips single line comments
COMMENT	:	'/*' .*? '*/' -> skip ;		//skips block comments
WS  	:   [ \t]+ -> skip ; 			// toss out whitespace