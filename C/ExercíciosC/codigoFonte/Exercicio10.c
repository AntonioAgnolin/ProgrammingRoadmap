//Algoritmo que lê um número e verifica se ele é par ou ímpar.
//Quando for par, armazenar em 'p', se for ímpar, armazenar em i.
//Exibe 'p' e 'i' no final do processamento.
#include <stdio.h>

int main() {
    //Variáveis
    int num, p = 0, i = 0;

    //Entrada
    printf("Insira um número: \n");
    scanf("%d", &num);

    //Processamento
    if (num % 2 == 0) { //% é módulo
        p = num;
    }else{
        i = num;
    }
    //Saída
    printf("%d\n", p);
    printf("%d\n", i);
    return 0;
}