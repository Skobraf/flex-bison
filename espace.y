%{
int yylex();
int yyerror(char *s){
fprintf(stderr,"%s\n",s);
}
%}
%token uni concat etoile lettre
%%
ligne: exp '\n' {printf("la hauteur de l'etoie est %d",$1);}
exp: '('exp')'	{$$ = $2}
   |exp uni exp {if($1>$3)$$=$1;else $$=$3;}
   |exp concat exp {if($1>$3)$$=$1;else $$=$3;}
   |exp etoile	{$$=$1+yyval}
   | lettre;
%%

int main(){
yyparse();
return 0;
}
