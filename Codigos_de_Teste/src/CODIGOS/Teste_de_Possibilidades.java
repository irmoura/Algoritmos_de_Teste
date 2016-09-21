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
    public static int quantidade_de_linhas = 100;//ok
    public static int quantidade_de_colunas = 6;//ok
    public static int[] vetor_numero_aleatorio = new int[quantidade_de_colunas];
    public static String[] sequencia_unitaria = new String[quantidade_de_colunas];
    public static String[] sequencia_completa = new String[quantidade_de_linhas];
    public static String[] sequencia_completa2 = new String[quantidade_de_linhas];
    public static int count;
    
    public static void CriaSequencia(){
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
                sequencia_completa2[i] = ""+sequencia_unitaria[0];
            }
            ////////////////////////////////////////////////////////////////////
            if(quantidade_de_colunas == 2){
                sequencia_completa[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1];
                sequencia_completa2[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1];
            }
            ////////////////////////////////////////////////////////////////////
            if(quantidade_de_colunas == 3){
                sequencia_completa[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1]+"   "+sequencia_unitaria[2];
                sequencia_completa2[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1]+"   "+sequencia_unitaria[2];
            }
            ////////////////////////////////////////////////////////////////////
            if(quantidade_de_colunas == 4){
                sequencia_completa[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1]+"   "+sequencia_unitaria[2]+"   "+sequencia_unitaria[3];
                sequencia_completa2[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1]+"   "+sequencia_unitaria[2]+"   "+sequencia_unitaria[3];
            }
            ////////////////////////////////////////////////////////////////////
             if(quantidade_de_colunas == 5){
                sequencia_completa[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1]+"   "+sequencia_unitaria[2]+"   "+sequencia_unitaria[3]+"   "+sequencia_unitaria[4];
                sequencia_completa2[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1]+"   "+sequencia_unitaria[2]+"   "+sequencia_unitaria[3]+"   "+sequencia_unitaria[4];
            }
            ////////////////////////////////////////////////////////////////////
             if(quantidade_de_colunas == 6){
                sequencia_completa[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1]+"   "+sequencia_unitaria[2]+"   "+sequencia_unitaria[3]+"   "+sequencia_unitaria[4]+"   "+sequencia_unitaria[5];
                sequencia_completa2[i] = sequencia_unitaria[0]+"   "+sequencia_unitaria[1]+"   "+sequencia_unitaria[2]+"   "+sequencia_unitaria[3]+"   "+sequencia_unitaria[4]+"   "+sequencia_unitaria[5];
            }
            ////////////////////////////////////////////////////////////////////
            }//FOR J    
        }//FOR I
    }
    
    public static void main(String args[]){        
        
         CriaSequencia();
         
         for(int i=0; i<sequencia_completa.length;i++){
            System.out.print(sequencia_completa[i]+"\n");//Imprime a linha
        }
         
         for(int i=0; i<sequencia_completa.length;i++){
            if(i>0){
                if(sequencia_completa2[count].equals(sequencia_completa[i])){
                System.out.println("A linha "+(i+1)+" é igual a linha 1");
                count++;
            }
            }
        }
        System.out.print("Encontradas "+count+" linha iguais.");
    }
}