# Algoritmo que classifica um nadador em uma categoria baseado na idade.

# Entrada
idade = int(input("Informe sua idade: "))

# Processamento
if idade >= 5 and idade <= 7:
    print("Categoria Infantil A. ")
elif idade >= 8 and idade <= 11:
    print("Categoria Infantil B. ")
elif idade >= 12 and idade <= 13:
    print("Categoria Juvenil A. ")
elif idade >= 14 and idade <= 17:
    print("Categoria Juvenil B. ")
elif idade >= 18:
    print("Categoria Adulto")