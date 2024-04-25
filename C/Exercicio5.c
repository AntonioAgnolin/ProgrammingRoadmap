//Algoritmo que converte metros para centímetros.
#include <stdio.h>

int main() {
    //Variáveis
    int metros, centimetros;

    //Entrada
    printf("Insira um valor em metros: \n");
    scanf("%d", &metros);

    //Processamento
    centimetros = (metros * 100);

    //Saída
    printf("%d metros convertido para centímetros equivale a: %d\n", metros, centimetros);
    return 0;
}