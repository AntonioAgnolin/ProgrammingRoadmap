# Algoritmo que lê um número. Se for positivo, armazena em 'a', e se for negativo, em 'b'.
# Mostra o resultado no final.

# Entrada
num = int(input("Informe um número: "))

# Processamento
if num > 0:
    a = num
    tipo = "positivo"
else:
    b = num
    tipo = "negativo"

# Saída
print(f"Valor {tipo}: {num}")