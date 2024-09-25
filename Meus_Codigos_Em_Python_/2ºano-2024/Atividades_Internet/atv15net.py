#Questão: Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
# Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
# 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
# - Salário bruto.
# - Quanto pagou ao INSS.
# - Quanto pagou ao sindicato.
# - O salário líquido.
#Calcule os descontos e o salário líquido, conforme a tabela abaixo:
# * Salário Bruto : R$
# * IR (11%) : R$
# * INSS (8%) : R$
# * Sindicato ( 5%) : R$
# * Salário Liquido : R$
# Obs.: Salário Bruto - Descontos = Salário Líquido.

#Camilli Honorato
#2-53 - Cedup Curso Técnico em Informática
#Feito em: 25/09/2024
#Este programa foi feito por disposição própria e não pelo curso. Estou aplicando o conhecimento do curso juntamente
#com pesquisas online.


ganha_hora = float(input("Quanto você ganha por hora? "))
hora_mes = float(input("Quantas horas você trabalhou no mês?"))

def salario_bruto():
    return ganha_hora* hora_mes 

def IR():
    return salario_bruto() * (11/100)

def INSS():
    return salario_bruto() * (8/100)

def sindicato():
    return salario_bruto() * (5/100)
  

def descontos():
    return IR() + INSS() + sindicato()

def salario_liquido():
    return salario_bruto() - descontos()

print("")
print("---Folha de Pagamento---")
print("")
print("- Salario Bruto: R$%.2f" %salario_bruto())
print("- IR(11%): R$ ", IR())
print("- INSS(8%): R$ ", INSS())
print("- Sindicato(5%): R$ ", sindicato())
print("- Desconto: ", descontos())
print("- Salario Liquido: R$", salario_liquido())
print("")