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
    
    public static int valor_solicitado ,
    notas_de_1, notas_de_2, notas_de_5, notas_de_10, notas_de_20, notas_de_50, notas_de_100;
    
    public static void main(String args[]){
        
        for(int j=0; j < 100; j++){
        
        valor_solicitado = 0;
        notas_de_1 = 0;
        notas_de_2 = 0;
        notas_de_5 = 0;
        notas_de_10 = 0;
        notas_de_20 = 0;
        notas_de_50 = 0;
        notas_de_100 = 0;
            
        valor_solicitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor que deseja sacar : "));
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_100++;
            if(notas_de_100*100 > valor_solicitado){
                notas_de_100--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_50++;
            if(notas_de_50*50 > valor_solicitado){
                notas_de_50--;
            }
            if((notas_de_50*50) > (valor_solicitado - notas_de_100*100)){
                notas_de_50--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_20++;
            if(notas_de_20*20 > valor_solicitado){
                notas_de_20--;
            }
            if((notas_de_20*20) > (valor_solicitado - notas_de_50*50)){
                notas_de_20--;
            }
            if((notas_de_20*20) > (valor_solicitado - notas_de_100*100)){
                notas_de_20--;
            }
            if(((notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_20--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_10++;
            if(notas_de_10*10 > valor_solicitado){
                notas_de_10--;
            }
            if((notas_de_10*10) > (valor_solicitado - notas_de_20*20)){
                notas_de_10--;
            }
            if((notas_de_10*10) > (valor_solicitado - notas_de_50*50)){
                notas_de_10--;
            }
            if((notas_de_10*10) > (valor_solicitado - notas_de_100*100)){
                notas_de_10--;
            }
            if(((notas_de_10*10)+(notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_10--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_5++;
            if(notas_de_5*5 > valor_solicitado){
                notas_de_5--;
            }
            if((notas_de_5*5) > (valor_solicitado - notas_de_10*10)){
                notas_de_5--;
            }
            if((notas_de_5*5) > (valor_solicitado - notas_de_20*20)){
                notas_de_5--;
            }
            if((notas_de_5*5) > (valor_solicitado - notas_de_50*50)){
                notas_de_5--;
            }
            if((notas_de_5*5) > (valor_solicitado - notas_de_100*100)){
                notas_de_5--;
            }
            if(((notas_de_5*5)+(notas_de_10*10)+(notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_5--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_2++;
            if(notas_de_2*2 > valor_solicitado){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_5*5)){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_10*10)){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_20*20)){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_50*50)){
                notas_de_2--;
            }
            if((notas_de_2*2) > (valor_solicitado - notas_de_100*100)){
                notas_de_2--;
            }
            if(((notas_de_2*2)+(notas_de_5*5)+(notas_de_10*10)+(notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_2--;
            }
        }
        
        for(int i= 0; i < valor_solicitado; i++){
            notas_de_1++;
            if(notas_de_1 > valor_solicitado){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_2*2)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_5*5)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_10*10)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_20*20)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_50*50)){
                notas_de_1--;
            }
            if((notas_de_1) > (valor_solicitado - notas_de_100*100)){
                notas_de_1--;
            }
            if(((notas_de_1)+(notas_de_2*2)+(notas_de_5*5)+(notas_de_10*10)+(notas_de_20*20)+(notas_de_50*50)+(notas_de_100*100)) > valor_solicitado){
                notas_de_1--;
            }
        }
        
        JOptionPane.showMessageDialog(null,"Quantidade de notas de 1 : "+notas_de_1+"\n"
                                          +"Quantidade de notas de 2 : "+notas_de_2+"\n"
                                          +"Quantidade de notas de 5 : "+notas_de_5+"\n"
                                          +"Quantidade de notas de 10 : "+notas_de_10+"\n"
                                          +"Quantidade de notas de 20 : "+notas_de_20+"\n"
                                          +"Quantidade de notas de 50 : "+notas_de_50+"\n"
                                          +"Quantidade de notas de 100 : "+notas_de_100+"\n"
                                          +"Valor solicitado :"+valor_solicitado);
            
        }
        
    }
}