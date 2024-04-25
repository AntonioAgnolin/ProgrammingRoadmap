//Algoritmo que lê 10 valores inteiros e positivos.
//Encontra o maior valor, o menor e calcula a média dos números lidos.
#include <stdio.h>

int main() {
    //Variáveis
    int n, i, maior = -999, menor = 999, soma = 0;
    float media;

    for (i = 0; i < 10; i++) {
            //Entrada
            printf("Digite um número: \n");
            scanf("%d", &n);
        //Processamento
        if (n > 0) {
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
            soma = soma + n;
        }else{
            printf("Número inválido. O número deve ser inteiro e positivo.\n");
            i--; //Decrementa para repetir a iteração
        }
    }
    media = soma / 10;
    //Saida
    printf("O maior número é: %d \n", maior);
    printf("O menor número é: %d \n", menor);
    printf("A média dos números é: %2.f \n", media);
    return 0;
}