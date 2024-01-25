//Algoritmo que lê 10 valores inteiros e positivos e:
//Encontra o maior valor, o menor valor e calcula a média dos números lidos.
package com.exercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        //Variáveis
        int i, valor, maior = -999, menor = 999, soma = 0;
        float media;
        Scanner entrada = new Scanner(System.in);

        //Processamento
        for (i = 0; i < 10; i++) {
            //Entrada
            System.out.println("Informe um valor: ");
            valor = entrada.nextInt();
            
            if (valor > 0) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
                soma = soma + valor;
            } else {
                i--;
            }
        }
        
        media = (float) soma / 10;
        
        //Saída
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos números é: " + media);
        
        entrada.close();
    }
}