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
    public static int quantidade_de_linhas = 5;//ok
    public static int quantidade_de_colunas = 1;//ok
    public static int[] valor = new int[quantidade_de_colunas];
    public static String[] p = new String[quantidade_de_colunas];
    public static String[] linha = new String[quantidade_de_linhas];
    
    public static void ImprimeSequencia(){
        for(int i=0; i < quantidade_de_linhas; i++){//FOR I
            for(int j=0; j < quantidade_de_colunas; j++){//FOR J
            Random random = new Random();
            valor[j] = random.nextInt(2);//numeros aleatorios entre 0 e 1
             if(j == 0){
                p[j] = ""+valor[j];
            }else{
                p[j] = "   "+valor[j];
            }
            if(quantidade_de_colunas == 1){
                linha[i] = ""+p[0];
            }
            if(quantidade_de_colunas == 2){
                linha[i] = p[0]+"   "+p[1];
            }  
            System.out.print(""+p[j]);//imprime a linha da vez 
        }//FOR J    
        System.out.print("\n");//pula uma linha a cada vez
        }//FOR I
    }
    
    public static void main(String args[]){        
        
         ImprimeSequencia();
        
//        for(int i=0; i< quantidade_de_linhas;i++){
//            JOptionPane.showMessageDialog(null,""+linha[i]);
//        }  
    }
}