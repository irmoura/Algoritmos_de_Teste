package CODIGOS;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Properties;
import javax.swing.JFrame;
public class Exemplo_de_Impressao extends JFrame {
  MyCanvas canvas = new MyCanvas();
  public static void main(String args[]) {
    Exemplo_de_Impressao app = new Exemplo_de_Impressao();
  }
  public Exemplo_de_Impressao() {
    add("Center", canvas);
    setSize(300, 300);//X - Y LARGURA - ALTURA
    setLocationRelativeTo(null);//DEFINE CENTRALIZADO
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    String name = "Test print job";
    Properties properties = new Properties();
    PrintJob pj = Toolkit.getDefaultToolkit().getPrintJob(Exemplo_de_Impressao.this, name, properties);
    if (pj != null) {
      canvas.printAll(pj.getGraphics());
      pj.end();
    }
  }
}
class MyCanvas extends Canvas {
  @Override
  public void paint(Graphics g) {
      
    Calendar DIA_ATUAL = Calendar.getInstance();
        String dia_da_semana_str = "";
        int dia = DIA_ATUAL.get(Calendar.DAY_OF_MONTH);// RECEBE O DIA ATUAL ... (Ex: 1,2,3...31)
        int mes = DIA_ATUAL.get(Calendar.MONTH);// RECEBE O MES ATUAL ...
        int ano = DIA_ATUAL.get(Calendar.YEAR);// RECEBE O ANO ATUAL ...
        int dia_da_semana = DIA_ATUAL.get(Calendar.DAY_OF_WEEK);//RECEBE O DIA DA SEMANA
      switch (dia_da_semana) {
          case 1:
              dia_da_semana_str = "DOM";
              break;
          case 2:
              dia_da_semana_str = "SEG";
              break;
          case 3:
              dia_da_semana_str = "TER";
              break;
          case 4:
              dia_da_semana_str = "QUA";
              break;
          case 5:
              dia_da_semana_str = "QUI";
              break;
          case 6:
              dia_da_semana_str = "SEX";
              break;
          case 7:
              dia_da_semana_str = "SAB";
              break;
          default:
              break;
      }
        int hora = DIA_ATUAL.get(Calendar.HOUR);// RECEBE O DIA ATUAL ANO ...
        int minuto = DIA_ATUAL.get(Calendar.MINUTE);// RECEBE O DIA ATUAL ANO ...
        int segundo = DIA_ATUAL.get(Calendar.SECOND);// RECEBE O DIA ATUAL ANO ...
    
    g.drawString("=====TERMOPLUS_JR=============", 10, 20);
    g.drawString("FATENE", 10, 40);
    g.drawString("================================", 10, 60);
    g.drawString("ENTRADA:                                  1252", 10, 80);
    g.drawString("PLACA: OZA-2184", 10, 100);
    g.drawString(+dia+"/0"+(mes+1)+"/"+ano+"   "+hora+":"+minuto+"                     "+dia_da_semana_str, 10, 120);
    g.drawString("COMPR: 8.851     SEQUEN:    003", 10, 140);
    g.drawString("    A V U L S O", 10, 160);
    g.drawString("================================", 10, 180);
    g.drawString("      LJ01 -- MQ001 -- OP1 -- V01.29-", 10, 200);
    g.drawString("===========www.TERMOPLUS.com.br", 10, 220);
  }
}