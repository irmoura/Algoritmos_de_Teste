/*
 * To change this license header, choose License Headers in Provect Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Mael
 */
public class Xadrez_Com_Grafico extends JPanel {
    private static final long serialVersionUID = 1L;
    
    private Image IMAGEM_DE_FUNDO;
    String Imagem_de_Fundo = "res\\QUADRADO_1.jpg";
    String Imagem_de_Fundo_2 = "res\\QUADRADO_2.jpg";
    ImageIcon referencia = new ImageIcon(Imagem_de_Fundo);
    ImageIcon referencia_2 = new ImageIcon(Imagem_de_Fundo_2);
 
    public void paint(Graphics g){
        
        int TAMANHO = 450;
        
        g.setColor(Color.WHITE);
        for(int HORIZONTAL = 0; HORIZONTAL <= TAMANHO; HORIZONTAL += 100){
            for(int VERTICAL = 0; VERTICAL <= TAMANHO; VERTICAL +=100){
                IMAGEM_DE_FUNDO = referencia.getImage();
                g.drawImage(IMAGEM_DE_FUNDO, HORIZONTAL, VERTICAL, null);
            }
        }
        g.setColor(Color.WHITE);
        for(int HORIZONTAL = 50; HORIZONTAL <= TAMANHO; HORIZONTAL += 100){
            for(int VERTICAL = 50; VERTICAL <= TAMANHO; VERTICAL +=100){
                //g.fillRect(HORIZONTAL, VERTICAL, 50, 50);
                IMAGEM_DE_FUNDO = referencia.getImage();
                g.drawImage(IMAGEM_DE_FUNDO, HORIZONTAL, VERTICAL, null);
            }
        }
        g.setColor(Color.BLACK);
        for(int HORIZONTAL = 50; HORIZONTAL <= TAMANHO; HORIZONTAL += 100){
            for(int VERTICAL = 0; VERTICAL <= TAMANHO; VERTICAL +=100){
                //g.fillRect(HORIZONTAL, VERTICAL, 50, 50);
                IMAGEM_DE_FUNDO = referencia_2.getImage();
                g.drawImage(IMAGEM_DE_FUNDO, HORIZONTAL, VERTICAL, null);
            }
        }
        g.setColor(Color.BLACK);
        for(int HORIZONTAL = 0; HORIZONTAL <= TAMANHO; HORIZONTAL += 100){
            for(int VERTICAL = 50; VERTICAL <= TAMANHO; VERTICAL +=100){
                //g.fillRect(HORIZONTAL, VERTICAL, 50, 50);
                IMAGEM_DE_FUNDO = referencia_2.getImage();
                g.drawImage(IMAGEM_DE_FUNDO, HORIZONTAL, VERTICAL, null);
            }
        }
        
        //////////////////////// PEÕES AMARELOS ///////////////////////////////////////
        
        g.setColor(Color.YELLOW);
        for(int HORIZONTAL = 55; HORIZONTAL <= TAMANHO+50; HORIZONTAL += 100){
            for(int VERTICAL = 5; VERTICAL <= TAMANHO-250; VERTICAL +=100){
                g.fillOval(HORIZONTAL, VERTICAL, 40, 40);
            }
        }
        g.setColor(Color.YELLOW);
        for(int HORIZONTAL = 5; HORIZONTAL <= TAMANHO+50; HORIZONTAL += 100){
            for(int VERTICAL = 55; VERTICAL <= TAMANHO-250; VERTICAL +=100){
                g.fillOval(HORIZONTAL, VERTICAL, 40, 40);
            }
        }
        
        //////////////////////// PEÕES VERMELHOS //////////////////////////////////
        
        g.setColor(Color.RED);
        for(int HORIZONTAL = 55; HORIZONTAL <= TAMANHO+50; HORIZONTAL += 100){
            for(int VERTICAL = 305; VERTICAL <= TAMANHO; VERTICAL +=100){
                g.fillOval(HORIZONTAL, VERTICAL, 40, 40);
            }
        }
        g.setColor(Color.RED);
        for(int HORIZONTAL = 5; HORIZONTAL <= TAMANHO+50; HORIZONTAL += 100){
            for(int VERTICAL = 355; VERTICAL <= TAMANHO+50; VERTICAL +=100){
                g.fillOval(HORIZONTAL, VERTICAL, 40, 40);
            }
        }
        
     
        
        g.dispose();
        
    }
    
    public static void main(String args[]){
        
        int TAMANHO_H =506;//506
        int TAMANHO_V = 529;//539
        
        
        
        JFrame frame = new JFrame();
        frame.setSize(TAMANHO_H,TAMANHO_V);//1024,736
        frame.getContentPane().add(new Xadrez_Com_Grafico());
        frame.getContainerListeners();
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//JFrame.EXIT_ON_CLOSE
        frame.setVisible(true);
        frame.setTitle("Jogo de Xadrez");
        frame.setResizable(false);
 
    }
}