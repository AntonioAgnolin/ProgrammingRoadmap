# Algoritmo que lê 10 valores inteiros e positivos e:
# Encontra o maior valor, o menor valor e calcula a média dos números lidos.

# Variáveis
maior = -999
menor = 999
soma = 0

# Processamento
for i in range(1, 11):
    numero = int(input("Escreva um número: "))
    if numero > maior:
        maior = numero
    if numero < menor:
        menor = numero
    if numero > 0:
        soma = soma + numero

media = soma / 10

# Saída
print("O maior número é: {0}".format(maior))
print("O menor número é: {0}".format(menor))
print("A média dos números é: {0}".format(media))