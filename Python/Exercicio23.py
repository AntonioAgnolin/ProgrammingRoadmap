# Algoritmo gerador de tabuada de qualquer número inteiro entre 1 e 10.

# Entrada
numero = int(input("Escreva um número de 1 a 10: "))

# Processamento
while numero < 1 or numero > 10:
    print("Deve ser um número entre 1 e 10! ")
    numero = input("Escreva um número: ")
print("Tabuada de {0}".format(numero))
for i in range(1, 11):
    print("{0} x {1} = {2}".format(numero, i, (numero * i)))