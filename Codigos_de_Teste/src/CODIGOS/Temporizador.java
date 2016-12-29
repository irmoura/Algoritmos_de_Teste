/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author irmoura
 */
public class Temporizador extends javax.swing.JFrame {
    
    public Timer timer;
    
    public int segundos_totais;
    public int minutos_totais;
    public int horas_totais;
    
    public String segundos_string;
    public String minutos_string;
    public String horas_string;

    /**
     * Creates new form Temporizador
     */
    public Temporizador() {
        initComponents();
    }
    
    public void inicia_contador(){    
        segundos_totais = jComboBox_Segundos.getSelectedIndex();
        minutos_totais = jComboBox_Minutos.getSelectedIndex();
        horas_totais = jComboBox_Horas.getSelectedIndex();
//        Date date = new Date();
//        segundos_totais = 60-(date.getSeconds()+1);
//        minutos_totais = 60-date.getMinutes();
//        horas_totais = 21-date.getHours();
        timer = new Timer(1000, (ActionEvent e) -> {
            if(segundos_totais  < 0){
                if(horas_totais > 0 && minutos_totais == 0){
                    minutos_totais = 60;
                    horas_totais--;
                    jComboBox_Horas.setSelectedIndex(horas_totais);
                }
                if(minutos_totais > 0){
                    segundos_totais = 59;
                    minutos_totais--;
                    jComboBox_Minutos.setSelectedIndex(minutos_totais);
                }else if(minutos_totais == 0){
                    timer.stop();
                }
            }
            if(segundos_totais >= 0){
                jComboBox_Segundos.setSelectedIndex(segundos_totais);
            }
            /******************************************************************/
            if(segundos_totais > 9){
            segundos_string = ""+segundos_totais;
            }else if(segundos_totais < 10){
            segundos_string = "0"+segundos_totais;
            }
            /******************************************************************/
            if(minutos_totais > 9){
                minutos_string = ""+minutos_totais;
            }else if(minutos_totais < 10){
                minutos_string = "0"+minutos_totais;
            }
            /******************************************************************/
            if(horas_totais > 9){
                horas_string = ""+horas_totais;
            }else if(horas_totais < 10){
                horas_string = "0"+horas_totais;
            }
            /******************************************************************/
            String tempo_completo = horas_string+":"+minutos_string+":"+segundos_string;
            if((segundos_totais != -1)){
//            System.out.println(tempo_completo);
                jLabel1.setText(tempo_completo);
            }
            segundos_totais--;
        });
        timer.start();
    }
    
    public void para_contador(){
        timer.stop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_iniciar = new javax.swing.JButton();
        btn_parar = new javax.swing.JButton();
        btn_zerar = new javax.swing.JButton();
        btn_reiniciar = new javax.swing.JButton();
        jComboBox_Segundos = new javax.swing.JComboBox<>();
        jComboBox_Minutos = new javax.swing.JComboBox<>();
        jComboBox_Horas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        btn_parar.setText("Parar");
        btn_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pararActionPerformed(evt);
            }
        });

        btn_zerar.setText("Zerar");
        btn_zerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zerarActionPerformed(evt);
            }
        });

        btn_reiniciar.setText("Reiniciar");
        btn_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reiniciarActionPerformed(evt);
            }
        });

        jComboBox_Segundos.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N

        jComboBox_Minutos.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N

        jComboBox_Horas.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 59)); // NOI18N
        jLabel1.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_parar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_zerar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox_Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Segundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Segundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_iniciar)
                    .addComponent(btn_parar)
                    .addComponent(btn_zerar)
                    .addComponent(btn_reiniciar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        for(int i = 0; i < 60; i++){
            if(i < 10){
                jComboBox_Segundos.addItem("0"+i);
            }else{
                jComboBox_Segundos.addItem(""+i);
            }
        }
        for(int i = 0; i < 60; i++){
            if(i < 10){
                jComboBox_Minutos.addItem("0"+i);
            }else{
                jComboBox_Minutos.addItem(""+i);
            }
        }
        for(int i = 0; i < 100; i++){
            if(i < 10){
                jComboBox_Horas.addItem("0"+i);
            }else{
                jComboBox_Horas.addItem(""+i);
            }
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        // TODO add your handling code here:
        inicia_contador();
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pararActionPerformed
        // TODO add your handling code here:
        para_contador();
    }//GEN-LAST:event_btn_pararActionPerformed

    private void btn_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reiniciarActionPerformed

    private void btn_zerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zerarActionPerformed
        // TODO add your handling code here:
        jComboBox_Segundos.setSelectedIndex(0);
        jComboBox_Minutos.setSelectedIndex(0);
        jComboBox_Horas.setSelectedIndex(0);
        jLabel1.setText("00:00:00");
    }//GEN-LAST:event_btn_zerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temporizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temporizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_parar;
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JButton btn_zerar;
    private javax.swing.JComboBox<String> jComboBox_Horas;
    private javax.swing.JComboBox<String> jComboBox_Minutos;
    private javax.swing.JComboBox<String> jComboBox_Segundos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
