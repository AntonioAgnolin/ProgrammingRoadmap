//Algoritmo que calcula seu salário baseado em valor da hora e horas trabalhadas.
package com.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Variáveis
        float valor_por_hora, horas_trabalhadas, salario;
        Scanner entrada = new Scanner(System.in);

        //Entradas
        System.out.println("Quanto você ganha por hora? ");
        valor_por_hora = entrada.nextFloat();
        System.out.println("Quantas horas você trabalha? ");
        horas_trabalhadas = entrada.nextFloat();

        //Processamento
        salario = (valor_por_hora * horas_trabalhadas);

        //Saída
        System.out.println("Seu salário é: R$ " + salario);

        entrada.close();
    }
}
