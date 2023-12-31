//Algoritmo que lê o código e horas trabalhadas de um operário e calcula o salário,
//sabendo que ele ganha R$10 por hora. Quando o número de horas exceder 50, calcula
//o excesso de pagamento e armazena. Caso contrário, ele zera.
//A hora excedente de trabalho vale R$20. No final mostra o salário total e excedente. 

package com.exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //Variáveis
        int codigo;
        float horas_trab, salario, excesso = 0, valor_hora = (float) 10.00f;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o código: ");
        codigo = entrada.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        horas_trab = entrada.nextFloat();

        //Processamento
        if (horas_trab > 50) {
            excesso = (horas_trab - 50) * 20.00f;
        }

        salario = 50 * valor_hora + excesso;

        //Saída
        System.out.printf("Código: %d \n", codigo);
        System.out.printf("O salário total é: R$ %.2f \n", salario);
        System.out.printf("O salário excedente é: R$ %.2f \n", excesso);

        entrada.close();
    }
    
}
