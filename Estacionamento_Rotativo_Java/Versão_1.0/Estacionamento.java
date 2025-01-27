// Programa: Estacionamento Rotativo de Carro
// Este programa foi desenvolvido com base nos conhecimentos adquiridos durante o meu curso técnico de Informática, 
// complementado por pesquisas e pela aplicação de lógica própria.
// O objetivo deste projeto é aprimorar minhas habilidades em programação e expandir meu conhecimento em Java.
//Autor: Camilli Honorato
//Data: 30/07/2024
//Versão 1.0

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import javax.swing.*;

public class Estacionamento{
    private static final String FILE_PATH = "carro.txt";
    public static void main(String[] args){
        while(true){
            String[] options = {"Adicionar carro", "Pagamento", "Lista dos carros","Sair"}; //Opções do Menu
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); //Menu

            switch(escolha){ //Sintaxe de escolha
                case 0:
                    adicionarCarro(); //Escolha que adiciona o carro
                    break;
                case 1:
                    pagamento();//Escolha para realizar o pagamento do tempo em que o carro ficou no rotativo
                    break;
                case 2:
                    listarCarros(); //Lista os carros que estão no pátio do rotativo e que forma cadastrados
                    break;
                case 3:
                File carro = new File("carro.txt"); //Armaze o caminho do arquivo "carros.txt"
                carro.delete(); //Deleta o arquivo "carros.txt"
                System.exit(0); //Fecha o programa
                break;
            }
        }
    }

    private static void adicionarCarro(){//Programa caso a opção seja adicionarCarro 
        String placa = JOptionPane.showInputDialog("Informe a placa do carro:"); //Mensagem com caixa de dialogo
        String cor = JOptionPane.showInputDialog("Informe a cor do carro:");
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East")); //Puxa o horario do pc
        int horario = calendar.get(Calendar.HOUR_OF_DAY);//Puxa o horario do pc
        int minuto = calendar.get(Calendar.MINUTE);//Puxa os minutos do pc
    
        Carro carro = new Carro(placa, cor, horario, minuto);//Variaveis que vão ser armazenadas
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) { //Puxando o arquivo
            writer.write(carro.toString());//Armazenando as variaveis no arquivo
            writer.newLine();//Adiciona uma nova linha no arquivo
            JOptionPane.showMessageDialog(null,"Carro cadastrado com sucesso!"); //Mensagem de notificação para o usuario
        }catch(IOException e){ //Caso ocorra algum erro para salvar o arquivo
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o carro, tente novamente!");
        }
    }
    
    private static void pagamento(){//Programa caso a opção seja pagamento 
    String placa = JOptionPane.showInputDialog("Informe a placa do carro:");
    List<Carro> carros = lerCarros(); //Lista os carros
    boolean encontrado = false; //Não encontrado ainda

    for (Carro carro : carros) { //Caso a placa esteja cadastrada
      if (carro.getPlaca().equals(placa)){
        carros.remove(carro);//Remove o carro da lista para não ser encontrado novamente
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
            int horarioAtual = calendar.get(Calendar.HOUR_OF_DAY); //Puxa horario atual em formato 24hr
            int minutoAtual = calendar.get(Calendar.MINUTE); //Puxa minuto atual
            int tempo = horarioAtual - carro.getHorario(); //Conta para descobrir quanto tempo o carro ficou no estacionamento
            if (tempo <= 1){ //Caso a pessoa deixe seu carro no rotativo menos ou igual a 1 hora
            int preco = (minutoAtual - carro.getMinuto())/60  * 3; //Conta feita para saber o valor a ser pago
                JOptionPane.showMessageDialog(null,"Preço do pagamento: R$" + preco); //Mensagem que informa o preço a ser pago
            }
            if(tempo >= 2){//Caso a pessoa deixe seu carro acima de 1 hora
                int preco = (horarioAtual - carro.getHorario()) * 3;
                JOptionPane.showMessageDialog(null,"Preço do pagamento: R$" + preco);
            }
        encontrado = true; //Encontrado
        break;       
      }
    }
    if(encontrado){ //Caso a placa seja encontrado
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))){
          for(Carro carro : carros){ 
            writer.write(carro.toString());//Atualiza o arquivo "carro.txt"
            writer.newLine();//Escreva uma nova linha

        }  
      }catch(IOException e){ //Caso haja erro ao executar o programa
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Erro ao fazer o pagamento, tente novamente!");
      }
      }else{ //Caso a placa não seja encontrado
          JOptionPane.showMessageDialog(null,"Placa não encontrada");
      }
      }

    private static void listarCarros(){
        List<Carro> carros = lerCarros();
        if(carros.isEmpty()){
            JOptionPane.showMessageDialog(null,"Nenhum carro encontrado");
            return;
        }
    
        StringBuilder sb = new StringBuilder();
        for(Carro carro : carros){
            sb.append("Placa: ").append(carro.getPlaca())
            .append(" Cor: ").append(carro.getCor())
            .append(", Horario: ").append(carro.getHorario())
            .append(":").append(carro.getMinuto()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista dos carros", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static List<Carro> lerCarros(){
        List<Carro> carros = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))){
           String linha;
           while((linha = reader.readLine()) != null){
            carros.add(Carro.fromString(linha));
           } 
        } catch(IOException e){
            e.printStackTrace();
        }
    return carros;
    }

}//Fecha o Estacionamento


