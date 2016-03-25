/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Calendar;
import javax.swing.*;

/**
 *
 * @author Mael
 */
public class AI {
    public static void main(String args[]){
        
        Calendar calendario = Calendar.getInstance();

        int hora = calendario.get(Calendar.HOUR);
        int minuto = calendario.get(Calendar.MINUTE);
        
        int qnt = 4;
        String frase = "";
        String nome = "";
        
            nome = "Ismael";//JOptionPane.showInputDialog(null,"Qual seu nome ?");
        
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
        if(palavras_separadas[0].equals("oi")){
            JOptionPane.showMessageDialog(null,"Oi "+nome);
        }
        else
        if(palavras_separadas[0].equals("Olá")){
            JOptionPane.showMessageDialog(null,"Olá "+nome);
        }
        else
        if(palavras_separadas[0].equals("tudo")){
            if(palavras_separadas[1].equals("bem")){
                JOptionPane.showMessageDialog(null,"Tudo ótimo "+nome);
            }
        }
        else
        if(palavras_separadas[0].equals("boa")){//INICIO COMEÇANDO COM BOA
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
        }//FIM COMEÇANDO COM BOA
        else
        if(palavras_separadas[0].equals("bom")){//INICIO COMEÇANDO COM BOM
            if(palavras_separadas[1].equals("dia")){
             JOptionPane.showMessageDialog(null,"Bom dia "+nome);   
            }
            else
            if(palavras_separadas[1].equals("trabalho")){
             JOptionPane.showMessageDialog(null,"Obrigado "+nome);   
            }
            else
            if(palavras_separadas[1].equals("apetite")){
             JOptionPane.showMessageDialog(null,"Obrigado "+nome);   
            }
        }//FIM COMEÇANDO COM BOM
        else
        if(palavras_separadas[0].equals("o")){//INICIO COMEÇANDO COM O
            if(palavras_separadas[1].equals("que")){
                if((palavras_separadas[2].equals("é")) || 
                   (palavras_separadas[2].equals("e"))){
                    if(palavras_separadas[3].equals("um")){
                        if(palavras_separadas[4].equals("gato")){
                            
                        }
                    }
                }
            }
        }//FIM COMEÇANDO COM O
        else
        if(palavras_separadas[0].equals("que")){//INICIO COMEÇANDO COM QUE
            if(palavras_separadas[1].equals("horas")){
             JOptionPane.showMessageDialog(null,"Agora são "+hora+" horas e "+minuto+" minutos "+nome);   
            }
        }//FIM COMEÇANDO COM QUE
        else
        if(palavras_separadas[0].equals("qual")){//INICIO COMEÇANDO COM QUAL
            if((palavras_separadas[1].equals("seu")) || 
               (palavras_separadas[1].equals("sua"))){
             if(palavras_separadas[2].equals("nome") || 
                palavras_separadas[2].equals("apelido")){
                    JOptionPane.showMessageDialog(null,"Meu nome é TK");
                }
             else
             if(palavras_separadas[2].equals("cor")){
                    JOptionPane.showMessageDialog(null,"Minha cor favorita é preto");
                }
             else
             if(palavras_separadas[2].equals("bebida")){
                    JOptionPane.showMessageDialog(null,"Minha bebida favorita é cerveja");
                }
            }
        }//FIM COMEÇANDO COM QUAL
        else
        {
            JOptionPane.showMessageDialog(null,"Eu não entendi o que você quis dizer "+nome);
        }//
      }    
    }
}