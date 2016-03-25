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
public class MergeSort {
    public static void main(String args[]){
        
        int[] vetorM = {9, 8, 6, 7, 3, 5, 4, 0, 1, 2};//vetor não ordenado
        
        //System.out.println("Vetor ainda não ordenado:");
        JOptionPane.showMessageDialog(null,"Vetor ainda não ordenado:");
        
        for (int i = 0; i < vetorM.length; i++) {
            //System.out.println(vetorM[i]);
            JOptionPane.showMessageDialog(null,""+vetorM[i]);
        }
        
        //System.out.println("<-- MergeSort");
        JOptionPane.showMessageDialog(null,"<-- MergeSort");
        setVetor(vetorM);
        merge(0, 9);
        
        //System.out.println("Vetor já ordenado:");
        JOptionPane.showMessageDialog(null,"Vetor já ordenado:");
        
        for (int i = 0; i < vetorM.length; i++) {
            //System.out.println(vetorM[i]);
            JOptionPane.showMessageDialog(null,""+vetorM[i]);
        }
        
    }//fim do metodo main
    
    /* Vetor de entrada */
    
    private static int[] vetor;

    public static int[] getVetor() {
        return vetor;
    }

    public static void setVetor(int[] vetor) {
        MergeSort.vetor = vetor;
    }
    
    /*
     * Método recursivo que divide o vetor em dois e depois os mescla e ordena 
     */
    
    private static void merge(int inicio, int fim){
        
        if(inicio < fim){
            
            int meio = (inicio + fim) / 2;
            merge(inicio , meio);
            merge(meio + 1, fim);
            mesclar(inicio, meio, fim);
            
        }
        
    }//fim do metodo merge
    
    private static void mesclar(int inicio, int meio, int fim){
        
        int tamanho = fim - inicio + 1;
        
        int[] temp = new int[tamanho];
        
        System.arraycopy(vetor, inicio, temp, 0, tamanho);
        
        int i = 0;
        int j = meio - inicio + 1;
        
        for(int posicao = 0; posicao < tamanho; posicao++){
            if(j <= tamanho -1){
                if(i <= meio - inicio){
                    if(temp[i] < temp[j]){
                        vetor[inicio + posicao] = temp[i++];
                    } else {
                        vetor[inicio + posicao] = temp[j++];
                    }
                } else {
                    vetor[inicio + posicao] = temp[j++];
                }
            } else {
                vetor[inicio + posicao] = temp[i++];
            }
        }
        
    }//fim do metodo mesclar
    
}
