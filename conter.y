%{
#include <stdio.h>
int yyerror(char *s);
int yyparse();
int yylex();
%}
%token VAR CONST PLUS MOINS DIV FOIS OUVRIR FERMER

%%
ligne : expr '\n' {printf("Le nombre d'operations est : %d ",$1);YYACCEPT;};
%%
