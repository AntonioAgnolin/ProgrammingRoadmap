//Algoritmo que lê a variável 'peso' e verifica se há excesso (50).
//Se houver, gravar na variável 'excesso' o valor da multa que deve ser paga. 
//Caso contrário mostrar tais variáveis com o conteúdo 'zero'.
#include <stdio.h>

int main() {
    //Variáveis
    float peso, multa;
    char excesso[8] = "excesso"; //Array de 8 elementos

    //Entrada
    printf("Informe o peso do peixe: \n");
    scanf("%f", &peso);
    
    //Processamento
    if (peso > 50) {
        multa = (peso - 50) * 4.00;
        //Saída
        printf("Você deve pagar R$ %.2f de multa. \n", multa);
    }else{
        multa = 0;
        excesso[0] = 0;
        //Saída
        printf("Multa: %.2f \n", multa);
        printf("Excesso: %d \n", excesso[0]); 
    }
    return 0;
}