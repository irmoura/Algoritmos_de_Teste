/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author ibsf2501
 */
public class Robot_Teste {
    
public static void click(int x, int y) throws AWTException{
    Robot bot = new Robot();
    bot.mouseMove(x, y);    
    bot.mousePress(InputEvent.BUTTON1_MASK);
    bot.mouseRelease(InputEvent.BUTTON1_MASK);
}
    
    public static void main(String args[]) throws AWTException{
        
        //RESOLUCAO 1280X800
    
        Robot bot = new Robot();
        
        int delay = 1000;
        
        bot.delay(5000);
        click(30,33);//MENU_IBYTE
        bot.delay(delay);
        bot.mouseMove(30, 255);//LOGISTICA
        bot.delay(delay);
        bot.mouseMove(220, 295);//LOGISTICA - ORDEM DE SERVICO
        click(220,295);
        bot.delay(delay);
        bot.mouseMove(60, 225);//CRITERIOS
        bot.delay(delay);
        click(60,225);
        bot.mouseMove(560, 360);//DATA ABERT OS
        bot.delay(delay);
        click(560,360);
        bot.delay(delay);
        //bot.keyPress(KeyEvent.VK_BACK_SPACE);//TECLA BACKSPACE <<<<<< APAGA A DATA INICIAL
        bot.mouseMove(535, 500);//SIT CONTAB
        click(535,500);
        bot.delay(delay);
        bot.keyPress(KeyEvent.VK_BACK_SPACE);//TECLA BACKSPACE
        
        //bot.mouseMove(655, 317);//NUMERO DA OS
        bot.mouseMove(615, 290);//LOJA A QUE DIZ RESPEITO A OS
        click(615,290);
        
        bot.delay(delay);
        bot.keyPress(KeyEvent.VK_F);
        bot.keyPress(KeyEvent.VK_2);
        bot.keyPress(KeyEvent.VK_5);
        bot.mouseMove(715, 600);//BOTAO OK
        bot.delay(delay);
        click(715,600);
    }
}