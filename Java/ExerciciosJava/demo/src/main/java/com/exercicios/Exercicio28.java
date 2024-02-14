//Algoritmo que lê e mostra um vetor de 20 elementos inteiros.
//Mostra a soma de todos os elementos.
package com.exercicios;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        //Variáveis
        int i, soma = 0;
        int[] vetor = new int[20];
        Scanner entrada = new Scanner(System.in);

        //Entrada
        for (i = 0; i < 20; i++) {
            System.out.printf("Insira o valor para o vetor %d/20: \n", (i+1));
            vetor[i] = entrada.nextInt();
            soma = soma + vetor[i];
        }

        //Saída
        System.out.println("A soma dos 20 valores é igual a: " + soma);
        
        entrada.close();
    }
}