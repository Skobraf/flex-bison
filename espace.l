%{
#include"espace.tab.h"
%}
%option noyywrap

%%
[a-z1] 	{return lettre;}
"+"  	{return uni;}
"." 	{return concat}
"*" 	{yyval=1;
	return etoile;}
"("|")" {return yytext[0];}
\n 	{return '\n';}
. 	{printf("errorr");}

%%
