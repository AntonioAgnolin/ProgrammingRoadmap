//Algoritmo que lê o índice de poluição medido e emite uma notificação.
package com.exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        //Variáveis
        float poluicao;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o índice de poluição medido: ");
        poluicao = entrada.nextFloat();

        //Processamento
        if (poluicao >= 0.3 && poluicao < 0.4) {
            System.out.println("GRUPO 1 - SUSPENDER ATIVIDADES");
        } else if (poluicao >= 0.4 && poluicao < 0.5) {
            System.out.println("GRUPO 1 E 2 - SUSPENDER ATIVIDADES");
        } else if (poluicao >= 0.5) {
            System.out.println("TODOS OS GRUPOS DEVEM SUSPENDER SUAS ATIVIDADES");
        } else {
            System.out.println("Níveis aceitáveis ");
        }
        
        entrada.close();
    }   
}