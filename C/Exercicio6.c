//Algoritmo que pergunta quanto você ganha por hora e número de horas trabalhadas por mês.
//Calcula e mostra o total do seu salário referido no mês.
#include <stdio.h>

int main() {
    //Variáveis
    int horas_trabalhadas;
    float salario_hora, salario_mes;

    //Entrada
    printf("Informe a quantidade de horas trabalhadas: \n");
    scanf("%d", &horas_trabalhadas);

    printf("Informe o valor por hora trabalhada: \n");
    scanf("%f", &salario_hora);

    //Processamento
    salario_mes = (horas_trabalhadas * salario_hora);

    //Saída
    printf("O total do seu salário no mês equivale a: R$ %.2f\n", salario_mes);
    return 0;
}