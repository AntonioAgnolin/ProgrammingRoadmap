//Algoritmo que lê e mostra um vetor de 20 elementos inteiros.
//Mostra a soma de todos os elementos.
#include <stdio.h>

int main() {
    //Variáveis
    int vetor[20], soma = 0, i;
    
    for (i = 0; i < 20; i++) {
        //Entrada
        printf("Digite um número: %d/20 \n", (i+1));
        scanf("%d", &vetor[i]);

        //Processamento
        soma = soma + vetor[i];
    }
    //Saída
    printf("A soma dos 20 números é: %d \n", soma);
    return 0;
}