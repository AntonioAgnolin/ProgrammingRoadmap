//Algoritmo que carrega um vetor de 10 números inteiros.
//Calcula e mostra números superiores a 50 e suas respectivas posições.
//Mostra uma mensagem caso não exista nenhum número nesta condição.
#include <stdio.h>

int main() {
    //Variáveis
    int vetor[10], i;
    char maiores_50 = 0;

    //Processamento
    for (i = 0; i < 10; i++) {
        //Entrada
        printf("Digite um número inteiro: %d/10 \n", (i+1));
        scanf("%d", &vetor[i]);
    }

    //Processamento
    for (i = 0; i < 10; i++) {
        if (vetor[i] > 50) {
            //Saída
            printf("Número %d maior que 50 na posição %d \n", vetor[i], (i+1));
            maiores_50 = 1;
        }
    }
    if (maiores_50 < 1) {
        printf("Não foram encontrados números maiores que 50 neste vetor. \n");
    } 
    return 0;
}