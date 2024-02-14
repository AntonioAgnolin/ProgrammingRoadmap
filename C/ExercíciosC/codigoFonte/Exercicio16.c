//Algoritmo que lê o índice de poluição medido e emite uma notificação.
#include <stdio.h>

int main() {
    //Variável
    float poluicao;

    //Entrada
    printf("Informe o índice de poluição medido: \n");
    scanf("%f", &poluicao);
    
    //Processamento
    if (poluicao >= 0.3 && poluicao < 0.4) {
        printf("GRUPO 1 - SUSPENDER ATIVIDADES \n");
    } else if (poluicao >= 0.4 && poluicao < 0.5) {
        printf("GRUPO 1 E 2 - SUSPENDER ATIVIDADES \n");
    } else if (poluicao >= 0.5) {
        printf("TODOS OS GRUPOS DEVEM SUSPENDER SUAS ATIVIDADES \n");
    } else {
        printf("Níveis aceitáveis \n");
    }
    return 0;
}