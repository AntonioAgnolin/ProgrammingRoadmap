//Algoritmo que lê 2 vetores de 10 posições e faz a soma de elementos do mesmo índice.
//Coloca o resultado em um terceiro vetor. Mostra o vetor resultante.
package com.exercicios;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        //Variáveis
        int i;
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] soma = new int[10];
        Scanner entrada = new Scanner(System.in);

        //Entrada
        for (i = 0; i < 10; i++) {
            System.out.println("Insira o valor do primeiro vetor: ");
            vetor1[i] = entrada.nextInt();
            System.out.println("Insira o valor do segundo vetor: ");
            vetor2[i] = entrada.nextInt();
            //Processamento
            soma[i] = vetor1[i] + vetor2[i];
        }

        //Saída
        for (i = 0; i < 10; i++) {
            System.out.println(soma[i]);
        }

        entrada.close();
    }
}
