# Algoritmo que gera e escreve números ímpares dos números entre 100 e 200.

# Processamento
for i in range(100, 201):
    print(i)
    if i % 2 != 0:
        print("Ímpar: {0}".format(i))