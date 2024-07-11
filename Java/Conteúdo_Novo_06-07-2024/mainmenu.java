//Esté é um menu feito na aula de Lógica de programação, em Java
//Foi reunido todos os progamadas feitos durante um certo periodo de tempo.
//Foram reunidos para melhor organização, saber quantos programas já feitos e quais.
//Autor: Camilli Honorato

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class mainmenu {
    public static void main(String[] args) {
        //Criação do frame principal
        JFrame frame = new JFrame("Menu Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(470, 370);
        frame.setLayout(new BorderLayout());

        //Criação da barra de menu
        JMenuBar menuBar =  new JMenuBar();
        
        //Criação do menu
        JMenu menu = new JMenu("Opções");
        menuBar.add(menu);

        //Criação dos itens do menu
        JMenuItem ColetaDeDadosItem = new JMenuItem("Coleta de Dados/Variaveis"); //Opção do menu
        JMenuItem ConcatenacaoValoresItem = new JMenuItem("Concatenação de Valores");
        JMenuItem FolhaPagamentoItem = new JMenuItem("Folha de Pagamento");
        JMenuItem OperacoesMatematicasItem = new JMenuItem("Operações matematicas");
        JMenuItem DiferencaParaCemItem = new JMenuItem("Diferença de cem");
        JMenuItem VetorItem = new JMenuItem("Vetor");
        JMenuItem matrizesItem = new JMenuItem("Matriz");

        //Adicionando os arquivos das opções do menu
        menu.add(ColetaDeDadosItem);
        menu.add(ConcatenacaoValoresItem);
        menu.add(FolhaPagamentoItem);
        menu.add(OperacoesMatematicasItem);
        menu.add(DiferencaParaCemItem);
        menu.add(VetorItem);
        menu.add(matrizesItem);

        //Adicionando ActionListener para cada item de menu
        ColetaDeDadosItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ColetaDeDados.main(null); //Chama o arquivo ColetaDeDado.java
            }
        });

        ConcatenacaoValoresItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConcatenacaoValores.main(null); //Chama o arquivo ConcatenacaoValores.java
            }
        });

        FolhaPagamentoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FolhaPagamento.main(null); //Chama o arquivo FolhaPagamento.java
            }
        });

        OperacoesMatematicasItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OperacoesMatematicas.main(null); //Chama o arquivo OperacoesMatematicas.java
            }
        });

        DiferencaParaCemItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DiferencaParaCem.main(null); //Chama o arquivo DiferancaParaCem.java
            }
        });

        VetorItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vetor.main(null); //Chama o arquivo Vetor.java
            }
        });

        matrizesItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                matrizes.main(null); //Chama o arquivo matrizes.java
            }
        });

        //Adicionando a barra de menu ao frame
        frame.setJMenuBar(menuBar);

        //Criação do painel para o botão de sair
        JPanel panel = new JPanel();
        JButton sairButton = new JButton("Sair");

        //Adicionando ActionListener para o botão de sair
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0); //Sai do programa
            }
        });

        //Adicionando o botão ao painel
        panel.add(sairButton);

        //Adicionando o painel ao frame
        frame.add(panel, BorderLayout.SOUTH);

        //Confirgurando o frame para ser visível
        frame.setVisible(true);
    }
}