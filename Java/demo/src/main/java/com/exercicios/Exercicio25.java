//Algoritmo que carrega um vetor de 5 elementos inteiros e em seguida armazena em um vetor
//apenas os números pares maiores do que 0. No final deve mostrar os elementos do vetor na tela.
package com.exercicios;

import java.util.ArrayList;

public class Exercicio25 {
    public static void main(String[] args) {
        //Variáveis
        int i;
        ArrayList<Integer> vetor = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        //Processamento
        for (i = 0; i < 5; i++) {
            vetor.add(i);
            if (i % 2 == 0 && i > 0) {
                if (i > 0) {
                    pares.add(i);
                }
            }
        }

        //Saída
        for (Integer n : pares) {
            System.out.println(n);
        }   
    }    
}