//Algoritmo que calcula o estoque médio de uma peça.
package com.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Variáveis
        String nome_peca;
        int quantidade_min, quantidade_max;
        float estoque_med;
        Scanner entrada = new Scanner(System.in);

        //Entradas
        System.out.println("Qual é o nome da peça? ");
        nome_peca = entrada.nextLine();
        System.out.println("Qual é a quantidade mínima desta peça? ");
        quantidade_min = entrada.nextInt();
        System.out.println("Qual é a quantidade máxima desta peça? ");
        quantidade_max = entrada.nextInt();

        //Processamento
        estoque_med = (quantidade_min + quantidade_max) / 2;

        //Saída
        System.out.println(String.format("O estoque médio de %s é %.2f ", nome_peca, estoque_med));
        //String.format permite usar marcador de posições da string e do float

        entrada.close();
    }
}
