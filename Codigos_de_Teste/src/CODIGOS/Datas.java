/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Datas {
    public static void main(String args[]){
        
        
        Calendar DIA_ATUAL = Calendar.getInstance();
        String dia_da_semana_str = "";
        int dia = DIA_ATUAL.get(Calendar.DAY_OF_MONTH);// RECEBE O DIA ATUAL ... (Ex: 1,2,3...31)
        int mes = DIA_ATUAL.get(Calendar.MONTH);// RECEBE O MES ATUAL ...
        int ano = DIA_ATUAL.get(Calendar.YEAR);// RECEBE O ANO ATUAL ...
        int dia_da_semana = DIA_ATUAL.get(Calendar.DAY_OF_WEEK);//RECEBE O DIA DA SEMANA
        if(dia_da_semana == 1){
            dia_da_semana_str = "DOM";
        }
        else
        if(dia_da_semana == 2){
            dia_da_semana_str = "SEG";
        }
        else
        if(dia_da_semana == 3){
            dia_da_semana_str = "TER";
        }
        else
        if(dia_da_semana == 4){
            dia_da_semana_str = "QUA";
        }
        else
        if(dia_da_semana == 5){
            dia_da_semana_str = "QUI";
        }
        else
        if(dia_da_semana == 6){
            dia_da_semana_str = "SEX";
        }
        else
        if(dia_da_semana == 7){
            dia_da_semana_str = "SAB";
        }
        int hora = DIA_ATUAL.get(Calendar.HOUR);// RECEBE O DIA ATUAL ANO ...
        int minuto = DIA_ATUAL.get(Calendar.MINUTE);// RECEBE O DIA ATUAL ANO ...
        int segundo = DIA_ATUAL.get(Calendar.SECOND);// RECEBE O DIA ATUAL ANO ...        
        System.out.println( "=====TERMOPLUS_JR=============="+
                            "\nFATENE"+
                            "\n==============================="+
                            "\nENTRADA:                   1252"+
                            "\nPLACA: OZA-2184"+
                            "\n"+dia+"/"+mes+"/"+ano+"   "+hora+":"+minuto+"           "+dia_da_semana_str+
                            "\nCOMPR: 8.851     SEQUEN:    003"+
                            "\n    A V U L S O"+
                            "\n==============================="+
                            "\nLJ01 -- MQ001 -- OP1 -- V01.29-"+
                            "\n===========www.TERMOPLUS.com.br");
        //===================================================================================================================
        
        JOptionPane.showMessageDialog(null,"=====TERMOPLUS_JR=============="+
                                           "\nFATENE"+
                                           "\n================================"+
                                           "\nENTRADA:                   1252"+
                                           "\nPLACA: OZA-2184"+
                                           "\n"+dia+"/0"+(mes+1)+"/"+ano+"   "+hora+":"+minuto+"                     "+dia_da_semana_str+
                                           "\nCOMPR: 8.851     SEQUEN:    003"+
                                           "\n    A V U L S O"+
                                           "\n================================"+
                                           "\n      LJ01 -- MQ001 -- OP1 -- V01.29-"+
                                           "\n===========www.TERMOPLUS.com.br");
    }
}
