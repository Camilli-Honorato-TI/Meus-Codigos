// Programa: Estacionamento Rotativo de Carro
// Este programa foi desenvolvido com base nos conhecimentos adquiridos durante o meu curso técnico de Informática, 
// complementado por pesquisas e pela aplicação de lógica própria.
// O objetivo deste projeto é aprimorar minhas habilidades em programação e expandir meu conhecimento em Java.
//Autor: Camilli Honorato
//Data: 22/11/2024
//Versão 1.1
//O que há de novo? R: o valor da hora agora é editavel.

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import javax.swing.*;

public class Estacionamento {
    private static final String FILE_PATH = "carro.txt";
    private static int valor_Hora = 0;  // Variável estática para o valor da hora

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Adicionar carro", "Pagamento", "Lista dos carros", "Valor hora", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (escolha) {
                case 0:
                    adicionarCarro();
                    break;
                case 1:
                    pagamento();
                    break;
                case 2:
                    listarCarros();
                    break;
                case 3:
                    valorHora();
                    break;
                case 4:
                    File carro = new File("carro.txt");
                    carro.delete();
                    System.exit(0);
                    break;
            }
        }
    }

    private static void valorHora() {
        valor_Hora = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da hora: "));
    }

    private static void adicionarCarro() {
        String placa = JOptionPane.showInputDialog("Informe a placa do carro:");
        String cor = JOptionPane.showInputDialog("Informe a cor do carro:");
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        int horario = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);

        Carro carro = new Carro(placa, cor, horario, minuto);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(carro.toString());
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o carro, tente novamente!");
        }
    }

    private static void pagamento() {
        String placa = JOptionPane.showInputDialog("Informe a placa do carro:");
        List<Carro> carros = lerCarros();
        boolean encontrado = false;

        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                carros.remove(carro);
                Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
                int horarioAtual = calendar.get(Calendar.HOUR_OF_DAY);
                int minutoAtual = calendar.get(Calendar.MINUTE);
                int tempo = horarioAtual - carro.getHorario();
                if (tempo <= 1) {
                    int preco = (minutoAtual - carro.getMinuto()) > 1 ? (minutoAtual - carro.getMinuto()) / 60 * valor_Hora : valor_Hora;
                    JOptionPane.showMessageDialog(null, "Preço do pagamento: R$" + preco);
                }
                if (tempo >= 2) {
                    int preco = (horarioAtual - carro.getHorario()) * valor_Hora;
                    JOptionPane.showMessageDialog(null, "Preço do pagamento: R$" + preco);
                }
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                for (Carro carro : carros) {
                    writer.write(carro.toString());
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fazer o pagamento, tente novamente!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Placa não encontrada");
        }
    }

    private static void listarCarros() {
        List<Carro> carros = lerCarros();
        if (carros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro encontrado");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (Carro carro : carros) {
            sb.append("Placa: ").append(carro.getPlaca())
              .append(" Cor: ").append(carro.getCor())
              .append(", Horario: ").append(carro.getHorario())
              .append(":").append(carro.getMinuto()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista dos carros", JOptionPane.INFORMATION_MESSAGE);
    }

    private static List<Carro> lerCarros() {
        List<Carro> carros = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                carros.add(Carro.fromString(linha));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return carros;
    }
} //Fecha o Estacionamento



