//Algoritmo que lê o peso dos peixes e verifica se há excesso de peso.
//Se houver, ele calcula a multa que deverá ser paga.
package com.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //Variáveis
        float peso, multa;
        String excesso;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Informe o peso do peixe: ");
        peso = entrada.nextInt();

        //Processamento
        if (peso > 50) {
            multa = (float)(peso - 50) * (float)4.00;
            //Saída
            System.out.println(String.format("Você deve pagar R$ %.2f de multa.", multa));
        }else{
            multa = 0;
            excesso = "0";
            //Saída
            System.out.println("Multa: " + multa);
            System.out.println("Excesso: " + excesso);
        }
        entrada.close();
    }
}
