%option noyywrap

%%
(a|b)*b {printf("1");}

%%
int main(){
yylex();
return 0;
}
