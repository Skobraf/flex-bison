%{
#include"conter.tab.h"
%}
%option noyywrap
%%
[a-z] {return VAR;}
[0-9]+ {return CONST;}
"+" {return PLUS;}
"-" {return MOINS;}
"/" {return DIV;}
"*" {return FOIS;}
\n  {return '\n';}
"(" {return OUVRIR;}
")" {return FERMER;}
%%
