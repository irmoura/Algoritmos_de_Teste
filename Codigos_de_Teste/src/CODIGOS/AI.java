/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.*;

/**
 *
 * @author Mael
 */
public class AI {
    public static void main(String args[]){
        
        int qnt = 4;
        String frase = "";
        String nome = "";
        
            nome = JOptionPane.showInputDialog(null,"Qual seu nome ?");
        
            for(int i = 0; i < qnt; i++){
                frase = JOptionPane.showInputDialog(null,"Digite a "+(i+1)+"ª frase");
            frase = frase.replace(" ",";");
            String[] s = frase.split(";");
            
            String[] palavras_separadas = new String[s.length];
        
        for(int j = 0; j < s.length; j++){
            //System.out.println(s[i]);
            palavras_separadas[j] = s[j];
            //JOptionPane.showMessageDialog(null,palavras_separadas[i]);
        }
        
        if(palavras_separadas[0].equals("boa")){
            if(palavras_separadas[1].equals("noite")){
                JOptionPane.showMessageDialog(null,"Boa noite "+nome);
            }
            else
            if(palavras_separadas[1].equals("tarde")){
                JOptionPane.showMessageDialog(null,"Boa tarde "+nome);
            }
            else
            if(!palavras_separadas[1].equals("")){
                JOptionPane.showMessageDialog(null,"Infelizmente eu não entendi o que você quis dizer "+nome);
            }
        }
        else
        if(palavras_separadas[0].equals("bom") && 
           palavras_separadas[1].equals("dia"))
        {
            JOptionPane.showMessageDialog(null,"Bom dia "+nome);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Eu não entendi o que você quis dizer "+nome);
        }//
            }
            
    }
}
