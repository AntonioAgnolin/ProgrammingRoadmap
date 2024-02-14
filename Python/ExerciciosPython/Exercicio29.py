# Algoritmo que carrega um vetor de 10 números inteiros.
# Calcula e mostra números superiores a 50 e suas respectivas posições.
# Mostra uma mensagem caso não exista nenhum número nesta condição.

# Variáveis
vetor = []
maiores_50 = False

# Processamento
for i in range(0, 10):
    # Entrada
    valor = int(input("Digite um valor {0}/10: ".format(i+1)))
    vetor.append(valor)

# Verifica valores maiores que 50 e suas posições
for i, valor in enumerate(vetor):
    if valor > 50:
        print("Valor {0} maior que 50 na posição {1}".format(valor, i))
        maiores_50 = True

# Se nenhum valor for maior que 50, mostra uma mensagem
if not maiores_50:
    print("Não existem valores maiores do que 50.")