//Algoritmo que lê um número inteiro e mostra uma mensagem indicando se é par ou ímpar.
//Também indica se é positivo ou negativo.
#include <stdio.h>

int main() {
    //Variável
    int numero;

    //Entrada
    printf("Escreva um número: \n");
    scanf("%d", &numero);

    //Processamento
    if (numero % 2 == 0) {
        if (numero > 0) {
           printf("O número %d é par e positivo. \n", numero);
        }else{
            printf("Número %d é par e negativo. \n", numero);
        }
    }else{
        if (numero > 0) {
            printf("O número %d é impar e positivo. \n", numero);
        }else{
            printf("O número %d é ímpar e negativo. \n", numero);
        }
    }
    return 0;
}
