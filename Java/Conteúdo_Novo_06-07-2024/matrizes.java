//Atividade feita na aula de lógica de programação, em Java e Pop up.
//Foi prosposto em demonstrar como se funciona uma matriz.
//Autor: Camilli Honorato

import javax.swing.JOptionPane; //Importação do Pop Up

public class matrizes {
    public static void main(String[] args) {
        String inputLinha = JOptionPane.showInputDialog("Insira o número de linhas da matriz: "); //Pop up de pergunta para saber quantas linhas que o usuario quer no vetor
        int linhas = Integer.parseInt(inputLinha); //Converte a variavel string para uma variavel int
        String inputColunas = JOptionPane.showInputDialog("Insira o número de colunas da matriz: "); //Pop up de pergunta para saber quantas colunas que o usuario quer no vetor
        int colunas = Integer.parseInt(inputColunas); //Converte a variavel string para uma variavel int
        int[][] matriz = new int[linhas][colunas]; //Declara a matriz conforme o usuario informou
        for (int i = 0; i < linhas; i++){  //Declara a variavel i. Enquanto i for menor que linhas. Icrementa mais 1 a i. Então faça..
          for(int j = 0; j < colunas; j++){ //Declara a variavel j. Enquanto j for menor que colunas. Icrementa mais 1 a j. Então faça..
            String inputValor = JOptionPane.showInputDialog
            ("Insira o valor para a posição [" + i + "][" + j + "]:");
            matriz[i][j] = Integer.parseInt(inputValor); //Mensagem que informar para o usuario em qual linha ou coluna em que ele está armazenando a informação
          }
        }
        StringBuilder matrizStr = new StringBuilder("Matriz preenchida: \n"); //Mensagem que informa o usúario que a matriz foi preenchida
        for(int i = 0; i < linhas; i++){ //Declara a variavel i. Enquanto i for menor que linhas. Icrementa mais 1 a i. Então faça..
          for(int j = 0; j < colunas; j++){ //Declara a variavel j. Enquanto j for menor que colunas. Icrementa mais 1 a j. Então faça..
            matrizStr.append(matriz[i][j]).append(" "); // Variavel que adiciona a mensagem(um espaçinho) em cada linha e coluna
          }
        }
        JOptionPane.showMessageDialog(null, matrizStr.toString()); //Mensagem que mostra o que está armazenado na variavel
    }
}
