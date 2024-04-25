# Algoritmo que lê e mostra um vetor de 20 elementos inteiros.
# Mostra a soma de todos os elementos.

# Variável
vetor = []

# Processamento
for i in range(0, 20):
    # Entrada
    valor = int(input("Digite um valor {0}/20: ".format(i+1)))
    vetor.append(valor)

# Saída
print ("A soma do vetor é: {0}".format(sum(vetor)))