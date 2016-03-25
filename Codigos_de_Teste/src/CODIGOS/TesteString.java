/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class TesteString {
    
    public static void main(String[] args) {
		
                /*String linha = "F05/000000";
		linha=linha.replace("/", "");
                
                JOptionPane.showMessageDialog(null,""+linha);*/
                
                
                String linha = "olá mundo, Java. JSE; JEE.";
		linha=linha.replace(",", ";");
		//System.out.println(linha);
		linha=linha.replace(".", ";");
		System.out.println(linha);
		String[] s = linha.split(";");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
                
                
	}
    
}