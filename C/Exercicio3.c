//Algoritmo que calcula estoque médio de uma peça sendo que:
//Estoque médio é igual a soma da quantidade minima à quantidade máxima dividido por dois.
#include <stdio.h>

int main() {
    //Variáveis
    int quantidade_minima, quantidade_maxima;
    float estoque_medio;
    char peca [30]; 

    //Entrada
    printf("Qual é o nome da peça? \n");
    scanf("%s", &peca); //%s é para strings

    printf("Insira a quantidade mínima: \n");
    scanf("%d", &quantidade_minima); //%d é para int

    printf("Insira a quantidade máxima: \n");
    scanf("%d", &quantidade_maxima); //& é para obter o endereço da variável

    //Processamento
    estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
    
    //Saída
    printf("O estoque médio de %s é: %.2f\n", peca, estoque_medio); //%f é para float (.2 deixa com apenas 2 casa depois do ponto 0.00)
    return 0;
}