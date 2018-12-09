#include<stdio.h>
#include<stdlib.h>

in main void() {
int i = 0;
int transactionTable[3][2] = {
{0,1},
{2,1},
{1,2}
};

int StartingState, AcceptingState, InitialState;

    StartingState = 0;
    AcceptingState = 0;
    InitialState = StartingState;

    char w[100] = "10001011101"; //String will be processed by DFA

    i = 0;
    while( i < strlen(w)){ // strlen(w) means size of string
        // w[i] is a char. for getting a value of a char, substracted by '0'
        InitialState = TransactionTable[InitialState][(w[i] - '0')];
        printf("InitialState: %d, SymbolToProcess: %d, #Transactions: %d\n", InitialState, w[i] - '0', i+1); //Only for information
        i++;
    }

    if( InitialState == AcceptingState ){
        printf("'%s' is Accepted!", w);
    }
    else{
        printf("'%s' is Rejected.", w);
    }

    return 0;
}
