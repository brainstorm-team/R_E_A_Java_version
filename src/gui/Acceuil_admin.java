/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import entities.Util;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jemacom
 */
public class Acceuil_admin extends javax.swing.JFrame {

    /**
     * Creates new form Acceuil
     */
    public Acceuil_admin() {
        initComponents();
        login_agent_connecte.setText("Bonjour  " + Util.login_agent_connecte + " ;) ");
        this.setLocationRelativeTo(null);
        login_agent_connecte.setIcon(createIcon("/images/home.gif"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_offres = new javax.swing.JTable();
        login_agent_connecte = new javax.swing.JLabel();
        bt_a_propos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt_deconnecter = new javax.swing.JButton();
        bt_gestion_compte_client = new javax.swing.JButton();
        bt_gestion_compte_gerant = new javax.swing.JButton();
        bt_visualiser_stat = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_offres.setModel(new ListOffreNonValide());
        jScrollPane1.setViewportView(table_offres);

        login_agent_connecte.setText("Acceuil admin:");

        bt_a_propos.setText("A propos");
        bt_a_propos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_a_proposActionPerformed(evt);
            }
        });

        jLabel1.setText("Liste des offres à validé");

        bt_deconnecter.setText("Déconnecter");
        bt_deconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deconnecterActionPerformed(evt);
            }
        });

        bt_gestion_compte_client.setText("Gestion des comptes clients");
        bt_gestion_compte_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gestion_compte_clientActionPerformed(evt);
            }
        });

        bt_gestion_compte_gerant.setText("Gestion des comptes gérants");
        bt_gestion_compte_gerant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gestion_compte_gerantActionPerformed(evt);
            }
        });

        bt_visualiser_stat.setText("Visualiser statistique");
        bt_visualiser_stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_visualiser_statActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_a_propos)
                    .addComponent(bt_gestion_compte_client)
                    .addComponent(bt_gestion_compte_gerant)
                    .addComponent(bt_visualiser_stat)
                    .addComponent(login_agent_connecte, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_deconnecter)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(login_agent_connecte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(bt_gestion_compte_client)
                        .addGap(32, 32, 32)
                        .addComponent(bt_gestion_compte_gerant)
                        .addGap(27, 27, 27)
                        .addComponent(bt_visualiser_stat)
                        .addGap(32, 32, 32)
                        .addComponent(bt_a_propos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(bt_deconnecter))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon createIcon(String path) {
        URL url = getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable de load the image !" + path);
            return null;
        }

        ImageIcon icon = new ImageIcon(url);
        return icon;

    }
    private void bt_a_proposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_a_proposActionPerformed
        Apropos ap = new Apropos();
        ap.setVisible(true);

    }//GEN-LAST:event_bt_a_proposActionPerformed

    private void bt_deconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deconnecterActionPerformed
        Util.id_agent_connecte = 0;
        Util.role_agent_connecte = "";
        Util.login_agent_connecte = "";
        Util.nom_agent_connecte = "";
        Util.prenom_agent_connecte = "";
        Util.adresse_agent_connecte = "";
        Util.email_agent_connecte = "";
        Util.telephone_agent_connecte ="";
        Authentification au = new Authentification();
        au.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
//        System.exit(WIDTH);
    }//GEN-LAST:event_bt_deconnecterActionPerformed

    private void bt_gestion_compte_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gestion_compte_clientActionPerformed
        Gestion_CompteClient gcc = new Gestion_CompteClient();
        gcc.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_bt_gestion_compte_clientActionPerformed

    private void bt_gestion_compte_gerantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gestion_compte_gerantActionPerformed
        Gestion_CompteGerant gcg = new Gestion_CompteGerant();
        gcg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_gestion_compte_gerantActionPerformed

    private void bt_visualiser_statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_visualiser_statActionPerformed
        Chart c = new Chart();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_visualiser_statActionPerformed

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
            java.util.logging.Logger.getLogger(Acceuil_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());

                    new Acceuil_admin().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Acceuil_admin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Acceuil_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_a_propos;
    private javax.swing.JButton bt_deconnecter;
    private javax.swing.JButton bt_gestion_compte_client;
    private javax.swing.JButton bt_gestion_compte_gerant;
    private javax.swing.JButton bt_visualiser_stat;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel login_agent_connecte;
    private javax.swing.JTable table_offres;
    // End of variables declaration//GEN-END:variables

}
