//Algoritmo que carrega um vetor de 10 números inteiros.
//Calcula e mostra números superiores a 50 e suas respectivas posições.
//Mostra uma mensagem caso não exista nenhum número nesta condição.
package com.exercicios;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        //Variáveis
        int i;
        boolean maiores_50 = false;
        int[] vetor = new int[10];
        Scanner entrada = new Scanner(System.in);

        //Entrada
        for (i = 0; i < 10; i++) {
            System.out.printf("Escreva um número inteiro para o vetor %d/10: \n", (i+1));
            vetor[i] = entrada.nextInt();
        }

        //Processamento
        for (i = 0; i < 10; i++) {
            if (vetor[i] > 50) {
                //Saída
                System.out.printf("O número %d é maior que 50 na posição %d \n", vetor[i], i);
                maiores_50 = true;
            }
        }
        if (!maiores_50) {
            //Saída 
            System.out.println("Não foram encontrados números maiores do que 50. ");
        }
        
        entrada.close();
    }   
}