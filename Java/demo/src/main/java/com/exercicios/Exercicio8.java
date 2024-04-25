//Algoritmo que lê uma variável numérica e imprime-a se for maior do que 100.
//Caso não seja, deve imprimir a variável com valor 0.
package com.exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {   
        //Variáveis
        int num;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        //Processamento
        if (num > 100) {
            //Saída
            System.out.println(num);
        }else{
            num = 0;
            //Saída
            System.out.println(num);
        }

    entrada.close();
    }   
}