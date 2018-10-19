@echo off
avr-gcc -g -Os -mmcu=atmega328p -c out.c
avr-gcc -g -mmcu=atmega328p -o out.elf out.o
avr-objcopy -j .text -j .data -O ihex out.elf out.hex
avr-size --format=avr --mcu=atmega328p out.elf
