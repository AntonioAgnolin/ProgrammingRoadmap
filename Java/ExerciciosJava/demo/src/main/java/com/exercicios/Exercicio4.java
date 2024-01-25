//Algoritmo que pede dois números e imprime a soma.
package com.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Variáveis
        int num1, num2, soma;
        Scanner entrada = new Scanner(System.in);

        //Entradas
        System.out.println("Digite o primeiro número:");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        //Processamento
        soma = (num1 + num2);

        //Saída
        System.out.println("A soma dos dois números é: " + soma);

        entrada.close();
    }
}
