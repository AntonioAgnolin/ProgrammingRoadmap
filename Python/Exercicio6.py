# Algoritmo que pergunta quanto você ganha por hora e o número de horas trabalhadas no mês.
# Calcula e mostra o total do seu salário no referido mês.

# Entrada
horas_trab = int(input("Quantas horas por mês você trabalha? "))
valor_hora = float(input("Quanto você ganha por hora? "))

# Processamento
salario = (horas_trab * valor_hora)

# Saída
print(f"O seu salário é de R${salario}")