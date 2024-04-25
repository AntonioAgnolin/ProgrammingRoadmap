# Algoritmo que lê 4 números, calcula o quadrado de cada um, se p valor resultante do quadrado
# do terceiro for >= 1000, imprime e finaliza. Caso contrário, imprime os valores lidos e
# seus respectivos quadrados.

# Entrada
numero1 = int(input("Informe o primeiro número: "))
numero2 = int(input("Informe o segundo número: "))
numero3 = int(input("Informe o terceiro número: "))
numero4 = int(input("Informe o quarto número: "))

# Processamento
quadrado1 = numero1 * numero1
quadrado2 = numero2 * numero2
quadrado3 = numero3 * numero3
quadrado4 = numero4 * numero4

if quadrado3 >= 1000:
    print(quadrado3)
else:
    print("Num1: {0}, Quadrado: {1}".format(numero1, quadrado1))
    print("Num2: {0}, Quadrado: {1}".format(numero2, quadrado2))
    print("Num3: {0}, Quadrado: {1}".format(numero3, quadrado3))
    print("Num4: {0}, Quadrado: {1}".format(numero4, quadrado4))