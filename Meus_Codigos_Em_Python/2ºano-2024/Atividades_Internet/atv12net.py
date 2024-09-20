#Questão: Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
#usando a seguinte fórmula: (72.7*altura) - 58

#Camilli Honorato
#2-53 - Cedup Curso Técnico em Informática
#Feito em: 20/09/2024

altura = float(input("Informe a altura: "))

def peso_ideal():
    return (72.7*altura) - 58

print("O seu peso ideal é: %.2f"% peso_ideal())