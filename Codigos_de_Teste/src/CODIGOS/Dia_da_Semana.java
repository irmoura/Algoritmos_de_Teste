/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.JOptionPane;

/**
 *
 * @author IBS F25
 */
public class Dia_da_Semana {
    
    public static Double A, B, C, D, ano_de_nascimento, ano_padrao, soma;
    public static String Ano_Nascimento, Mes_Nascimento, Dia_Nascimento;
    public static int Ano_Nascimento_Int, Mes_Nascimento_Int, Dia_Nascimento_Int;
    
    public static void main(String args[]){
        
        Ano_Nascimento = JOptionPane.showInputDialog(null,"Digite o seu ano de nascimento: "+ "\n(ex: 1989)");
        
        Ano_Nascimento_Int = Integer.parseInt(Ano_Nascimento);
        
        Mes_Nascimento = JOptionPane.showInputDialog(null,"Digite o seu mês de nascimento: "+ "\n(ex: 12)");
        
        Mes_Nascimento_Int = Integer.parseInt(Mes_Nascimento);
        
        Dia_Nascimento = JOptionPane.showInputDialog(null,"Digite o seu dia de nascimento: "+ "\n(ex: 30)");
        
        Dia_Nascimento_Int = Integer.parseInt(Dia_Nascimento);
        
        ano_de_nascimento = Double.parseDouble(Ano_Nascimento);
        ano_padrao = Double.parseDouble("1900");//Não deve ser alterado
        
        A = ano_de_nascimento - ano_padrao;
        
        if(!(Ano_Nascimento_Int % 4 == 0)){//NÃO SENDO BISSEXTO
            B = A / 4;
        }
        else
        if(
          (Ano_Nascimento_Int % 4 == 0) && (Mes_Nascimento_Int  > 2)
          ){//SENDO BISSEXTO
            B = A / 4;
        }
        else
        if(
          (Ano_Nascimento_Int % 4 == 0) && (Mes_Nascimento_Int  < 3) && (Dia_Nascimento_Int  == 29) ||
          (Ano_Nascimento_Int % 4 == 0) && (Mes_Nascimento_Int  < 3) && (Dia_Nascimento_Int  < 29)
          ){//SENDO BISSEXTO
            B = A / 4;
            B -= 1;
        }
        
        if(Mes_Nascimento.equals("01")){
            C = Double.parseDouble("0");
        }
        else
        if(Mes_Nascimento.equals("02")){
            C = Double.parseDouble("3");
        }
        else
        if(Mes_Nascimento.equals("03")){
            C = Double.parseDouble("3");
        }
        else
        if(Mes_Nascimento.equals("04")){
            C = Double.parseDouble("6");
        }
        else
        if(Mes_Nascimento.equals("05")){
            C = Double.parseDouble("1");
        }
        else
        if(Mes_Nascimento.equals("06")){
            C = Double.parseDouble("4");
        }
        else
        if(Mes_Nascimento.equals("07")){
            C = Double.parseDouble("6");
        }
        else
        if(Mes_Nascimento.equals("08")){
            C = Double.parseDouble("2");
        }
        else
        if(Mes_Nascimento.equals("09")){
            C = Double.parseDouble("5");
        }
        else
        if(Mes_Nascimento.equals("10")){
            C = Double.parseDouble("0");
        }
        else
        if(Mes_Nascimento.equals("11")){
            C = Double.parseDouble("3");
        }
        else
        if(Mes_Nascimento.equals("12")){
            C = Double.parseDouble("5");
        }
        
        D = Double.parseDouble(Dia_Nascimento);
        
        D -= 1;
        
        soma = A + B + C + D;
        
        if(soma%7 < 1 || soma%7 == 0){
            JOptionPane.showMessageDialog(null,"Você nasceu no dia de Segunda-Feira");
        }
        else
        if(soma%7 < 2 && soma%7 > 0){
            JOptionPane.showMessageDialog(null,"Você nasceu no dia de Terça-Feira");
        }
        else
        if(soma%7 < 3 && soma%7 > 1){
            JOptionPane.showMessageDialog(null,"Você nasceu no dia de Quarta-Feira");
        }
        else
        if(soma%7 < 4 && soma%7 > 2){
            JOptionPane.showMessageDialog(null,"Você nasceu no dia de Quinta-Feira");
        }
        else
        if(soma%7 < 5 && soma%7 > 3){
            JOptionPane.showMessageDialog(null,"Você nasceu no dia de Sexta-Feira");
        }
        else
        if(soma%7 < 6 && soma%7 > 5){
            JOptionPane.showMessageDialog(null,"Você nasceu no dia de Sábado");
        }
        else
        if(soma%7 < 7 || soma%7 > 5){
            JOptionPane.showMessageDialog(null,"Você nasceu no dia de Domingo");
        }
        
    }
}
