/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;

import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 *
 * @author angel eduardo
 */
public class errores extends javax.swing.JFrame {
public String resultado;
    /**
     * Creates new form errores
     */
   
    
    public errores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pa = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        truncamiento = new javax.swing.JRadioButton();
        redondeo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        decimal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese el valor verdadero");

        jLabel2.setText("Ingrese el valor aproximado");

        jScrollPane1.setViewportView(p);

        jScrollPane2.setViewportView(pa);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        truncamiento.setText("Truncamiento");
        truncamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truncamientoActionPerformed(evt);
            }
        });

        redondeo.setText("Redondeo");
        redondeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redondeoActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese el numero de decimales");

        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(truncamiento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redondeo))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redondeo)
                    .addComponent(truncamiento))
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
       //boton para mostrar el resultado
        System.exit(0);
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void truncamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truncamientoActionPerformed

        //metodo trunck
    String primera,segunda,obde;
    int d;
    primera=p.getText();
    segunda=pa.getText();
    double pri,pro;
    pri=Double.parseDouble(primera);
    pro=Double.parseDouble(segunda);
    
    double P,Q;
    P=pri;
    Q=pro;
    double EA,ER;
    EA = Math.abs(P - Q);
    ER = Math.abs((P - Q) / P);
    
    
   
    obde=decimal.getText();
    d=Integer.parseInt(obde);
    
    // metodo trunk 
    NumberFormat numberFormat = NumberFormat.getInstance();
    numberFormat.setMaximumFractionDigits(d);
    numberFormat.setRoundingMode( RoundingMode.DOWN);
    
     String nueva=numberFormat.format(EA);
     String nuevaa=numberFormat.format(ER);
// truncamos un número
    
    ///
    resultado n = new resultado();
    n.ere.setText(nueva);
    n.era1.setText(nuevaa);
    
    n.setVisible(true);
    this.setVisible(false);    
    }//GEN-LAST:event_truncamientoActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        // metodo redondeo
    }//GEN-LAST:event_decimalActionPerformed

    private void redondeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redondeoActionPerformed
String primera,segunda,obde;
    int d;
    primera=p.getText();
    segunda=pa.getText();
    double pri,pro;
    pri=Double.parseDouble(primera);
    pro=Double.parseDouble(segunda);
    
    double P,Q;
    P=pri;
    Q=pro;
    double EA,ER;
    EA = Math.abs(P - Q);
    ER = Math.abs((P - Q) / P);
    
    
   
    obde=decimal.getText();
    d=Integer.parseInt(obde);     
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(d);
            numberFormat.setRoundingMode(RoundingMode.HALF_UP);
            
            double resulf;
            String resulf2;
            String l =numberFormat.format(EA);
            String lL =numberFormat.format(ER);
            resultado n = new resultado();
            
            n.ere.setText(l);
            n.era1.setText(lL);
    
    n.setVisible(true);
    this.setVisible(false);    
    
    }//GEN-LAST:event_redondeoActionPerformed
  
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
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new errores().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField decimal;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextPane p;
    public static javax.swing.JTextPane pa;
    public static javax.swing.JRadioButton redondeo;
    public static javax.swing.JRadioButton truncamiento;
    // End of variables declaration//GEN-END:variables
}
