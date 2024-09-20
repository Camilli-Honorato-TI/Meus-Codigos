#Camilli Honorato
#2-53 - Cedup - Cedup Curso Técnico em Informática
#Feito em: 20/09/2024

#Velocidade(km/h) Velocidade Constante
#Posicao inicial(km) Posição inicial
#Tempo(h) Instante

Velocidade = float(input("Informe a velocidade(km/h): "))
Tempo = float(input("Informe o tempo(h): "))
Posicao_inicial = float(input("Informe  a posição inicial(Km): "))

def funcao_horaria():
    return Posicao_inicial + Velocidade * Tempo

print("A posição final é: %.2f"%funcao_horaria())