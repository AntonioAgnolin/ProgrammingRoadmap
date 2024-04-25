//Algoritmo que lê dois vetores de 10 posições e faz a soma dos elementos de mesmo índice.
//Mostra o resultado em um terceiro valor e mostra o vetor resultante.
#include <stdio.h>

int main() {
    //Variáveis
    int vetor1[10], vetor2[10], soma[10], i;
    
    for (i = 0; i < 10; i++) {
        //Entrada
        printf("Digite um valor para o primeiro vetor: \n");
        scanf("%d", &vetor1[i]);
        printf("Digite um valor para o segundo vetor: \n");
        scanf("%d", &vetor2[i]);
        //Processamento
        soma[i] = vetor1[i] + vetor2[i];
    }

    //Saída
    for (i = 0; i < 10; i++) {
        printf("%d \n", soma[i]);
    }

    return 0;
}