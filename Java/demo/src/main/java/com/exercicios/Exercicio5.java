//Algoritmo que converte metros para centímetros.
package com.exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Variáveis
        float metros, centimetros;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Escreva um valor em metros: ");
        metros = entrada.nextFloat();

        //Processamento
        centimetros = (metros * 100);

        //Saída
        System.out.println(metros + " metros em centímetros é: " + centimetros);
        
        entrada.close();
    }
}
