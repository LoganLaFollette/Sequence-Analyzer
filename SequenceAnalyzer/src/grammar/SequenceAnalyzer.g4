grammar SequenceAnalyzer; 

//PARSER RULES
prog	:	cmd+;			//allows for multiple branches in tree

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
		//|	'print'
		;
		
vardef	:	assignment		
		//|	alphadef		//for future implementation of a user defined alphabet
		;
		
strcmd	:	sub			//substitution command
		|	cmp			//compare command
		;
		
predef	:	ct		//cutting times
		|	sp		//star product
		|	build		
		|	sm		//shift maximality
		|	wordct	//word count
		|	concat	//concatonate
		;
		
//input must be in format sub (data , data)
sub		:	'sub' LP file COMMA file RP	NEWLINE	#SubstitutionOfFiles
		|	'sub' LP expr COMMA expr RP	NEWLINE	#SubstitutionOfExpression
		;
		
//input must be in format cmp (data , data)
cmp		:	'cmp' LP file COMMA file RP	NEWLINE	#ComparisonOfFiles
		|	'cmp' LP expr COMMA expr RP	NEWLINE	#ComparisonOfExpression
		;
		
//input must be in format ct data or ct (data)		
ct		:	'ct' file NEWLINE			#CuttingTimesOfFile
		|	'ct' LP file RP	NEWLINE		#CuttingTimesOfFileInParens
		|	'ct' expr NEWLINE			#CuttingTimesOfExpression
		|	'ct' LP expr RP NEWLINE		#CuttingTimesOfExpressionInParens
		;
		
//input must be in format sp (data , data)		
sp		:	'sp' LP file COMMA file RP NEWLINE		#StarProductOfFiles
		|	'sp' LP expr COMMA expr RP NEWLINE		#StarProductOfExpressions
		;	
		
//input must be in format build data or build (data)
build	:	'build' file NEWLINE			#BuildFile
		|	'build' LP file RP NEWLINE		#BuildFileInParens
		|	'build'  expr NEWLINE			#BuildExpression
		|	'build' LP expr RP NEWLINE		#BuildExpressionInParens
		;
		
//input must be in format sm data or sm (data)
sm		:	'sm' file NEWLINE			#ShiftMaximalityOfFile
		|	'sm' LP file RP NEWLINE		#ShiftMaximalityOfFileInParens
		|	'sm' expr NEWLINE			#ShiftMaximalityOfExpression
		|	'sm' LP expr RP NEWLINE		#ShiftMaximalityOfExpressionInParens
		;
	
//input must be in format wordcount data or wordcount (data)	
wordct	:	'wordcount' file NEWLINE			#WordCountOfFile
		|	'wordcount' LP file RP NEWLINE		#WordCountOfFileInParens
		|	'wordcount' expr NEWLINE			#WordCountOfExpression
		|	'wordcount' LP expr RP NEWLINE		#WordCountOfExpressionInParens
		;
		
//input must be in format concat (data , data) or concat (data , data , index)	
concat	:	'concat' LP file COMMA file RP NEWLINE				#ConcatOn2files	
		|	'concat' LP file COMMA file COMMA INT RP NEWLINE	#ConcatOn2FilesAtIndex
		|	'concat' LP expr COMMA expr RP NEWLINE				#ConcatOn2Expressions
		|	'concat' LP expr COMMA expr COMMA INT RP NEWLINE	#ConcatOn2ExpressionsAtIndex
		;
		
assignment	:	ID ':=' expr NEWLINE  	# assign		//variable assignment syntax
			;
		
/*//For assignment by visitor
assignment	:	expr NEWLINE        # printExpr		//alternative to allow printing of assignment
		|	ID ':=' expr NEWLINE  	# assign		//variable assignment syntax
		|   NEWLINE                 # blank
		;
*/
		
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
COMMA	:	',';			//assigns token name to comma
MUL 	:   '*' ; 			//assigns token name to '*' for multiplication
DIV 	:   '/' ;			//assigns token name to '/' for division
ADD 	:   '+' ;			//assigns token name to '+' for addition
SUB 	:   '-' ;			//assigns token name to '-' for subtraction
LETTER	: 	[a-zA-Z]+ ;		//defines letters as lowercase and uppercase
NEWLINE	:	'\r'? '\n' ;    //return newlines to parser (end-statement signal)
LN_COMMENT :   '//' .*? '\n' -> skip;	//skips single line comments
COMMENT	:	'/*' .*? '*/' -> skip ;		//skips block comments
WS  	:   [ \t]+ -> skip ; 			// toss out whitespace