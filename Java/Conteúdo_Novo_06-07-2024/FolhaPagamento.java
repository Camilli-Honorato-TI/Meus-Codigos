//Atividade feita na aula de lógica de programação, em Java e Pop up.
//Foi prosposto em realizar um progama em que fizesse os calculos de uma folha de pagamento
//Autor: Camilli Honorato

import javax.swing.JOptionPane; //Importação do Pop Up

public class FolhaPagamento {
  public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog("Digite o seu nome: "); //Pop up com caixa de dialogo, para o usuario digitar seu nome/ Variavel nome recebe o que o usuario digitar

      double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário bruto:")); //Popo up que recebe o valor do salario bruto da pessoa, com comandos que ajustam a variavel para que ela não de erro quando for fazer os calculos

      double inss = calcularINSS(salarioBruto); //Inss recebe o valor do salario bruto, chama a classe calculaINSS e faz os calculos já programados 

      double impostoDeRenda = calcularImpostoDeRenda(salarioBruto - inss); //ImportoDeRenda recebe o valor do salario bruto - inss, chama a classe calcularImpostoDeRenda e faz os calculos já programados 

      double salarioLiquido = salarioBruto - inss - impostoDeRenda;  //Calculo para saber o salario liquido

      String mensagem = String.format( //Mensagem que aparece para o usuario informando os resultados das contas feitas
        "Folha de pagamento de %s:\n"+ //Nome
        "Salário Bruto: R$ %.2f\n"+ 
        "Desconto INSS: R$ %.2f\n"+
        "Desconto Imposto de Renda: RS$ %.2f\n"+
        "Salário Líquido: R$ %.2f",
        nome, salarioBruto, inss, impostoDeRenda, salarioLiquido);
        JOptionPane.showMessageDialog(null, mensagem, "Folha de Pagamento", 
        JOptionPane.INFORMATION_MESSAGE);
      
  }  
  private static double calcularINSS(double salarioBruto){ //Clase para fazer o calculo do INSS
    double inss = 0.0;
    if (salarioBruto <= 1212.00){ //Se salarioBruto for menor igual que  1212.00 então faça...
      inss = salarioBruto * 0.075;
    }else if (salarioBruto <= 2427.35){ //Se não se salarioBruto for menor igual que  2427.35 então faça...
      inss = (1212.00 * 0.075) + ((salarioBruto - 1212.00) * 0.09); //Calculo para saber quanto de INSS a pessoa tem que pagar
    }else if (salarioBruto <= 3641.03){ //Se não se salarioBruto for menor igual que  3641.03 então faça...
      inss = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((salarioBruto - 2427.35) * 0.12);
    }else if(salarioBruto <= 7087.22){ //Se não se salarioBruto for menor igual que  7087.22 então faça...
      inss= (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09 )+ ((3641.03 - 2427.35) * 0.12) + ((salarioBruto - 3641.03)*0.14);
    }else{ //Senão
      inss= (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09 )+ ((3641.03 - 2427.35) * 0.12) + ((7087.22 - 3641.03)*0.14);
    }
    return inss; //Retorna para a variavel inss o resultado da execução dessa classe
  }
  private static double calcularImpostoDeRenda(double salarioBase){ //Clase para fazer o calculo do Imposto de Renda
    double impostoDeRenda = 0.0;
    if(salarioBase <= 1903.98){ //Se salarioBase for menor igual que  1903.98 então faça...
      impostoDeRenda = 0.0;
    }else if(salarioBase <= 2826.65){//Se não se salarioBase for menor igual que  2826.65 então faça...
      impostoDeRenda = (salarioBase - 1903.98) * 0.075; //Calculo para saber quanto de Imposto de renda a pessoa tem que pagar
    }else if(salarioBase <= 3751.05){ //Se não se salarioBase for menor igual que  3751.05 então faça...
      impostoDeRenda = ((2826.65 - 1903.98)* 0.075) + ((salarioBase - 2826.65) * 0.15);
    }else if(salarioBase <= 4664.68){ //Se não se salarioBase for menor igual que  4664.68 então faça...
      impostoDeRenda = ((2826.65 - 1903.98) * 0.075) + ((3751.05 - 2826.65)* 0.15) + ((salarioBase - 3751.05) * 0.275);
    }
    else{//Senão 
      impostoDeRenda = ((2826.65 - 1903.98)* 0.0775) + ((3751 - 2826.65) * 0.15) + ((4664.68 - 3751)* 0.225)+((salarioBase - 4664.68) * 0.275);
    }
    return impostoDeRenda; //Retorna para a variavel impostoDeRenda o resultado da execução dessa classe
  }
}
