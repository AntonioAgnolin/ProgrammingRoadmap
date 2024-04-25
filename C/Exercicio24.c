//Algoritmo que recebe um número indeterminado de entradas para registrar defeitos em mouses.
//Cada uma contém número de identificação do mouse, e o tipo de defeito.
//Uma identificação igual a zero encerra o programa. 
#include <stdio.h>

int main() {
    //Variáveis
    int quant_mouses = 0, necess_esfera = 0, necess_limpeza = 0,
    necess_troca = 0, quebr_inutil = 0, id_mouse, defeito;
    float perc_esfera, perc_limpeza, perc_troca, perc_quebr;

    //Entrada inicial
    printf("Digite o ID do mouse: \n");
    scanf("%d", &id_mouse);

    while (id_mouse != 0) {
        printf("1-Necessita de esfera. \n");
        printf("2-Necessita de limpeza. \n");
        printf("3-Necessita de troca do cabo ou conector. \n");
        printf("4-Quebrado ou inutilizado. \n");
        printf("Digite o defeito: \n");
        scanf("%d", &defeito);
        //Processamento
        if (defeito == 1) {
            necess_esfera = necess_esfera + 1; //Incrementa o contador de mouses com defeito de esfera
        }
        if (defeito == 2) {
            necess_limpeza = necess_limpeza + 1; //Incrementa o contador de mouses que necessitam de limpeza
        }
        if (defeito == 3) {
            necess_troca = necess_troca + 1; //Incrementa o contador de mouses com defeito no cabo
        }
        if (defeito == 4) {
            quebr_inutil = quebr_inutil + 1; // Incrementa o contador de mouses quebrados
        }
        quant_mouses = quant_mouses + 1;
        //Entrada
        printf("Digite o ID do mouse: \n");
        scanf("%d", &id_mouse);
    }

    //(float) cast
    perc_esfera = ((float)necess_esfera / (float)quant_mouses * 100);
    perc_limpeza = ((float)necess_limpeza / (float)quant_mouses * 100);
    perc_troca = ((float)necess_troca / (float)quant_mouses * 100);
    perc_quebr = ((float)quebr_inutil / (float)quant_mouses * 100);

    //Saída
    printf("Quantidade de mouses: %d \n\n", quant_mouses);
    printf("Situação \t\t\t\t\t Quantidade \t Percentual \n");
    printf("1-Necessita de esfera: \t\t\t\t\t %d \t %.2f%% \n", necess_esfera, perc_esfera);
    printf("2-Necessita de limpeza: \t\t\t\t %d \t %.2f%% \n", necess_limpeza, perc_limpeza);
    printf("3-Necessita de troca do cabo ou conector: \t\t %d \t %.2f%% \n", necess_troca, perc_troca);
    printf("4-Quebrado ou inutilizado: \t\t\t\t %d \t %.2f%% \n", quebr_inutil, perc_quebr);

    return 0;
}