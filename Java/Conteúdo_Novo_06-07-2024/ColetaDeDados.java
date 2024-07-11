//Atividade feita na aula de lógica de programação, em Java e Pop up.
//Foi prosposto em demonstrar todos os tipos de pop up que foram aprendidos em sala.
//Tipo texto, numero inteiro, numero real, e boolean. E Mostrar o que foi armazenado durante
//a execução do programa.
//Autor: Camilli Honorato

import javax.swing.JOptionPane; //Importação do Pop Up

public class ColetaDeDados{
  public static void main(String[]args){

    String texto = JOptionPane.showInputDialog("Digite um valor para \n uma variavel do tipo \n String'texto:'");
    //Digitar um texto (String)

    int inteiro = Integer.parseInt(JOptionPane.showInputDialog
    ("Digite um valor para \n uma variavel do tipo inteiro \n ex:'numero indivisivel/sem virgula'"));
    //Digitar um número inteiro(int) ex:4; 56; 99.

    double pontoFlutuante = Double.parseDouble(JOptionPane.showInputDialog
    ("Digite um valor para \n uma variavel do tipo float/real \n ex:'numero divisivel'"));
    //Digitar um número real(com ou sem vircula) ex:5; 89,3; 7,0;

    int respostaBoolean = JOptionPane.showConfirmDialog(null,
    "\"escolha uma opção para \n uma variavel do tipo boleano \n",
    "Escolha", JOptionPane.YES_NO_OPTION);
    boolean booleano = (respostaBoolean == JOptionPane.YES_OPTION);
    //Escolher uma opção entre sim e não(boolean)

    String mensagem = String.format
    ("var. String: %s\nvar. inteiro: %d\nvar. Float/real: %.2f\nvar. boleana: %b",
    texto, inteiro, pontoFlutuante, booleano);
    JOptionPane.showMessageDialog(null, mensagem, "Dados Inseridos",
    JOptionPane.INFORMATION_MESSAGE);
    //Mostra todos os dados digitados
  }
}