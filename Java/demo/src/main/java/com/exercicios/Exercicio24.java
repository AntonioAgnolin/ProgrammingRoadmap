//Algoritmo que recebe um número indeterminado de entradas para registrar defeitos em mouses.
//Cada uma contém número de identificação do mouse, e o tipo de defeito.
//Uma identificação igual a zero encerra o programa.
package com.exercicios;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        //Variáveis
        int quant_mouses = 0, id_mouse, defeito, necess_esfera = 0, 
        necess_limpeza = 0, necess_cabo = 0, quebr_inutil = 0;
        float perc_esfera, perc_limpeza, perc_cabo, perc_quebr;
        Scanner entrada = new Scanner(System.in);

        //Entrada inicial
        System.out.println("Digite o ID do mouse: ");
        id_mouse = entrada.nextInt();

        while (id_mouse != 0) {
            System.out.println("1-Necessita de esfera. ");
            System.out.println("2-Necessita de limpeza. ");
            System.out.println("3-Necessita de troca do cabo ou conector. ");
            System.out.println("4-Quebrado ou inutilizado. ");
            System.out.println("Digite o defeito: ");
            defeito = entrada.nextInt();

            //Processamento
            if (defeito == 1) {
                necess_esfera = necess_esfera + 1; //Incrementa o contador de mouses com defeito de esfera
            }
            if (defeito == 2) {
                necess_limpeza = necess_limpeza + 1; //Incrementa o contador de mouses que necessitam de limpeza
            }
            if (defeito == 3) {
                necess_cabo = necess_cabo + 1; //Incrementa o contador de mouses com defeito no cabo
            }
            if (defeito == 4) {
                quebr_inutil = quebr_inutil + 1; //Incrementa o contador de mouses quebrados
            }

            quant_mouses = quant_mouses + 1;

            //Entrada
            System.out.println("Digite o ID do mouse: ");
            id_mouse = entrada.nextInt();
        }

        //(float) cast
        perc_esfera = ((float)necess_esfera / (float)quant_mouses * 100);
        perc_limpeza = ((float)necess_limpeza / (float)quant_mouses * 100);
        perc_cabo = ((float)necess_cabo / (float)quant_mouses * 100);
        perc_quebr = ((float)quebr_inutil / (float)quant_mouses * 100);

        //Saída
        System.out.printf("Quantidade de mouses: %d\n", quant_mouses);
        System.out.printf("Situação \t\t\t\t Quantidade \t Percentual\n");
        System.out.printf("1-Necessita de esfera: \t\t\t\t %d \t %.2f%%\n", necess_esfera, perc_esfera);
        System.out.printf("2-Necessita de limpeza: \t\t\t %d \t %.2f%%\n", necess_limpeza, perc_limpeza);
        System.out.printf("3-Necessita de troca do cabo ou conector: \t %d \t %.2f%%\n", necess_cabo, perc_cabo);
        System.out.printf("4-Quebrado ou inutilizado: \t\t\t %d \t %.2f%%\n", quebr_inutil, perc_quebr);
        
        entrada.close();
    }
}