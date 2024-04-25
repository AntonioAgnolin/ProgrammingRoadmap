# Algoritmo que conta de 1 a 100 e a cada múltiplo de 10 emite uma mensagem.

# Processamento
for i in range(1, 101):
    print(i)
    if i % 10 == 0:
        print("Múltiplo de 10: {0}".format(i)) 