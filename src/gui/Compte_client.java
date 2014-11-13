/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.classes.FavorisDAO;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import entities.Util;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jemacom
 */
public class Compte_client extends javax.swing.JFrame {

    /**
     * Creates new form Acceuil
     */
    public Compte_client() {
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
        bt_mon_compte = new javax.swing.JButton();
        bt_recherche = new javax.swing.JButton();
        login_agent_connecte = new javax.swing.JLabel();
        bt_mes_favoris = new javax.swing.JButton();
        bt_a_propos = new javax.swing.JButton();
        bt_mes_offres = new javax.swing.JButton();
        bt_desconnecter = new javax.swing.JButton();
        bt_contact = new javax.swing.JButton();
        bt_message = new javax.swing.JButton();
        bt_commentaire = new javax.swing.JButton();

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

        bt_mon_compte.setText("Mon compte");
        bt_mon_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mon_compteActionPerformed(evt);
            }
        });

        bt_recherche.setText("Recherche Avancee");
        bt_recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rechercheActionPerformed(evt);
            }
        });

        login_agent_connecte.setText("Acceuil client:");

        bt_mes_favoris.setText("Mes favoris");
        bt_mes_favoris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mes_favorisActionPerformed(evt);
            }
        });

        bt_a_propos.setText("A propos");
        bt_a_propos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_a_proposActionPerformed(evt);
            }
        });

        bt_mes_offres.setText("Mes offres");
        bt_mes_offres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mes_offresActionPerformed(evt);
            }
        });

        bt_desconnecter.setText("Déconnecter");
        bt_desconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_desconnecterActionPerformed(evt);
            }
        });

        bt_contact.setText("Contact");
        bt_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_contactActionPerformed(evt);
            }
        });

        bt_message.setText("Message");

        bt_commentaire.setText("Commentaire");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_agent_connecte, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_a_propos)
                            .addComponent(bt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_mes_offres)
                            .addComponent(bt_mes_favoris)
                            .addComponent(bt_mon_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(248, 248, 248)
                        .addComponent(bt_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_recherche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                        .addComponent(bt_commentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addComponent(bt_desconnecter)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_agent_connecte, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_desconnecter))
                .addGap(69, 69, 69)
                .addComponent(bt_mon_compte)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(bt_mes_favoris))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bt_message, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(bt_mes_offres)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_recherche)
                    .addComponent(bt_commentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_contact)
                .addGap(18, 18, 18)
                .addComponent(bt_a_propos)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_mon_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mon_compteActionPerformed
        CompteClient cc = new CompteClient();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_mon_compteActionPerformed

    private ImageIcon createIcon(String path) {
        URL url = getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable de load the image !" + path);
            return null;
        }

        ImageIcon icon = new ImageIcon(url);
        return icon;

    }
    private void bt_rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rechercheActionPerformed
        RechercheAvancee ra = new RechercheAvancee();
        ra.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_rechercheActionPerformed

    private void bt_a_proposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_a_proposActionPerformed
        Apropos ap = new Apropos();
        ap.setVisible(true);

    }//GEN-LAST:event_bt_a_proposActionPerformed

    private void bt_mes_favorisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mes_favorisActionPerformed
        Client_MesFavoris cmf = new Client_MesFavoris();
        cmf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_mes_favorisActionPerformed

    private void bt_mes_offresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mes_offresActionPerformed
        Client_MesOffres mo = new Client_MesOffres();
        mo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_mes_offresActionPerformed

    private void bt_desconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_desconnecterActionPerformed
        Util.id_agent_connecte = 0;
        Util.role_agent_connecte = "";
        Util.login_agent_connecte = "";
        Util.nom_agent_connecte = "";
        Util.prenom_agent_connecte = "";
        Util.adresse_agent_connecte = "";
        Util.email_agent_connecte = "";
        Util.telephone_agent_connecte = "";
        Authentification au = new Authentification();
        au.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
//        System.exit(WIDTH);
    }//GEN-LAST:event_bt_desconnecterActionPerformed

    private void bt_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_contactActionPerformed
        Message_client mc = new Message_client();
        mc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_contactActionPerformed

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
            java.util.logging.Logger.getLogger(Compte_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compte_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compte_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compte_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                    new Compte_client().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Compte_client.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Compte_client.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_a_propos;
    private javax.swing.JButton bt_commentaire;
    private javax.swing.JButton bt_contact;
    private javax.swing.JButton bt_desconnecter;
    private javax.swing.JButton bt_mes_favoris;
    private javax.swing.JButton bt_mes_offres;
    private javax.swing.JButton bt_message;
    private javax.swing.JButton bt_mon_compte;
    private javax.swing.JButton bt_recherche;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel login_agent_connecte;
    // End of variables declaration//GEN-END:variables

}
