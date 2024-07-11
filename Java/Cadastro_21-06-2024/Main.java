//Este é um programa que foi feito na aula de Lógica de Programação, 
//que foi ensinado a como se fazer um cadastro básico/intermediario em Java e Pop Up.
//Pedir as informações nescessárias e armazenalas em suas devidas variaveis.
//E tudo o que foi pedido para o usuário digitar, é armazenado em um documento separado
//O cadastro tem a opção de cadastradar um novo usuário, atualizar um usuário ja cadastrado e listar usuáros ja cadastrados
//Autor: Camilli Honorato

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Main{
  private static final String FILE_PATH = "usuarios.txt";

  public static void main(String[] args) {
    while(true){
      String[] options = {"Adicionar Usuário", "Atualizar Usuário", "Listar Usuários", "Sair"}; //Opções do menu
      int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção",
      "Menu",
          JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

      switch (escolha) { //Opções de escolha
        case 0: //Caso opção seje 0 faça um cadastro de usuário 
          adicionarUsuario();
          break; //pare a execução
        case 1: //Caso opção seje 1 faça a atualização de usuário
          atualizarUsuario(); 
          break;

        case 2: //Caso a opção seja 2 faça a listagem de usuários
          listarUsuarios();
          break;
        
        case 3: //Caso a opção seja 3, sair
          System.exit(0);
          break;

        default: //Caso a opção seja diferente de 0, 1, 2 ou 3
          JOptionPane.showMessageDialog(null, "Opção inválida!");

      }

    }
  }

  private static void adicionarUsuario(){ //Caso a opção seja 0 faça um cadastro de usuário
    String nome = JOptionPane.showInputDialog("Nome:");
    String idadeStr = JOptionPane.showInputDialog("Idade:");
    int idade = Integer.parseInt(idadeStr);
    String cpf = JOptionPane.showInputDialog("CPF:");

    Usuario usuario = new Usuario(nome, idade, cpf);
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
      writer.write(usuario.toString());
      writer.newLine();
      JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
    } catch (IOException e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro ao adicionar usuário.");
    }
  }

  private static void atualizarUsuario() { //Caso a opção seja 1 faça a atualização de usuário
    String cpf = JOptionPane.showInputDialog("CPF do usuário a ser atualizada:");

    List<Usuario> usuarios = lerUsuarios();
    boolean encontrado = false;

    for (Usuario usuario : usuarios) { //Atualização do usuario
      if (usuario.getCpf().equals(cpf)){
        String nome = JOptionPane.showInputDialog("Novo Nome:");
        String idadeStr = JOptionPane.showInputDialog("Nova Idade:");
        int idade = Integer.parseInt(idadeStr);

        usuarios.remove(usuario);
        usuarios.add(new Usuario(nome, idade, cpf));
        encontrado = true;
        break;

      }
    }

    if(encontrado){ //Caso o usuário seja encontrado
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))){
        for(Usuario usuario : usuarios){ 
          writer.write(usuario.toString());
          writer.newLine();
        }
        JOptionPane.showMessageDialog(null, "Usuário atualizado com Sucesso.");
      }catch(IOException e){ //Caso haja erro ao salvar
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao atualizar usuário ");
      }
    }else{ //Caso o usuário não seja encontrado
      JOptionPane.showMessageDialog(null,"Usuário não encontrado");
    }
  }

  private static void listarUsuarios(){ //Caso a opção seja 2 faça a listagem de usuários
    List<Usuario> usuarios = lerUsuarios();
    if(usuarios.isEmpty()){
      JOptionPane.showMessageDialog(null, "Nenhum usuário encontrado:");
      return;
    }

    StringBuilder sb = new StringBuilder();
    for(Usuario usuario : usuarios){
      sb.append("Nome: ").append(usuario.getNome())
      .append(", Idade: ").append(usuario.getIdade())
      .append(", CPF:").append(usuario.getCpf()).append("\n");
    }
    JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Usuários",
    JOptionPane.INFORMATION_MESSAGE);
  }

  private static List<Usuario> lerUsuarios(){
    List<Usuario> usuarios = new ArrayList<>();

    try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))){
      String linha;
      while((linha = reader.readLine()) != null) {
        usuarios.add(Usuario.fromString(linha));
      }
    } catch(IOException e){
      e.printStackTrace();
    }

    return usuarios;
  }
}