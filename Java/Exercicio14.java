//Algoritmo que lê 4 números e calcula o quadrado de cada um.
//Se o valor resultante do quadrado do terceiro for >= 1000, imprime e finaliza.
//Caso contrário, imprime valores lidos e seus respectivos quadrados.
package com.exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //Variáveis
        int n1, n2, n3, n4, q1, q2, q3, q4;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = entrada.nextInt();
        System.out.println("Digite o quarto número: ");
        n4 = entrada.nextInt();

        //Processamento
        q1 = n1 * n1;
        q2 = n2 * n2;
        q3 = n3 * n3;
        q4 = n4 * n4;

        if (q3 >= 1000) {
            System.out.println(q3);
        } else {
            //Saída
            System.out.printf("Primeiro número: %d Quadrado: %d \n", n1, q1);
            System.out.printf("Segundo número: %d Quadrado: %d \n", n2, q2);
            System.out.printf("Terceiro número: %d Quadrado: %d \n", n3, q3);
            System.out.printf("Quarto número: %d Quadrado: %d \n", n4, q4);
        }

        entrada.close();
    }
}
