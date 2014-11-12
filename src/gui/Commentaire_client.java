package gui;

import DAO.classes.CommentaireDAO;
import DAO.interfaces.ICommentaireDAO;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import entities.Commentaire;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CLIENT
 */
public class Commentaire_client extends javax.swing.JFrame {

    /**
     */
    public Commentaire_client() {
        initComponents();
                this.setLocationRelativeTo(null);

    }

    public Commentaire_client(int a, String c, String d) {

        initComponents();
        //JOptionPane.showMessageDialog(null, a);

        moiInput.setText(c);
        clientInput.setText(d);
        String x = Integer.toString(a);
        idinput.setText(x);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        commentaireclientInput = new java.awt.Label();
        label2 = new java.awt.Label();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        moiInput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientInput = new javax.swing.JTextArea();
        idinput = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jBt_backChart = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        commentaireclientInput.setText("Client");

        label2.setText("Moi");

        jButton5.setText("Commenter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Annuler");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        moiInput.setColumns(20);
        moiInput.setRows(5);
        moiInput.setText("aaaaaa");
        jScrollPane1.setViewportView(moiInput);

        clientInput.setColumns(20);
        clientInput.setRows(5);
        jScrollPane2.setViewportView(clientInput);

        idinput.setForeground(new java.awt.Color(204, 204, 204));
        idinput.setText("      ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commentaireclientInput, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(idinput)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(26, 26, 26)
                .addComponent(jButton6)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(commentaireclientInput, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(59, 59, 59)
                .addComponent(idinput)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 112, -1, -1));

        jButton3.setText("Acceuil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 149, 190, 34));

        jBt_backChart.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBt_backChart.setForeground(new java.awt.Color(255, 255, 255));
        jBt_backChart.setIcon(new javax.swing.ImageIcon("C:\\Users\\houssem\\Desktop\\Iconic_2190(0)_64 2.png")); // NOI18N
        jBt_backChart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBt_backChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBt_backChartMouseClicked(evt);
            }
        });
        jBt_backChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_backChartActionPerformed(evt);
            }
        });
        getContentPane().add(jBt_backChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 50));

        jButton1.setText("Mon compte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 214, 190, 39));

        jButton2.setText("Recherche");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 284, 190, 41));

        jButton4.setText("Contact");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 355, 190, 38));

        jButton8.setText("Feedback");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 431, 190, 41));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        this.setVisible(false);
        Compte_client add = new Compte_client();
        add.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Commentaire com = new Commentaire();
        com.setCommentaire(moiInput.getText());
        com.setReponse(clientInput.getText());
        com.setIdCommentaire(Integer.parseInt(idinput.getText()));



        ICommentaireDAO msgdao = CommentaireDAO.getInstance();
        msgdao.updateCommentaire(com);





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jBt_backChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBt_backChartMouseClicked
        // TODO add your handling code here:
        // SuperAdmin ins = new SuperAdmin();
        // ins.setVisible(true);
        this.setVisible(false);
        pack();
    }//GEN-LAST:event_jBt_backChartMouseClicked

    private void jBt_backChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_backChartActionPerformed
        // TODO add your handling code here:
        Compte_client add=new Compte_client();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBt_backChartActionPerformed

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
//            java.util.logging.Logger.getLogger(gestcompclient_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
  //          java.util.logging.Logger.getLogger(gestcompclient_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
    //        java.util.logging.Logger.getLogger(gestcompclient_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      //      java.util.logging.Logger.getLogger(gestcompclient_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                                    try {
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());

   new Commentaire_client().setVisible(true);
                                    } catch (        UnsupportedLookAndFeelException | ParseException ex) {
                    Logger.getLogger(Commentaire_client.class.getName()).log(Level.SEVERE, null, ex);
                }


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea clientInput;
    private java.awt.Label commentaireclientInput;
    private javax.swing.JLabel idinput;
    private javax.swing.JButton jBt_backChart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label2;
    private javax.swing.JTextArea moiInput;
    // End of variables declaration//GEN-END:variables
}