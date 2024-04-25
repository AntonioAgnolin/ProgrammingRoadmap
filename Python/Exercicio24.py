# Algoritmo que recebe um número indeterminado de entradas para registrar defeitos em mouses.
# Cada uma contém número de identificação do mouse, e o tipo de defeito.
# Uma identificação igual a zero encerra o programa.

# Variáveis
quant_mouses = 0
necess_esfera = 0
necess_limpeza = 0
necess_cabo = 0
quebr_inutil = 0

# Entrada
id_mouse = int(input("Digite o ID do mouse: "))

# Processamento
while id_mouse != 0:
    print("1-Necessita de esfera. ")
    print("2-Necessita de limpeza. ")
    print("3-Necessita de troca do cabo ou conector. ")
    print("4-Quebrado ou inutilizado. ")

    # Entrada
    defeito = int(input("Digite o defeito: "))

    # Processamento
    if defeito == 1:
        necess_esfera = necess_esfera + 1
    elif defeito == 2:
        necess_limpeza = necess_limpeza + 1
    elif defeito == 3:
        necess_cabo = necess_cabo + 1
    elif defeito == 4:
        quebr_inutil = quebr_inutil + 1
    quant_mouses = quant_mouses + 1

    # Entrada
    id_mouse = int(input("Digite o ID do mouse: "))

    porcentagem1 = necess_esfera / quant_mouses * 100.0
    porcentagem2 = necess_limpeza / quant_mouses * 100.0
    porcentagem3 = necess_cabo / quant_mouses * 100.0
    porcentagem4 = quebr_inutil / quant_mouses * 100.0

# Saída
print("Quantidade de mouses: {0}".format(quant_mouses))
print("Situação                                  Quantidade   Percentual")
print("1-Necessita de esfera:                        {0}        {1:.2f}%".format(necess_esfera, porcentagem1))
print("2-Necessita de limpeza:                       {0}        {1:.2f}%".format(necess_limpeza, porcentagem2))
print("3-Necessita de troca do cabo ou conector:     {0}        {1:.2f}%".format(necess_cabo, porcentagem3))
print("4-Quebrado ou inutilizado:                    {0}        {1:.2f}%".format(quebr_inutil, porcentagem4))