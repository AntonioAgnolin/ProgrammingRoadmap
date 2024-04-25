//Algoritmo que soma dois números e multiplica o resultado pelo primeiro número.
#include <stdio.h> //std = standart io = input/output

int main() {
    //Variáveis
    int primeiroNum, segundoNum, soma, multiplicacao;

    //Entrada
    printf("Insira o primeiro número: \n");
    scanf("%d", &primeiroNum);
    
    printf("Insira o segundo número: \n");
    scanf("%d", &segundoNum);

    //Processamento
    soma = primeiroNum + segundoNum;

    multiplicacao = soma * primeiroNum;

    //Saída
    printf("O resultado da multiplicação dos dois números é: %d", multiplicacao);
    printf("\n");
    return 0;
}