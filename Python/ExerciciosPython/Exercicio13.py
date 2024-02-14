# Algoritmo que lê variáveis 'codigo' e 'horas_trab' de um operário, calcula o salário, sabendo que:
# Ele ganha R$10 por hora. Quando exceder 50hrs, calcula o excesso de pagamento e armazenando
# na variável 'excesso'. Caso contrário, ele zera a variável. A hora excedente vale R$20.
# No final do processamento imprime o salário total e excedente.

# Variáveis
excesso = 0
valor_hora = 10.00
valor_hora_excedente = 20.00

# Entrada
codigo = float(input("Informe o código: "))
horas_trab = int(input("Informe o número de horas trabalhadas: "))

# Processamento
if (horas_trab > 50):
    excesso = (horas_trab - 50) * valor_hora_excedente
    salario = (50 * valor_hora) + excesso
    print("Salário Total R${0:.2f}".format(salario))
    print("Salário Excedente R${0:.2f}".format(excesso))
else:
    salario = (horas_trab * valor_hora)
    print("Salário Total R${0:.2f}".format(salario))
    print("Salário Excedente R${0:.2f}".format(excesso))