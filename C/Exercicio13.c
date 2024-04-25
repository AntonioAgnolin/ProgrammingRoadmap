//Algoritmo que lê as variáveis 'codigo' e 'horas_trabalhadas' de um operário.
//Calcula o salário sendo que ele ganha R$10 por hora.
//Quando o número de horas exceder a 50, calcula o excesso de pagamento e armazena em 'excedente'.
//Caso contrário, zera a variável. A hora excedente vale R$20.
//No final imprime o salário total e o excedente.
#include <stdio.h>

int main() {
    //Variáveis
    int codigo;
    float horas_trabalhadas, excedente = 0, valor_hora = 10, salario_total;
    
    //Entrada
    printf("Digite o código: \n");
    scanf("%d", &codigo);

    printf("Digite o número de horas trabalhadas: \n");
    scanf("%f", &horas_trabalhadas);

    //Processamento
    if (horas_trabalhadas > 50) {
        excedente = (horas_trabalhadas - 50) * 20;
        salario_total = (50 * valor_hora) + excedente;
        //Saída
        printf("Salário: R$ %.2f \n", salario_total);
        printf("Excedente: R$ %.2f \n", excedente);
    }else{
        //Saída
        salario_total = horas_trabalhadas * valor_hora;
        printf("Salário: R$ %.2f \n", salario_total);
        printf("Excedente: R$ %.2f \n", excedente);
    }
    return 0;
}