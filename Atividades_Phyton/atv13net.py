#Questão: Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
#utilizando as seguintes fórmulas:
# A)Para homens: (72.7*h) - 58
# B)Para mulheres: (62.1*h) - 44.7

#Camilli Vitória Salvaro Honorato
#Cursando Curso Técnico em Informática
#Feito em: 20/09/2024

#Este programa foi feito por disposição própria e não pelo curso. Estou aplicando o conhecimento do curso juntamente
#com pesquisas online.

def peso_ideal_homem():
    return (72.7*h)- 58

def peso_ideal_mulher():
    return (62.1*h)- 44.7

h = float(input("Informe a sua altura(Ex: 1.71):"))
genero= input("Informe seu genero: (F/M)")

if genero.upper() == 'F':
    print("Seu peso ideia é de: %.1f Kg"%peso_ideal_mulher())

if genero.upper() == 'M':
    print("Seu peso ideia é de:%.1f Kg"% peso_ideal_homem())
