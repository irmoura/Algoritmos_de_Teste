/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Voz {
    public static void main(String args[]) throws IOException{
        
        for(int i=0; i < 10; i++){
             String frase = JOptionPane.showInputDialog(null,"");
             Fala(frase);
        }
        
    }
    
    public static void Fala(String frase){
    Voice voice;
    VoiceManager vm = VoiceManager.getInstance();
    voice = vm.getVoice("kevin16");
    voice.allocate();
    voice.speak(frase);
    }
    
}
