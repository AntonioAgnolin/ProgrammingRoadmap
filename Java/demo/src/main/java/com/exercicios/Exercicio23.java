//Algoritmo gerador de tabuada de qualquer número inteiro entre 1 e 10.
package com.exercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        //Variáveis
        int i, num;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Informe um número: ");
        num = entrada.nextInt();

        //Processamento
        while (num < 1 || num > 10) {
            System.out.println("O número deve ser maior que 1 e menor do que 10! ");
            System.out.println("Informe um número: ");
            num = entrada.nextInt();
        }

        //Saída
        for (i = 0; i <= 10; i++) {
            System.out.printf("%d X %d = %d \n", num, i, (num * i));
        }

        entrada.close();
    }
}