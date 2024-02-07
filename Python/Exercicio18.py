# Algoritmo que determina o maior entre n números sendo que a condição de parada é um valor 0.

# Variável
maior = 0

# Entrada
numero = int(input("Escreva um número: "))

# Processamento
while numero != 0:
    if numero > maior:
        maior = numero
    numero = int(input("Escreva um número: "))
print("O maior número é o {0}".format(maior))