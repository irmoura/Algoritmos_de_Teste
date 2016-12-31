/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import com.sun.jna.platform.win32.Advapi32Util;
import static com.sun.jna.platform.win32.WinReg.HKEY_LOCAL_MACHINE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author irmoura
 */
public class Motherboard {
    public static void main(String[] args) {
        try {
            String result = null;
            Process p = Runtime.getRuntime().exec("wmic baseboard get serialnumber");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null)
            {
                result += line;
            }
            if (result.equalsIgnoreCase(" ")) {
                System.out.println("Result is empty");
            } else
            {
                System.out.println("Modelo do sistema : "+result);
                System.out.println(Advapi32Util.registryGetStringValue(HKEY_LOCAL_MACHINE,"HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\0\\","ProcessorNameString"));   
                System.out.println(Advapi32Util.registryGetStringValue(HKEY_LOCAL_MACHINE,"HARDWARE\\DESCRIPTION\\System\\CentralProcessor\\0\\","Identifier"));  
            }
            input.close();
        } catch (IOException ex) {
            Logger.getLogger(Motherboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
