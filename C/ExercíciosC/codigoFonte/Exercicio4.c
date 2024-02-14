//Algoritmo que pede dois números e imprime a soma.
#include <stdio.h>

int main() {
    //Variáveis
    int num1, num2, soma;

    //Entrada
    printf("Insira o primeiro número: \n");
    scanf("%d", &num1);

    printf("Insira o segundo número: \n");
    scanf("%d", &num2);

    //Processamento
    soma = num1 + num2;

    //Saída
    printf("A soma dos dois números é: %d\n", soma);
    return 0;
}