# Algoritmo que lê a variável 'peso' e verifica se há excesso (50).
# Se houver, gravar na variável 'excesso' o valor da multa que deve ser paga. 
# Caso contrário mostrar tais variáveis com o conteúdo 'zero'.

# Variáveis
excesso = 0
multa = 0

# Entrada
peso = float(input("Informe o peso do peixe: "))

# Processamento
if peso > 50:
    excesso = peso - 50
    multa = excesso * 4
    # Saída
    print(f"Você deve pagar R${multa:.2f} de multa. ")
else:
    print("Sem excesso de peso, nenhuma multa aplicada.")