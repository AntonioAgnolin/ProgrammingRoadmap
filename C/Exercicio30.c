//Algoritmo que recebe um código numérico inteiro e um vetor de 5 posições de números reais.
//Se o código for 0, termine o programa. Se for 1, mostra o vetor na ordem direta.
//Se for 2, mostre o vetor na ordem inversa.
#include <stdio.h>

int main() {
    //Variáveis
    int codigo, i;
    float vetor[5];

    //Entrada
    printf("Digite o código: \n");
    scanf("%d", &codigo);

    //Processamento
    if (codigo == 1 || codigo == 2) {
        for (i = 0; i < 5; i++) {
            //Entrada
            printf("Digite um número real: \n");
            scanf("%f", &vetor[i]);
        }
        if (codigo == 1) {
            printf("Ordem direta: \n");
            for (i = 0; i < 5; i++) {
                //Saída
                printf("%.2f \n", vetor[i]);
            }
        }
        else {
            printf("Ordem inversa: \n");
            for (i = 4; i >= 0; i--) {
                //Saída
                printf("%.2f \n", vetor[i]);
            }
        }
    } else if (codigo == 0) {
        printf("O programa foi encerrado.\n");
    } else {
        printf("Este código não é válido. Digite apenas 1, 2 ou 0.\n");
    }
    return 0;
}