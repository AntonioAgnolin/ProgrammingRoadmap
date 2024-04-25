//Algoritmo que calcula o peso ideal, baseado em sua altura e sexo.
#include <stdio.h>
#include <ctype.h> //Para a função tolower

int main() {
    //Variáveis
    float altura, peso_ideal;
    char sexo;

    //Entrada
    printf("Informe sua altura em metros: \n");
    scanf("%f", &altura);
    while (getchar() != '\n'); //Limpa o buffer do input

    printf("Informe seu sexo (m/f): \n");
    scanf("%c", &sexo);

    //Processamento
     if (tolower(sexo) == 'm') { //tolower transforma o input em letra minúscula
        peso_ideal = (72.7 * altura) - 58;
        //Saída
        printf("Seu peso ideal é %.2f \n", peso_ideal);
    } else if (tolower(sexo) == 'f') {
        peso_ideal = (62.1 * altura) - 44.7;
        //Saída
        printf("Seu peso ideal é %.2f \n", peso_ideal);
    } else {
        //Saída
        printf("Sexo não reconhecido. \n");
    }
    return 0;
}