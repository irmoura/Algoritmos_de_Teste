/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.*;

/**
 *
 * @author IBS F25
 */
public class Calculadora {
    
    static int i;
    static String opcao[] = new String[2];
    static String operacao;
    
    public static void main(String args[]){
        
        for(i = 0; i < 2; i++){
            opcao[i] = JOptionPane.showInputDialog(null,"Digite o "+(i+1)+"º número: ","Calculadora",JOptionPane.QUESTION_MESSAGE);
        }
        
        operacao = JOptionPane.showInputDialog(null,"Digite a operação desejada: ","Calculadora",JOptionPane.QUESTION_MESSAGE);
        
    }
}
