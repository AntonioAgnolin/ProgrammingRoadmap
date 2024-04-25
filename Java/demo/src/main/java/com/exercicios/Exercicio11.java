//Algoritmo que calcula o peso ideal baseado na altura e sexo informado.
package com.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //Variáveis
        float altura, peso_ideal;
        char sexo;
        Scanner entrada = new Scanner(System.in);

        //Entradas
        System.out.println("Informe sua altura em metros: ");
        altura = entrada.nextFloat();
        System.out.println("Informe seu sexo: (m/f) ");
        sexo = entrada.next().charAt(0);

        //Processamento
        if (sexo == 'm') {
            peso_ideal = (float)(72.7 * altura) - 58; //cast
            System.out.println(String.format("Seu peso ideal é %.2f", peso_ideal));
        } else if (sexo == 'f') {
            peso_ideal = (float)(62.1 * altura) - (float)44.7; //cast
            System.out.println(String.format("Seu peso ideal é %.2f", peso_ideal));
        } else if (sexo != 'm' && sexo != 'f') {
            System.out.println("Sexo não reconhecido. Digite 'm' ou 'f'");
            peso_ideal = 0;
        }
        entrada.close();
    }
}
