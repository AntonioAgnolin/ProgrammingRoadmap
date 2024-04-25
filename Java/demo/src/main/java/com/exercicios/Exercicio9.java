//Algoritmo que lê um número. Se for positivo, armazena-o em 'a'.
//Se for negativo, armazena-o em 'b'.
package com.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        //Variáveis
        int num, a = 0, b = 0;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        //Processamento
        if (num > 0) {
            a = num;
            //Saída
            System.out.println("O valor é positivo. ");
            System.out.println(a);
        }
        if (num < 0) {
            b = num;
            //Saída
            System.out.println("O valor é negativo. ");
            System.out.println(b);
        }
        entrada.close();
    }
    
}
