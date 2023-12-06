//Algoritmo que carrega um vetor de 5 elementos inteiros.
//Armazena em um vetor apenas os números pares maiores que 0.
//No final, mostra os elementos do vetor na tela.
#include <stdio.h>

int main() {
    //Variáveis
    int vetor[5], pares[5], cont_par = 0, i;

    //Processamento
    for (i = 0; i < 5; i++) {
        //Entrada
        printf("Digite um valor: \n");
        scanf("%d", &vetor[i]);
        if (vetor[i] > 0) {
            if (vetor[i] % 2 == 0) {
                pares[cont_par] = vetor[i];
                cont_par = cont_par + 1;
            }
        }
    }
    
    //Saída
    printf("Pares: \n");
    for (int i = 0; i < cont_par; i++) {
        printf("%d \n", pares[i]);
    }

    return 0;
}