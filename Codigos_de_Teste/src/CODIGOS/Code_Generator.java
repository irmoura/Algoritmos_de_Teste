/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Random;

/**
 *
 * @author irmoura
 */
public class Code_Generator {
    public static void main(String[] args) {
        
        int qnt = 35;
        String[] c = new String[qnt];
        
        for(int i = 0; i < c.length; i++){
            Random random = new Random();
            int na = random.nextInt(qnt+1);
            switch (na) {
                case 10:
                    c[i] = "A";
                    System.out.print(""+c[i]);
                    break;
                case 11:
                    c[i] = "B";
                    System.out.print(""+c[i]);
                    break;
                case 12:
                    c[i] = "C";
                    System.out.print(""+c[i]);
                    break;
                case 13:
                    c[i] = "D";
                    System.out.print(""+c[i]);
                    break;
                case 14:
                    c[i] = "E";
                    System.out.print(""+c[i]);
                    break;
                case 15:
                    c[i] = "F";
                    System.out.print(""+c[i]);
                    break;
                case 16:
                    c[i] = "G";
                    System.out.print(""+c[i]);
                    break;
                case 17:
                    c[i] = "H";
                    System.out.print(""+c[i]);
                    break;
                case 18:
                    c[i] = "I";
                    System.out.print(""+c[i]);
                    break;
                case 19:
                    c[i] = "J";
                    System.out.print(""+c[i]);
                    break;
                case 20:
                    c[i] = "K";
                    System.out.print(""+c[i]);
                    break;
                case 21:
                    c[i] = "L";
                    System.out.print(""+c[i]);
                    break;
                case 22:
                    c[i] = "M";
                    System.out.print(""+c[i]);
                    break;
                case 23:
                    c[i] = "N";
                    System.out.print(""+c[i]);
                    break;
                case 24:
                    c[i] = "O";
                    System.out.print(""+c[i]);
                    break;
                case 25:
                    c[i] = "P";
                    System.out.print(""+c[i]);
                    break;
                case 26:
                    c[i] = "Q";
                    System.out.print(""+c[i]);
                    break;
                case 27:
                    c[i] = "R";
                    System.out.print(""+c[i]);
                    break;
                case 28:
                    c[i] = "S";
                    System.out.print(""+c[i]);
                    break;
                case 29:
                    c[i] = "T";
                    System.out.print(""+c[i]);
                    break;
                case 30:
                    c[i] = "U";
                    System.out.print(""+c[i]);
                    break;
                case 31:
                    c[i] = "V";
                    System.out.print(""+c[i]);
                    break;
                case 32:
                    c[i] = "W";
                    System.out.print(""+c[i]);
                    break;
                case 33:
                    c[i] = "X";
                    System.out.print(""+c[i]);
                    break;
                case 34:
                    c[i] = "Y";
                    System.out.print(""+c[i]);
                    break;
                case 35:
                    c[i] = "Z";
                    System.out.print(""+c[i]);
                    break;
                default:
                    c[i] = ""+na;
                    System.out.print(""+c[i]);
                    break;
            }
            if(i == (qnt-1)){
                System.out.println("");
            }
        }
        
    }
}
