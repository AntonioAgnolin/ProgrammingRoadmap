//Algoritmo que lê um número inteiro e mostra uma mensagem indicando se 
//o número é par ou ímpar, positivo ou negativo.

package com.exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //Variáveis
        int num;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Escreva um número: ");
        num = entrada.nextInt();

        //Processamento
        if (num % 2 == 0) {
            if (num > 0) {
                System.out.printf("Número %d é par e positivo \n", num);
            } else {
                System.out.printf("Número %d é par e negativo \n", num);
            }
        } else {
            if (num > 0) {
                System.out.printf("Número %d é ímpar e positivo \n", num);
            } else {
                System.out.printf("Número %d é ímpar e negativo \n", num);
            }
        }

        entrada.close();
    }
}
