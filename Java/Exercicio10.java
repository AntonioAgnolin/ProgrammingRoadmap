//Algoritmo que lê um número e verifica se ele é par ou ímpar.
//Quando for par, armazena em 'p' e quando for ímpar armazena em 'i'.
//Exibe 'p' e 'i' no final do processamento. 
package com.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //Variáveis
        int num, p = 0, i = 0;
        Scanner entrada = new Scanner(System.in);
        
        //Entrada
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        //Processamento
        if (num % 2 == 0) {
            p = num;
        }else{
            i = num;
        }

        //Saída
        System.out.println("Número par: " + p);
        System.out.println("Número ímpar: " + i);

        entrada.close();
    }
    
}
