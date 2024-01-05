//Algoritmo que determina o maior entre n números sendo que a condição de parada é um valor 0. 
package com.exercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        //Variáveis
        int num, maior = 0;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Escreva um número: ");
        num = entrada.nextInt();

        //Processamento
        while (num != 0) {
            if (num > maior) {
                maior = num;
            }
            System.out.println("Escreva um número: ");
            num = entrada.nextInt();
        }
        
        //Saída
        System.out.println("O maior valor é: " + maior);

        entrada.close();
    }
}