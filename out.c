#define F_CPU 16000000UL
#include <avr/io.h>
#include <stdio.h>
#include <util/delay.h>
int main(void){
DDRB = 0b00000001;
DDRD = 0b00000111;
char luces [] = {0b00000001,0b00000010,0b00000100};
int a =  1 ;
while ( a==1 ) {
PORTD = luces[0];
_delay_ms(20);
PORTD = luces[1];
_delay_ms(20);
PORTD = luces[2];
_delay_ms(20);
if ( ! (PINB&( 1<<PB1 )) ) {
PORTB = 0b00000001;
}
else{
PORTB = 0b00000000;
}
}
return 0;
}
