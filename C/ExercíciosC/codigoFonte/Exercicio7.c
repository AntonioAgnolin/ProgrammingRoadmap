//Algoritmo que calcula o peso ideal de uma pessoa, baseado em sua altura.
#include <stdio.h>

int main() {
    //Variáveis
    float altura, peso_ideal;   

    //Entrada
    printf("Informe sua altura em metros: \n");
    scanf("%f", &altura);

    //Processamento
    peso_ideal = (altura * 72.7) - 58;

    //Saída
    printf("Seu peso ideal de seria %.2f kg\n", peso_ideal);
    return 0;
}