# Algoritmo que recebe um código numérico inteiro e um vetor de 5 posições de números reais.
# Se o código for 0, termine o programa. Se for 1, mostra o vetor na ordem direta.
# Se for 2, mostre o vetor na ordem inversa.

# Variável
vetor = []

# Entrada
codigo = int(input("Digite o código: "))

# Processamento
if codigo != 0:
    for i in range(0, 5):
        valor = float(input("Digite um valor: "))
        vetor.append(valor)
    if codigo == 1:
        for i in vetor:
            print(i)
    if codigo == 2:
        vetor.reverse() # Inverte a lista
        for i in vetor:
            print(i)