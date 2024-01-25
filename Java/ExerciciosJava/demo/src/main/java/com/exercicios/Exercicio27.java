//Algoritmo que carrega um vetor com 10 números inteiros.
//Mostra o vetor na ordem inversa a que foi digitado.
package com.exercicios;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        //Variáveis
        int i;
        int[] vetor = new int[10];
        Scanner entrada = new Scanner(System.in);

        //Entrada
        for (i = 0; i < 10; i++) {
            System.out.println("Insira o valor para o vetor: ");
            vetor[i] = entrada.nextInt();
        }

        //Saída na ordem inversa
        for (i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        entrada.close();
    }
}
