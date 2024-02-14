//Algoritmo que determina qual é o maior número dentre os números inseridos.
//A condição de parada é a entrada de um número 0.
#include <stdio.h>

int main() {
    //Variáveis
    int n, maior = 0;

    //Entrada
        printf("Digite um número: \n");
        scanf("%d", &n);

    //Processamento
    while (n != 0) {
        if (n > maior) {
            maior = n;            
        }
        //Entrada
        printf("Digite um número: \n");
        scanf("%d", &n);
    }
    printf("Maior número: %d \n", maior);
    return 0;
}