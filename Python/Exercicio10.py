# Algoritmo que lê um número e verifica se ele é par ou ímpar. 
# Quando for par, armazena em valor 'p' e quando for ímpar, armazena em 'i'. 
# Exibir 'p' e 'i' no final do processamento.

# Variáveis
p = 0
i = 0

# Entrada
num = int(input("Insira um número: "))

# Processamento
if num % 2 == 0:
    p = num
else:
    i = num

# Saída
print(f"Número par: {p}")
print(f"Número ímpar: {i}")