//Este é um programa que foi feito na aula de Lógica de Programação, 
//que foi ensinado a como se fazer um cadastro básico em Java.
//Pedir as informações nescessárias e armazenalas em suas devidas variaveis.
// Mostrar o que foi armazenado durante a execução do programa para o usuário. 
//Autor: Camilli Honorato

import java.util.*; //Importação do Java para rodar o Scanner
class cadastro17_05_2024{ //Nome do cadastro, e com a data do dia feito
public static void main(String[] args) {
      Scanner var = new Scanner(System.in);
      String nome, sobrenome, sexo; //Variaveis que armazenam palavras
      char genero; //Variavel que armazena uma letra

      System.out.print("Informe seu nome: "); //Mostra o que está escrito entre as aspas na tela para o usuario
      nome = var.nextLine(); //Campo onde o usuario escreve, e armazena o que foi escrito na variavel

      System.out.print("Digite seu sobrenome: "); //Mostra o que está escrito entre as aspas na tela para o usuario
      sobrenome = var.nextLine(); //Campo onde o usuario escreve, e armazena o que foi escrito na variavel

      System.out.print("Digite seu gênero: (F) ou (M) "); //Mostra o que está escrito entre as aspas na tela para o usuario
      genero = var.next().charAt(0); //Campo onde o usuario escreve, e armazena o que foi escrito na variavel(Esse é diferente porque o Scanner não suporta o Char)

      if(genero == 'F' || genero == 'f'){ //Condição de SE
        sexo = "Feminino" ; //Se condição for verdadeira ele armazena a palavra feminino na variavel sexo.
      }else if(genero == 'M' || genero == 'm'){ //Condição de SE SENÃO
        sexo = "Masculino"; //Se condição for verdadeira ele armazena a palavra masculino na variavel sexo.
      }else{//Condição de SENÃO
      sexo = "Indefinido"; //Se condição for falsa ele armazena a palavra indefinido na variavel sexo.
      }

      System.out.println("Nome: "+nome); //Mostra o que está escrito entre as aspas na tela para o usuario/ O que está escrito fora das aspas no +, é a uma variavel, e mostra na tela o que tem armazenada nela
      System.out.println("Sobrenome: "+sobrenome);
      System.out.println("Gênero: "+sexo);

}
}