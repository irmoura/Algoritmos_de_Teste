/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Exemplo_com_Thread {
    
public static int num;
    
    public static void main(String[] args) {
        new Teste().start();
        JOptionPane.showInputDialog(null,"Digite qualquer coisa : ");
        System.exit(0);
    }
public static class Teste extends Thread{
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Exemplo_com_Thread.class.getName()).log(Level.SEVERE, null, ex);
            }
            num++;
            System.out.println(""+num);
        }
    }
}
}
