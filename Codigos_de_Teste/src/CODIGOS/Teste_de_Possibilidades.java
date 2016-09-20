/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author irmoura
 */
public class Teste_de_Possibilidades {
    
    /**
     *
     */
    public static int quantidade_de_linhas = 100000;//ok
    public static int quantidade_de_colunas = 6;//ok
    public static int[] vetor_numero_aleatorio = new int[quantidade_de_colunas];
    public static String[] sequencia_unitaria = new String[quantidade_de_colunas];
    public static String[] sequencia_completa = new String[quantidade_de_linhas];
    
    public static void ImprimeSequencia(){
        for(int i=0; i < quantidade_de_linhas; i++){//FOR I
            for(int j=0; j < quantidade_de_colunas; j++){//FOR J
            Random random = new Random();
            vetor_numero_aleatorio[j] = random.nextInt(2);//numeros aleatorios entre 0 e 1
             if(j == 0){
                sequencia_unitaria[j] = ""+vetor_numero_aleatorio[j];
            }else{
                sequencia_unitaria[j] = "   "+vetor_numero_aleatorio[j];
            }
            ////////////////////////////////////////////////////////////////////
            if(quantidade_de_colunas == 1){
                sequencia_completa[i] = ""+sequencia_unitaria[0];
            }
            if(quantidade_de_colunas == 2){
                sequencia_completa[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1];
            }
            ////////////////////////////////////////////////////////////////////
            System.out.print(""+sequencia_unitaria[j]);//imprime a sequencia_completa da vez 
        }//FOR J    
        System.out.print("\n");//pula uma sequencia_completa a cada vez
        }//FOR I
    }
    
    public static void main(String args[]){        
        
         ImprimeSequencia();
        
//        for(int i=0; i< quantidade_de_sequencia_completas;i++){
//            JOptionPane.showMessageDialog(null,""+sequencia_completa[i]);
//        }  
    }
}