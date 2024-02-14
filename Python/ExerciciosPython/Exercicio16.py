# Algoritmo que lê o índice de poluição medido e emite uma notificação.

# Entrada
poluicao = float(input("Informe o índice de poluição: "))

# Processamento
if poluicao >= 0.3 and poluicao < 0.4:
    print("GRUPO 1 - SUSPENDER ATIVIDADES")
elif poluicao >= 0.4 and poluicao < 0.5:
    print("GRUPO 1 E 2 - SUSPENDER ATIVIDADES")
elif poluicao >= 0.5:
    print("TODOS OS GRUPOS DEVEM SUSPENDER SUAS ATIVIDADES")