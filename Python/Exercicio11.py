# Algoritmo que calcula o peso ideal de uma pessoa, com base em sua altura e sexo informados.

# Entrada
altura = float(input("Informe a sua altura: "))
sexo = input("Informe o seu sexo (M/F): ")

# Processamento
if sexo == "M" or sexo == "m":
    peso_ideal = (72.7 * altura) - 58
elif sexo == "F" or sexo == "f":
    peso_ideal = (62.1 * altura) - 44.7
else:
    peso_ideal = None
    print("Sexo não reconhecido. ")

# Saída
if peso_ideal is not None:
    print("Seu peso ideal seria: {0:.2f}".format(peso_ideal))
else:
    print("Não foi possível calcular o peso ideal devido a sexo não reconhecido.")