//Atividade feita na aula de lógica de programação, em Java e Pop up.
//Foi prosposto em demonstrar a concateção de dois valores, e mostrar a resposta final.
//Autor: Camilli Honorato

import javax.swing.JOptionPane; //Importação do Pop Up

public class ConcatenacaoValores {
  
  public static void main(String[] args){

    String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor: ");
    //Digitar o primeiro valor
    String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor: ");
    //Digitar o segundo valor
    String resultado = primeiroValor + segundoValor;
    //Concatenação(junção dos dois valores)

    JOptionPane.showMessageDialog(null,
    "Resultado da concatenação: "+ resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    //Mostra o resultado da concatenação

  }

}
