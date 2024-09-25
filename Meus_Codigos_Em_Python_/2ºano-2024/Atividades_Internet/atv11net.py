#Questão: Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
#a)O produto do dobro do primeiro com metade do segundo .
#b)A soma do triplo do primeiro com o terceiro.
#C)O terceiro elevado ao cubo.

#Camilli Honorato
#2-53 - Cedup - Cedup Curso Técnico em Informática
#Feito em: 20/09/2024
#Este programa foi feito por disposição própria e não pelo curso. Estou aplicando o conhecimento do curso juntamente
#com pesquisas online.

n1 = int(input("Informe um numero inteiro: "))
n2 = int(input("Informe mais um numero inteiro: "))
r1 = float(input("Informe um numero real: "))

a= (n1 *2)*(n2 / 2)
b= (n1 * 3)+(r1)
c= r1 * r1 * r1
print("O produto do dobro do primeiro numero com metade do segundo: %.2f"%a)
print("A soma do triplo do primeiro numero com o terceiro: %.2f"%b)
print("O terceiro numero elevado ao cubo: %.2f"%c)
