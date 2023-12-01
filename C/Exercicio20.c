//Algoritmo que gera e escreve os números ímpares dos números 100 e 200.
#include <stdio.h>

int main() {
    //Variável
    int i;

    //Processamento
    for (i = 100; i <=200; i++) {
        if (i % 2 != 0) {
            printf("Número ímpar: %d \n", i);
        }
    }
    return 0;
}