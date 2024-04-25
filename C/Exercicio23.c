//Algoritmo que gera a tabuada de qualquer número inteiro entre 1 a 10.
//O usuário deve informar qual número ele deseja ver a tabuada.
#include <stdio.h>

int main() {
    //Variáveis
    int numero, i, valor;

    //Entrada
    printf("Insira um número: \n");
    scanf("%d", &numero);

    //Processamento
    while (numero < 1 || numero > 10) {
        printf("O número deve ser entre 1 e 10! \n");

        printf("Insira um número: \n");
        scanf("%d", &numero);        
    }
        for (i = 1; i <= 10; i++) {
            //Saída
            printf("%d X %d = %d \n", numero, i, (numero * i));
    }
    return 0;
}