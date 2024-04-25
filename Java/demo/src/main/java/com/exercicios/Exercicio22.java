//Algoritmo que lê o nome e senha de um usuário, sendo que:
//A senha não pode ser igual ao nome do usuário.
//Caso seja, mostra uma mensagem de erro e volta a pedir as informações.
package com.exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        //Variáveis
        String nome, senha;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        System.out.println("Digite a senha: ");
        senha = entrada.next();

        //Processamento
        while (nome.equals(senha)) {
            System.out.println("O nome e a senha não podem ser iguais! ");
            System.out.println("Digite seu nome: ");
            nome = entrada.next();
            System.out.println("Digite a senha: ");
            senha = entrada.next();
        }

        entrada.close();
    }
}