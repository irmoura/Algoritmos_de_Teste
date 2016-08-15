/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Ismael Ribeiro
 */
public class Teorema_De_Pitagoras {
    
    public static double cateto1, cateto2, firstpass, segundpass, firstresultado;
    public static String[]input = new String[2];
    
    public static void main(String args[]){
        
        for(int i=0; i < 2; i++){
            input[i] = JOptionPane.showInputDialog(null,"Informa o valor do cateto "+(i+1)+" :");
            if(i == 0){
                cateto1 = Double.parseDouble(input[i]);
            }else
            if(i == 1){
                cateto2 = Double.parseDouble(input[i]);
            }
        }
        
        firstpass = cateto1 * cateto1;
        segundpass = cateto2 * cateto2;
        firstresultado = firstpass + segundpass;
        
        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é : "+(Math.sqrt(firstresultado)));
        
    }
}