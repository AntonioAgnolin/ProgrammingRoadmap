//Algoritmo que lê uma variável numérica e imprime, na condição de que:
//Somente se o número for maior que 100, caso contrário irá imprimir 0.
#include <stdio.h>

int main() {
    //Variáveis
    int numero;

    //Entrada
    printf("Insira um número: \n");
    scanf("%d", &numero);

    //Processamento
    if (numero > 100){
        //Saída
        printf("%d \n", numero);
    }else{
        numero = 0;
    }
    return 0;
}