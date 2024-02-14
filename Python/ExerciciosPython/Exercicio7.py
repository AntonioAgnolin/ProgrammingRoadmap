# Algoritmo que calcula o peso ideal de uma pessoa baseado em sua altura.

# Entrada
altura = float(input("Qual é a sua altura? "))

# Processamento
peso_ideal = (altura * 72.7) - 58

# Saída
print("Seu peso ideal seria {0:.2f}kg".format(peso_ideal))