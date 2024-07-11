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
        JMenuItem olamundo14_05_24Item = new JMenuItem("Olá mundo em Java"); //Opção do menu
        JMenuItem Popus24_05_2024Item = new JMenuItem("Olá Mundo Popup");
        JMenuItem cadastro17_05_2024Item = new JMenuItem("Primeiro Cadastro em Java");
        JMenuItem cadastro_2_17_05_2024Item = new JMenuItem("Segundo Cadastro em Java");
        JMenuItem cadastro_3_17_05_2024Item = new JMenuItem("Terceiro Cadastro em Java");
        JMenuItem cadastro_4_17_05_2024Item = new JMenuItem("Quarto Cadastro em Java");
        JMenuItem cadastro_5_21_05_2024Item = new JMenuItem("Quinto Cadastro em Java");
        JMenuItem cadastro_popus_24_05_2024Item = new JMenuItem("Primeiro Cadastro em Popus");
        JMenuItem nossopopusItem = new JMenuItem("Nosso cadastro em Popus");


        //Adicionando os arquivos das opções do menu
        menu.add(olamundo14_05_24Item);
        menu.add(Popus24_05_2024Item);
        menu.add(cadastro17_05_2024Item);
        menu.add(cadastro_2_17_05_2024Item);
        menu.add(cadastro_3_17_05_2024Item);
        menu.add(cadastro_4_17_05_2024Item);
        menu.add(cadastro_5_21_05_2024Item);
        menu.add(cadastro_popus_24_05_2024Item);
        menu.add(nossopopusItem);

        //Adicionando ActionListener para cada item de menu
        olamundo14_05_24Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                olamundo14_05_24.main(null); //Chama o arquivo olamundo14_05_24.java
            }
        });

        Popus24_05_2024Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Popus24_05_2024.main(null); //Chama o arquivo Popus24_05_2024.java
            }
        });

        cadastro17_05_2024Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro17_05_2024.main(null); //Chama o arquivo cadastro17_05_2024.java
            }
        });

        cadastro_2_17_05_2024Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro_2_17_05_2024.main(null); //Chama o arquivo cadastro_2_17_05_2024.java
            }
        });

        cadastro_3_17_05_2024Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro_3_17_05_2024.main(null); //Chama o arquivo cadastro_3_17_05_2024.java
            }
        });

        cadastro_4_17_05_2024Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro_4_17_05_2024.main(null); //Chama o arquivo cadastro_4_17_05_2024.java
            }
        });

        cadastro_5_21_05_2024Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro_5_21_05_2024.main(null); //Chama o arquivo cadastro_5_21_05_2024.java
            }
        });

        cadastro_popus_24_05_2024Item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro_popus_24_05_2024.main(null); //Chama o arquivo cadastro_popus_24_05_2024.java
            }
        });

        nossopopusItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nossopopus.main(null); //Chama o arquivo nossopopus.java
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