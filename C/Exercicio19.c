//Algoritmo que conta de 1 a 100 e a cada múltiplo de 10 emite uma mensagem.
#include <stdio.h>

int main() {
    //Variável
    int i;

    //Processamento
    for (i = 1; i <= 100; i++) {
            printf("%d \n", i);
            if (i % 10 == 0) {
                printf("Múltiplo de 10 \n", i);
            }
    }
    return 0;
}
