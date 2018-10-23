#define F_CPU 16000000UL
#include <stdio.h>
int main(void){
int a =  0 ;
int b [] = {1,2,3,4,5,6,7,8,9,10};
while ( a<10 ) {
printf( " Hola mundo %d\n " ,b [ a ] );
a++;
}
return 0;
}
