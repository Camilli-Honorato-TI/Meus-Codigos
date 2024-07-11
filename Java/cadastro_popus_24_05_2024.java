//Este é um programa que foi feito na aula de Lógica de Programação, 
//que foi ensinado a como se fazer um cadastro básico em Java e em Pop up.
//Pedir as informações nescessárias e armazenalas em suas devidas variaveis.
//E tudo o que foi pedido para o usuário digitar, é armazenado em um documento separado
//Autor: Camilli Honorato

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import java.time.Period;//Importação da data do pc
import java.time.LocalDate; //Importação da data do pc

public class cadastro_popus_24_05_2024 { //Nome do cadastro, com a sua versão e com a data do dia feito
    private static final String FILE_PATH = "cadastro.txt";
    public static void main(String[] args) { 
        
        while (true) { //Loop que vai percorrer o cadastro até que o usuario decida sair
            String nome = JOptionPane.showInputDialog(null,
            "Digite o nome: ", "Cadastro de Usuário",
             JOptionPane.PLAIN_MESSAGE);
             
             if (nome == null || nome.trim().isEmpty()){ //Caso a pessoa não digite nada no campo
                JOptionPane.showMessageDialog(null,
                "Nome não pode ser vazio!",
                "Erro", JOptionPane.ERROR_MESSAGE);
                continue; //Se o nome for vazio ele continua o loop
             }

             String sobrenome = JOptionPane.showInputDialog(null,
             "Digite o sobrenome: ", "Cadastro de Usuário",
              JOptionPane.PLAIN_MESSAGE);
              
              if (sobrenome == null || sobrenome.trim().isEmpty()){
                 JOptionPane.showMessageDialog(null,
                 "Sobrenome não pode ser vazio!",
                 "Erro", JOptionPane.ERROR_MESSAGE);
                 continue;
                }

                String[] opcoesSexo = {"Masculino", "Feminino", "Outro"}; //Opções para o sexo
                String sexo = (String) JOptionPane.showInputDialog(null,
                "Selecione o sexo", "Cadastro de Usuário",
                JOptionPane.PLAIN_MESSAGE, null, opcoesSexo, opcoesSexo[0]);

                if (sexo == null) {
                    JOptionPane.showMessageDialog(null, "Sexo deve ser selecionado!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                String CPF = JOptionPane.showInputDialog(null,
        "Digite seu CPF: ", "Cadastro de Usuário",
                JOptionPane.PLAIN_MESSAGE);
             
                if (CPF == null || CPF.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,
            "CPF não pode ser vazio!",
            "Erro", JOptionPane.ERROR_MESSAGE);
                    continue;
             }

             String RG = JOptionPane.showInputDialog(null,
            "Digite seu RG: ", "Cadastro de Usuário",
             JOptionPane.PLAIN_MESSAGE);
             
             if (RG == null || RG.trim().isEmpty()){
                JOptionPane.showMessageDialog(null,
                "RG não pode ser vazio!",
                "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
             }

             String Anonasc = JOptionPane.showInputDialog(null,
            "Digite o ano que você nasceu: ", "Cadastro de Usuário",
             JOptionPane.PLAIN_MESSAGE);
             
             if (Anonasc == null || Anonasc.trim().isEmpty()){
                JOptionPane.showMessageDialog(null,
                "Ano Nacimento não pode ser vazio!",
                "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
             }

                
                salvarCadastro(nome, sobrenome,sexo, RG, CPF, Anonasc);
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra pessoa?",
                "Continuar", JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.NO_OPTION){
                    break; //Para o programa
                }
        
    }
}

//Parte em que o que foi armazenado no decorrer do programa, é salvo no arquivo cadastro.txt
    private static void salvarCadastro(String nome,  String sobrenome, String sexo, String RG, String CPF, String Anonasc){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))){
            writer.write(nome + ", " + sobrenome + ", " + sexo + ", " +RG+ ", "+CPF+ ", "+Anonasc); //Variaveis que foram preenchidas no decorrer do programa
            writer.newLine();
            JOptionPane.showMessageDialog(null,
    "Cadastro realizadocom sucesso!",
      "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
            }catch(IOException e){ //Caso haja erro para salvar os dados
                JOptionPane.showMessageDialog(null, 
        "Erro ao salvar os dados!",
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
}

}