# Algoritmo que carrega um vetor com 10 números inteiros.
# Mostra o vetor na ordem inversa a que foi digitado.

# Variável
vetor = []

# Processamento
for i in range(1, 11):
    # Entrada
    valor = int(input("Digite um valor: "))
    vetor.append(valor)

# Saída
vetor.reverse() # Inverte a lista
for i in vetor:
    print(i)