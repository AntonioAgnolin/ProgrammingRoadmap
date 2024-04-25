# Algoritmo que calcula o estoque médio de uma peça.

# Entrada
nome_peca = (input("Informe o nome da peça: "))
quant_min = int(input("Informe a quantidade mínima: "))
quant_max = int(input("Informe a quantidade máxima: "))

# Processamento
soma = quant_min + quant_max
media = soma / 2

# Saída
print(f"O estoque médio de {nome_peca} é: {media}")