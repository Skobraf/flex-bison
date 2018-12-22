#ifndef _Automate
#define _Automate
#include "transition.h"

typedef struct automate{
    Transitions t;
    int etatInit;
    int Ftab[3];

} Automate;

Automate creerAutomate( void );

int rechercher( int , char , Liste  );

int est_reconnu( char*, Automate );


#endif // _Automate
