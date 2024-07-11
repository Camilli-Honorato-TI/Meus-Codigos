//Este é um programa que foi feito na aula de Lógica de Programação, 
//que foi ensinado a como se fazer um cadastro básico em Java.
//Pedir as informações nescessárias e armazenalas em suas devidas variaveis
// Mostrar o que foi armazenado durante a execução do programa para o usuário. 
//E tudo o que foi pedido para o usuário digitar, é armazenado em um documento separado
//Autor: Camilli Honorato

import java.time.Period;//Importação da data do pc
import java.time.LocalDate; //Importação da data do pc
import java.util.*; //Importação do Java para rodar o Scanner
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;  //Importação do Scanner para ler as o que está sendo digitado pelo usuário

class cadastro_5_21_05_2024{  //Nome do cadastro, com a sua versão e com a data do dia feito
public static void main(String[] args) {
      Scanner var = new Scanner(System.in);
      //Declaração das variaveis
      String nome, sobrenome, sexo, rg, endereco,anonasc, cpf; //Variaveis que armazenam palavras
      float salario; //Variavel que armazena numeros reais
      char genero; //Variavel que armazena uma letra

      //Parte que o usuario interage com o sistema
      System.out.print("Informe seu nome: "); //Mostra o que está escrito entre as aspas na tela para o usuario
      nome = var.nextLine(); //Campo onde o usuario escreve, e armazena o que foi escrito na variavel

      System.out.print("Digite seu sobrenome: "); 
      sobrenome = var.nextLine(); 

      System.out.print("Digite seu gênero: (F) ou (M) "); 
      genero = var.next().charAt(0);//Esse é diferente porque o Scanner não suporta o Char

      if(genero == 'F' || genero == 'f'){ //Condição de SE
        sexo = "Feminino" ; //Se condição for verdadeira ele armazena a palavra feminino na variavel sexo.
      }else if(genero == 'M' || genero == 'm'){ //Condição de SE SENÃO
        sexo = "Masculino"; //Se condição for verdadeira ele armazena a palavra masculino na variavel sexo.
      }else{//Condição de SENÃO
      sexo = "Indefinido"; //Se condição for falsa ele armazena a palavra indefinido na variavel sexo.
      }

      System.out.print("Digite seu CPF: ");
      cpf = var.next();

      System.out.print("Digite seu endereço: ");
      endereco = var.next();

      System.out.print("Digite seu salario: ");
      salario = var.nextFloat();

      System.out.print("Digite seu RG: ");
      rg = var.next();

      System.out.print("Informe sua data de nascimento no formato AAAA-MM-DD: ");
      anonasc = var.next();
      
      //Local para transformar a data na idade no dia atual, com extensões que le a data do pc
      LocalDate DataNascimento = LocalDate.parse(anonasc);
      LocalDate dataAtual = LocalDate.now();
      Period periodo = Period.between(DataNascimento, dataAtual);
      int idade = periodo.getYears();
      
      //Mostra as informações que foram preenchidas no decorrer do programa
      System.out.println("Nome: "+nome); //Mostra o que está escrito entre as aspas na tela para o usuario/ O que está escrito fora das aspas no +, é a uma variavel, e mostra na tela o que tem armazenada nela
      System.out.println("Sobrenome: "+sobrenome);
      System.out.println("Gênero: "+sexo); 
      System.out.println("CPF: "+cpf);
      System.out.println("Endereço: "+endereco);
      System.out.println("Salário: "+salario);
      System.out.println("RG: "+rg);
      System.out.println("Ano de nascimento: "+anonasc);
      System.out.println("Idade: "+idade);

      salvarCadastro(nome, sobrenome, sexo, cpf, endereco, salario, rg, anonasc, idade); //Salva as variaveis que foram preenchidas no decorrer do programa e que foram escolhidas para serem salvas no arquivo cadastroDEcliente.txt

      System.out.println("Cadastro salvo com sucesso!");

}
//Salva as variaveis que foram preenchidas no decorrer do programa
public static void salvarCadastro(String nome, String sobrenome, String sexo, String cpf, String endereco, float salario, String rg, String anonasc, int idade){
  try{
    FileWriter FileWriter = new FileWriter("cadastroDEcliente.txt", true);
    PrintWriter printWriter = new PrintWriter(FileWriter);

    printWriter.println("Nome: " +nome); //Salva o nome da pessoa no arquivo
    printWriter.println("Sobrenome: "+sobrenome);
    printWriter.println("Gênero: "+sexo);
    printWriter.println("CPF: "+cpf);
    printWriter.println("Endereço: "+endereco);
    printWriter.println("Salário: "+salario);
    printWriter.println("RG: "+rg);
    printWriter.println("Ano de nascimento: "+anonasc);
    printWriter.println("Idade: "+idade);
    printWriter.close();
  }catch (IOException e){ //Caso haja erro para salvar os dados
    System.out.println("Erro ao salvar o cadastro: " +e.getMessage());
  }
}
} 
