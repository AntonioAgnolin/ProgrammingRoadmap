//Algoritmo que calcula o peso ideal de uma pessoa baseado em sua altura.
package com.exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //Variáveis
        float altura, peso_ideal;
        Scanner entrada = new Scanner(System.in);
        
        //Entrada
        System.out.println("Informe sua altura em metros: ");
        altura = entrada.nextFloat();

        //Processamento
        peso_ideal = (float) ((altura * 72.7) - 58); //cast

        //Saída
        System.out.println(String.format("O peso ideal para %.2fm seria %.2fkg ", altura, peso_ideal));

        entrada.close();
    }
}
