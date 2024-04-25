//Algoritmo que lê 4 números e calcula o quadrado de cada um.
//Caso o valor resultante do quadrado do terceiro for >= 1000, imprime e finaliza.
//Caso contrário, imprime os valores lidos e seus respectivos quadrados.
#include <stdio.h>

int main() {
    //Variáveis
    int n1, n2, n3, n4, q1, q2, q3, q4;

    //Entrada
    printf("Digite o primeiro número: \n");
    scanf("%d", &n1);
    printf("Digite o segundo número: \n");
    scanf("%d", &n2);
    printf("Digite o terceiro número: \n");
    scanf("%d", &n3);
    printf("Digite o quarto número: \n");
    scanf("%d", &n4);

    //Processamento
    q1 = n1 * n1;
    q2 = n2 * n2;
    q3 = n3 * n3;
    q4 = n4 * n4;
    if (q3 > 1000) {
        //Saída
        printf("%d \n", q3);
    }else{
        //Saída
        printf("Número: %d, Quadrado: %d \n", n1, q1);
        printf("Número: %d, Quadrado: %d \n", n2, q2);
        printf("Número: %d, Quadrado: %d \n", n3, q3);
        printf("Número: %d, Quadrado: %d \n", n4, q4);
    }   
    return 0;
}