# Algoritmo que lê o nome e senha de um usuário, sendo que:
# A senha não pode ser igual ao nome do usuário.
# Caso seja, mostra uma mensagem de erro e volta a pedir as informações.

# Entrada
nome = input("Escreva seu nome: ")
senha = input("Escreva sua senha: ")

# Processamento
while senha == nome:
    print("A senha e o nome não pode ser iguais! ")
    nome = input("Escreva seu nome: ")
    senha = input("Escreva sua senha: ")