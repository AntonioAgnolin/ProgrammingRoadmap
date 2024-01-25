//Algoritmo que soma dois números e multiplica o resultado pelo primeiro número.
package com.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Variáveis
        int num1, num2, soma, multiplicacao;
        Scanner entrada = new Scanner(System.in);

        //Entradas
        System.out.println("Informe o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        //Processamento
        soma = num1 + num2;
        multiplicacao = soma * num1;

        //Saída
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        
        entrada.close();
    }
}
