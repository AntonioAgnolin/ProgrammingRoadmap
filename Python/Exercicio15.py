# Algoritmo que lê um número inteiro e mostra uma mensagem indicando se 
# o número é par ou ímpar, positivo ou negativo.

# Entrada
numero = int(input("Escreva um número: "))

# Processamento
if numero % 2 == 0:
    if numero > 0:
        print("Número {0} é par e positivo. ".format(numero))
    else:
        print("Numero {0} é par e negativo. ".format(numero))
else:
    if numero > 0:
        print("Numero {0} é ímpar e positivo. ".format(numero))
    else:
        print("Numero {0} é ímpar e negativo. ".format(numero))