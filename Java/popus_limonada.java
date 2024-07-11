//Atividade feito na aula de Lógica de Programação, em Java e em Pop Up
//proposta da atividade foi de fazer passos lógicos, como uma receita de bolo
//Minha proposta: Uma limonada
//Autor: Camilli Honorato

import javax.swing.*;

public class popus_limonada { //Nome do programa
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Receita de: Camilli Honorato, Turma: 2-53", "Limonada", JOptionPane.INFORMATION_MESSAGE); //Pop-up de informação
        JOptionPane.showMessageDialog(null, "Olá! Seja Bem-Vindo!", "Limonada", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Aqui é um popus sobre como fazer uma limonada!",  "Limonada", JOptionPane.INFORMATION_MESSAGE);
        int resposta = JOptionPane.showConfirmDialog(null, "Vamos fazer uma limonada?","Limonada", JOptionPane.YES_NO_OPTION); //Pop-up de pergunta dim ou não
        if (resposta == JOptionPane.NO_OPTION){ //Caso não queira fazer alimonada
            JOptionPane.showMessageDialog(null, "Adeus!", "Limonada", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); //Para o programa
        }

        if(resposta == JOptionPane.YES_NO_OPTION){ //Caso queira fazer a limonada  
            JOptionPane.showMessageDialog(null, "Entao vamos começar! ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Tenha a disposição: Limões frescos, 800ml de água filtrada, gelo, liquidificador, faca e copo ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
            int liquidificador = JOptionPane.showConfirmDialog(null, "Você tem um liquidificador?","Limonada", JOptionPane.YES_NO_OPTION);
            if(liquidificador == JOptionPane.YES_NO_OPTION){  //Resposta caso tenha um liquidicador
                JOptionPane.showMessageDialog(null, "Pegue os limões, lave e coloque na bancada", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Pegue a faca e descasque os limões ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Coloque os limões na bancada e as cascas no lixo ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Corte os limões em quadrados ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Coloque a faca na pia", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Pegue o liquidificador e colque na bancada, tire a tampa ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Coloque os limões na jarra do liquidificador e 800mL da água filtrada ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Coloque o liquidificador na tomada, tampe e ligue ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Deixe bater até não ver mais os pedaços de limão ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Desligue ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Pegue um copo e coloque o gelo dentro", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Tire o liquidificador da tomada ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Tire a tampa e despeje o suco no copo ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Coloque a jarra do liquidificador na bancada e tampe ", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    int sabor = JOptionPane.showConfirmDialog(null, "Ficou com gosto bom?","Limonada", JOptionPane.YES_NO_OPTION);
                        if(sabor == JOptionPane.YES_NO_OPTION){  //Se o sabor estiver bom
                            JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                        }
                        if(sabor == JOptionPane.NO_OPTION){ //Caso o sabor não esteja bom
                            JOptionPane.showMessageDialog(null, "Tenter colocar um pouco de açucar ou misture com mais água","Limonada", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Vá fazendo isto até o gosto ficar agradavel","Limonada", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                        }
            }

            if (liquidificador == JOptionPane.NO_OPTION){//Caso não tenha um liquidificador
                int espremedor = JOptionPane.showConfirmDialog(null, "Você tem um espremedor de limão ou laranja?","Limonada", JOptionPane.YES_NO_OPTION);
                if(espremedor == JOptionPane.YES_NO_OPTION){    //Caso tenha um espremedor
                    JOptionPane.showMessageDialog(null, "Pegue os limões, lave e coloque na bancada", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Pegue a faca e corte os limões no meio", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Coloque a faca na pia", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Pegue o espremedor e coloque na bancada", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    int eletrico = JOptionPane.showConfirmDialog(null, "Ele é eletrico?","Limonada", JOptionPane.YES_NO_OPTION);
                if(eletrico == JOptionPane.YES_NO_OPTION){ //Caso seje eletrico
                    JOptionPane.showMessageDialog(null, "Encaixe o limão na parte do espremedor", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Coloque na tomada e faça o suco", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Quando o limão não soltar mais suco, jogue-o no lixo e coloque outro, repita o processo até acabar todos os limões", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Quando acabar, retire o espremedor da tomada", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Pegue um copo e coloque gelo dentro", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Despeje o suco dentro do copo", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Prove o suco", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        int sabor = JOptionPane.showConfirmDialog(null, "Ficou com gosto bom?","Limonada", JOptionPane.YES_NO_OPTION);
                            if(sabor == JOptionPane.YES_NO_OPTION){ 
                                JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                            }
                            if(sabor == JOptionPane.NO_OPTION){ 
                                JOptionPane.showMessageDialog(null, "Tenter colocar um pouco de açucar ou misture com mais água","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Vá fazendo isto até o gosto ficar agradavel","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                            }
                }

                if(eletrico == JOptionPane.NO_OPTION){ //Caso não seje eletrico
                        int jarra = JOptionPane.showConfirmDialog(null, "Ele tem jarra?","Limonada", JOptionPane.YES_NO_OPTION);
                        if(jarra == JOptionPane.YES_NO_OPTION){ //Caso tenha jarra 
                            JOptionPane.showMessageDialog(null, "Encaixe o limão na parte do espremedor", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Faça o suco", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Quando o limão não soltar mais suco, jogue-o no lixo e coloque outro, repita o processo até acabar todos os limões", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Quando acabar, lave a mão", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Pegue um copo e coloque gelo dentro do copo", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Despeje o suco no copo", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null, "Prove o suco", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                            int sabor = JOptionPane.showConfirmDialog(null, "Ficou com gosto bom?","Limonada", JOptionPane.YES_NO_OPTION);
                                if(sabor == JOptionPane.YES_NO_OPTION){ 
                                    JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                }
                                if(sabor == JOptionPane.NO_OPTION){ 
                                    JOptionPane.showMessageDialog(null, "Tenter colocar um pouco de açucar ou misture com mais água","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "Vá fazendo isto até o gosto ficar agradavel","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                }
                    }
                    if(jarra == JOptionPane.NO_OPTION){ //Caso não tenha jarra      
                        JOptionPane.showMessageDialog(null, "Pegue um copo e coloque embaixo do espremedor", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Encaixe o limão na parte do espremedor", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Faça o suco", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Quando o limão não soltar mais suco, jogue-o no lixo e coloque outro, repita o processo até acabar todos os limões", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Quando acabar, lave a mão", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Coloque gelo dentro do copo", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Prove o suco", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        int sabor = JOptionPane.showConfirmDialog(null, "Ficou com gosto bom?","Limonada", JOptionPane.YES_NO_OPTION);
                            if(sabor == JOptionPane.YES_NO_OPTION){ 
                                JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                            }
                            if(sabor == JOptionPane.NO_OPTION){ 
                                JOptionPane.showMessageDialog(null, "Tenter colocar um pouco de açucar ou misture com mais água","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Vá fazendo isto até o gosto ficar agradavel","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }}
                    if(espremedor == JOptionPane.NO_OPTION){  //Caso não tenha espremedor
                        JOptionPane.showMessageDialog(null, "Pegue os limões, lave e coloque na bancada", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Pegue a faca e corte os limões no meio", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Coloque a faca na pia", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Pegue um copo e coloque na bancada","Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Pegue um pedaço de limão e esprema com a mão, encima do copo", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Quando o limão não soltar mais suco, jogue-o no lixo e pegue outro, repita o processo até acabar todos os limões", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Quando acabar, lave sua mão", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Coloque gelo dentro do copo", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Prove o suco", "Limonada", JOptionPane.INFORMATION_MESSAGE);
                        int sabor = JOptionPane.showConfirmDialog(null, "Ficou com gosto bom?","Limonada", JOptionPane.YES_NO_OPTION);
                            if(sabor == JOptionPane.YES_NO_OPTION){ 
                                JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                            }
                            if(sabor == JOptionPane.NO_OPTION){ 
                                JOptionPane.showMessageDialog(null, "Tenter colocar um pouco de açucar ou misture com mais água","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Vá fazendo isto até o gosto ficar agradavel","Limonada", JOptionPane.INFORMATION_MESSAGE);
                                JOptionPane.showMessageDialog(null, "Tome o suco e aproveite!","Limonada", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }                    
                               
            }  
        }
    }
}
