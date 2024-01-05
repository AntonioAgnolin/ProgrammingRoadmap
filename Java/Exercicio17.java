//Algoritmo que classifica um nadador em uma categoria baseado na idade.
package com.exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
    //Variáveis
    int idade;
    Scanner entrada = new Scanner(System.in);

    //Entrada
    System.out.println("Informe sua idade: ");
    idade = entrada.nextInt();

    //Processamento
    if (idade >= 5 && idade <= 7) {
        System.out.println("Categoria Infantil A. ");
    } else if (idade >= 8 && idade <= 11) {
        System.out.println("Categoria Infantil B. ");
    } else if (idade >= 12 && idade <= 13) {
        System.out.println("Categoria Juvenil A. ");
    } else if (idade >= 14 && idade <= 17) {
        System.out.println("Categoria Juvenil B. ");
    } else if (idade >= 18) {
        System.out.println("Categoria Adulto. ");
    }

    entrada.close();
    }
}
