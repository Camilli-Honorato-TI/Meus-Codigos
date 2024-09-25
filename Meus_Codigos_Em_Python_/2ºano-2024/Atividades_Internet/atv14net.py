#Questão: João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário 
# de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca 
# do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você 
# faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a 
# quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados 
# do programa com as mensagens adequadas.

#Camilli Honorato
#2-53 - Cedup Curso Técnico em Informática
#Feito em: 25/09/2024
#Este programa foi feito por disposição própria e não pelo curso. Estou aplicando o conhecimento do curso juntamente
#com pesquisas online.

limite = 50
def valor_multa():
    return(peso - limite)* 4

def excesso_peixe():
    return peso - limite

peso = float(input("Informe quantos quilos de peixes foi pescado:"))
print(" ")

if peso > limite:
    print("---Valores de peixes---")
    print("")
    print("Peso de peixes: ", peso)
    print("Valor da multa: %.2f" %valor_multa())
    print("Quantidade de excesso de peixes:%.2f"%excesso_peixe()) 
    print(" ")


if peso <= limite:
    print("---Valores de peixes---")
    print(" ")
    print("Peso de peixes: ", peso)
    print("Não há execesso de peso, multa zerada!")
    print(" ")
