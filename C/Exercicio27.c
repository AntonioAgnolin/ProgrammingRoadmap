//Algoritmo que carrega um vetor com 10 números inteiros.
//Mostra o vetor na ordem inversa ao que foi digitado.
#include <stdio.h>

int main() {
    //Variáveis
    int vetor[10], i;

    for (i = 0; i < 10; i++) {
        //Entrada
        printf("Digite um valor: \n");
        scanf("%d", &vetor[i]);
    }

    //Saída
    printf("Ordem inversa: \n");
    for (i = 9; i >= 0; i--) {
        printf("%d \n", vetor[i]);
    }

    return 0;
}