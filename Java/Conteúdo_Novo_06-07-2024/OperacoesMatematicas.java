//Atividade feita na aula de lógica de programação, em Java e Pop up.
//Foi prosposto em demonstrar os quatro tipos de operações matematicas( +, -, *, /)
//realizado com dois números informados pelo usuário
//Autor: Camilli Honorato

import javax.swing.JOptionPane; //Importação do Pop Up

public class OperacoesMatematicas {
  public static void main(String[] args) {
      try{
        String primeiroNumeroString = JOptionPane.showInputDialog
        ("Digite o primeiro número (inteiro ou flutuante/real): "); //Pop-up com caixa de dialogo
        double primeiroNumero = Double.parseDouble(primeiroNumeroString); //Ajusta a variavel para não dar erro no calculo
        
        
        String segundoNumeroString = JOptionPane.showInputDialog
        ("Digite o segundo número (inteiro ou flutuante/real): "); //Pop-up com caixa de dialogo
        double segundoNumero = Double.parseDouble(segundoNumeroString); //Ajusta a variavel para não dar erro no calculo

        double soma = primeiroNumero + segundoNumero;//Soma dos dois valores
        double subtracao = primeiroNumero - segundoNumero; //Subtração dos dois valores
        double multiplicacao = primeiroNumero * segundoNumero; //Multiplicação dos dois valores 
        double divisao = (segundoNumero !=0) 
        ? primeiroNumero / segundoNumero : Double.NaN; //Divisão dos dois valores, e caso algum dos numeros seje 0 ele conseguir fazer a conta

        String mensagem = String.format
        ("Resultados das operaçãoes entre %.2f e %.2f:\n", primeiroNumero, segundoNumero); //Mostrar as duas variaveis e o texto
        mensagem += String.format("Soma: %.2f\n", soma); //Mostra o texto e a variavel da soma
        mensagem += String.format("Subtração: %.2f\n", subtracao);  //Mostra o texto e a variavel da subtração
        mensagem += String.format("Multiplicação: %.2f\n", multiplicacao); //Mostra o texto e a variavel da multiplicação
        mensagem += String.format("Divisão: %s\n", //Mostra o texto e a variavel da divisao
        (segundoNumero != 0) ? String.format("%.2f", divisao) : "Indefinida (divisão por zero)");//Se o segundo numero for 0 ele mostra essa mensagem

        JOptionPane.showMessageDialog(null, mensagem, "Resultados das Operações",
        JOptionPane.INFORMATION_MESSAGE); 
      }catch(NumberFormatException e){ //Caso uma das variaveis não seja um numero valido
        JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
      }
  }  
}
