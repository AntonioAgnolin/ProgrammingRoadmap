//Algoritmo que lê um nome e senha de um usuário.
//Não aceita a senha que for igual ao nome do usuário. 
//Mostra uma mensagem de erro e volta a pedir informações.
#include <stdio.h>
#include <string.h>

int main() {
    //Variáveis
    char nome[100], senha[100];

    //Entrada
    printf("Insira seu nome: \n");
    fgets(nome, sizeof(nome), stdin);
    nome[strcspn(nome, "\n")] = '\0'; //Remove a quebra de linha ao final do nome

    printf("Insira uma senha: \n");
    fgets(senha, sizeof(senha), stdin);
    senha[strcspn(senha, "\n")] = '\0'; //Remove a quebra de linha ao final da senha

    //Processamento
    while (!strcmp(senha, nome)) { //Recebe dois strings e compara para ver se eles são iguais
        printf("A senha não pode ser igual ao nome! \n");

        printf("Insira seu nome: \n");
        fgets(nome, sizeof(nome), stdin);
        nome[strcspn(nome, "\n")] = '\0'; //Remove a quebra de linha ao final do nome

        printf("Insira uma senha: \n");
        fgets(senha, sizeof(senha), stdin);
        senha[strcspn(senha, "\n")] = '\0'; //Remove a quebra de linha ao final da senha
    }
    printf("O cadastro foi realizado com sucesso! \n");
    return 0;
}