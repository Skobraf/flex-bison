%{
#include "ex2.tab.h"
%}
%option noyywrap
%%
[a-z] {return VAR;}

"+" { yylval=1; 
     return plus;}
"/" {yylval=1; 
     return divk;}
"-" {yylval=1; 
     return moin;}
[0-9] {return CONST;}

"*"   {yylval=1; 
       return puiss;}	
\n     {return '\n';}	
"(" | ")" {return yytext[0];}
%%