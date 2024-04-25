//Algoritmo que recebe um código numérico inteiro e um vetor de 5 posições de números reais.
//Se o código for 0, termine o programa. Se for 1, mostra o vetor na ordem direta.
//Se for 2, mostre o vetor na ordem inversa.
package com.exercicios;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        //Variáveis
        int i, codigo;
        float[] vetor = new float[5];
        Scanner entrada = new Scanner(System.in);
        
        //Entrada
        System.out.println("Insira o código: ");
        codigo = entrada.nextInt();

        //Processamento
        if (codigo != 0 && codigo <= 2) {
            for (i = 0; i < 5; i++) {
                System.out.println("Informe um número real: ");
                vetor[i] = entrada.nextFloat();
            }
            if (codigo == 1) {
                for (i = 0; i < 5; i++) {
                    System.out.println(vetor[i]);
                }
            }
            if (codigo == 2) {
                for (i = (vetor.length - 1); i >= 0; i--) {
                    System.out.println(vetor[i]);
                }
            }
        }
        
        entrada.close();
    }   
}