# Algoritmo que lê 2 vetores de 10 posições e faz a soma de elementos do mesmo índice.
# Coloca o resultado em um terceiro vetor. Mostra o vetor resultante.

# Variáveis
vetor1 = []
vetor2 = []
soma = []

# Processamento
for i in range(1, 11):
    # Entrada
    valor1 = int(input("Digite um valor para o primeiro vetor: "))
    vetor1.append(valor1)
    valor2 = int(input("Digite um valor para o segundo vetor: "))
    vetor2.append(valor2)
    soma.append(valor1 + valor2)

# Saída
for i in soma:
    print(i)