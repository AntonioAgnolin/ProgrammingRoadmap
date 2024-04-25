# Algoritmo que carrega um vetor de 5 elementos inteiros e em seguida armazena em um vetor
# apenas os números pares maiores do que 0. No final deve mostrar os elementos do vetor na tela.

# Variáveis
vetor = [] # Lista vazia
pares = [] # Lista vazia

# Processamento
for i in range(1, 6):
    vetor.append(i)
    if i % 2 == 0:
        pares.append(i)
for p in pares:
    print(p)