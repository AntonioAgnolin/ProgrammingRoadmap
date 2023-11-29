//Algoritmo que lê a idade de um nadador e classifica em uma categoria.
#include <stdio.h>

int main() {
    //Variável
    int idade;

    //Entrada
    printf("Qual a sua idade? \n");
    scanf("%d", &idade);

    //Processamento
    if (idade >= 5 && idade <= 7) {
        printf("Infantil A. \n");
    } else if (idade >= 8 && idade <= 11) {
        printf("Infantil B. \n");
    } else if (idade >= 12 && idade <= 13) {
        printf("Juvenil A. \n");
    } else if (idade >= 14 && idade <= 17) {
        printf("Juvenil B. \n");
    } else if (idade >= 18) {
        printf("Adulto. \n");
    }
    return 0;
}