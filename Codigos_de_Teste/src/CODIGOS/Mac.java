/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author irmoura
 */
public class Mac {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            System.out.println("Current IP Address : "+ip.getHostAddress());
            try {
                ////////////////////////////////////////////////////////////////////
                NetworkInterface network = NetworkInterface.getByInetAddress(ip);
                byte[] mac = network.getHardwareAddress();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < mac.length; i++){
                    sb.append(String.format("%02X%s", mac[i], ( i < mac.length - 1) ? "-" : "" ));
                }
                System.out.println("Current MAC Address : "+sb.toString());
                ////////////////////////////////////////////////////////////////////
            } catch (SocketException ex) {
                Logger.getLogger(Mac.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
