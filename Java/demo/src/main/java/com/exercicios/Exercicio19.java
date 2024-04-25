//Algoritmo que conta de 1 a 100 e a cada múltiplo de 10 emite uma mensagem.
package com.exercicios;

public class Exercicio19 {
    public static void main(String[] args) {
        //Variável
        int i;

        //Processamento
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i % 10 == 0) {
                System.out.println("Múltiplo de 10: " + i);
            }
        }
    }
}