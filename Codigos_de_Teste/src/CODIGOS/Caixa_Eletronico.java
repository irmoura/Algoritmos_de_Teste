/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.JOptionPane;

/**
 *
 * @author irmoura
 */
public class Caixa_Eletronico {
    
    public static int contador, valor_liberado, valor_solicitado;
    public static int notas_de_10, notas_de_20, notas_de_50, notas_de_100;
    
    public static void main(String args[]){
        
        valor_solicitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor que deseja sacar :"));
        
        for(int i= 0; i < valor_solicitado; i++){
            contador++;
            if(contador%10 == 0){
                notas_de_10++;
            }
            if(contador%20 == 0){
                notas_de_20++;
            }
            if(contador%50 == 0){
                notas_de_50++;
            }
            if(contador%100 == 0){
                notas_de_100++;
            }
            
        }
        
        if((notas_de_100*100) == valor_solicitado){
            JOptionPane.showMessageDialog(null,"Quantidade de notas de 100 : "+notas_de_100);
        }
        
        if((notas_de_20*20) < valor_solicitado){
            JOptionPane.showMessageDialog(null,"As notas de 20 são insuficientes "+(notas_de_20*20)+
                    " - valor solicitado :"+valor_solicitado);
        }
        
        JOptionPane.showMessageDialog(null,"Quantidade de notas de 10 :"+notas_de_10+"\n"
        +"Quantidade de notas de 20 :"+notas_de_20+"\n"
        +"Quantidade de notas de 50 :"+notas_de_50+"\n"
        +"Quantidade de notas de 100 :"+notas_de_100+"\n"
        +"Valor solicitado :"+valor_solicitado+"\n"
        +"Valor liberado :"+valor_liberado);
        
    }
}