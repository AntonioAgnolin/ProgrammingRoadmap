//Algoritmo que gera e escreve números ímpares dos números entre 100 e 200.
package com.exercicios;

public class Exercicio20 {
    public static void main(String[] args) {
        //Variável
        int i;

        //Processamento
        for (i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println("Ímpar: " + i);
            }
        }
    }
}