%{
#include<stdio.h>
int yyerror(char *s){
fprintf(stderr,"%s\n",s);
}
int yylex();
%}
%token CONST VAR plus moin puiss divk
%%
ligne : expr '\n' {printf("ok\n");printf("le nombre des opretation :%d\n",$1); YYACCEPT;};
expr : term           {$$=$1;}
     | expr plus term {$$=$1+$2;}
     | expr moin term {$$=$1+$2;}
;
term : factor            {$$=$1;}
     | term puiss factor {$$=$1+$2;}
     | term divk factor   {$$=$1+$2;}
;
factor : CONST {}
       | VAR {}
       | '('expr')' {$$=$2;}
;
%%
int main(){
yyparse();
return 0;
}
