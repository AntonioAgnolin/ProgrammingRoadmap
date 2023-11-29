//Algoritmo que lê um número, se for positivo, armazena em 'a'.
//Caso seja negativo, armazena em 'b'. Mostra o resultado no final.
#include <stdio.h>

int main() {
    //Variáveis
    int numero, a, b;

    //Entrada
    printf("Insira um valor: \n");
    scanf("%d", &numero);

    //Processamento
    if (numero > 0) {
        a = numero;
        //Saída
        printf("%d é um valor positivo. \n", numero);
    }else{
        b = numero;
        //Saída
        printf("%d é um valor negativo. \n", numero);
    }
    return 0;
}