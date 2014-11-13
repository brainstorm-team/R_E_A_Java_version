/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.classes.FavorisDAO;
import DAO.classes.OffreDAO;
import DAO.interfaces.IOffreDAO;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import entities.Offre;
import entities.Util;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Gerant_MesOffres extends javax.swing.JFrame {

    private JPopupMenu popup;
    /**
     * Creates new form MesOffres
     */
    public Gerant_MesOffres() {
        initComponents();
        this.setLocationRelativeTo(null);
        popup = new JPopupMenu();
        
        JMenuItem removeItem =  new JMenuItem("Supprimer offre");
        JMenuItem DetailsItem =  new JMenuItem("Details offre");
        
        popup.add(removeItem);
        popup.add(DetailsItem);
        
        
        table.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                JTable table =(JTable) e.getSource();
                Point p = e.getPoint();
                int row = table.rowAtPoint(p);
                
                
                System.out.println(row);
                if (e.getButton() ==  MouseEvent.BUTTON3){
                    popup.show(table , e.getX() , e.getY());
                }
            }
            
        });
        DetailsItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int row =table.getSelectedRow();
                /*Ouverture fenetre Details offre*/
                
            }
        });
        
        
        removeItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                
                int row =table.getSelectedRow();
                int column = table.getSelectedColumn();
                //int dialogButton = JOptionPane.YES_NO_OPTION;
                System.out.println(row+" ---- "+column);
                System.out.println("my id "+table.getModel().getValueAt(table.getSelectedRow(), 10));
//                Util.idOffreASupprimer = row;
//                int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);
//                if(dialogResult == JOptionPane.YES_OPTION){
                OffreDAO.getInstance().deleteOffre((int)table.getModel().getValueAt(table.getSelectedRow(), 10));
                table.setModel(new ListMesOffres());
               // }
            }
            
            
        });
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bt_acceuil = new javax.swing.JButton();
        bt_mon_compte = new javax.swing.JButton();
        bt_mes_favoris = new javax.swing.JButton();
        bt_recherche = new javax.swing.JButton();
        bt_a_propos = new javax.swing.JButton();
        bt_ajouter_offre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new ListMesOffres());
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Mes offres");

        bt_acceuil.setText("Acceuil");
        bt_acceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_acceuilActionPerformed(evt);
            }
        });

        bt_mon_compte.setText("Mon compte");
        bt_mon_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mon_compteActionPerformed(evt);
            }
        });

        bt_mes_favoris.setText("Mes favoris");
        bt_mes_favoris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mes_favorisActionPerformed(evt);
            }
        });

        bt_recherche.setText("Recherche avancee");
        bt_recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rechercheActionPerformed(evt);
            }
        });

        bt_a_propos.setText("A propos");
        bt_a_propos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_a_proposActionPerformed(evt);
            }
        });

        bt_ajouter_offre.setText("Ajouter offre");
        bt_ajouter_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ajouter_offreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_acceuil)
                    .addComponent(bt_mon_compte)
                    .addComponent(bt_recherche)
                    .addComponent(bt_mes_favoris, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_a_propos)
                    .addComponent(bt_ajouter_offre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bt_acceuil)
                        .addGap(19, 19, 19)
                        .addComponent(bt_ajouter_offre)
                        .addGap(18, 18, 18)
                        .addComponent(bt_mon_compte)
                        .addGap(18, 18, 18)
                        .addComponent(bt_mes_favoris)
                        .addGap(18, 18, 18)
                        .addComponent(bt_recherche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_a_propos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_acceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_acceuilActionPerformed
        Acceuil_client acc = new Acceuil_client();
        acc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_acceuilActionPerformed

    private void bt_mon_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mon_compteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_mon_compteActionPerformed

    private void bt_rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rechercheActionPerformed
        RechercheAvancee ra = new RechercheAvancee();
        ra.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_rechercheActionPerformed

    private void bt_ajouter_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ajouter_offreActionPerformed
        Gerant_AjoutOffre cao = new Gerant_AjoutOffre();
        cao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_ajouter_offreActionPerformed

    private void bt_a_proposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_a_proposActionPerformed
        Apropos ap = new Apropos();
        ap.setVisible(true);
    }//GEN-LAST:event_bt_a_proposActionPerformed

    private void bt_mes_favorisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mes_favorisActionPerformed
        Client_MesFavoris cmf = new Client_MesFavoris();
        cmf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_mes_favorisActionPerformed

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
            java.util.logging.Logger.getLogger(Gerant_MesOffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerant_MesOffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerant_MesOffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerant_MesOffres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                    
                    new Gerant_MesOffres().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Acceuil_client.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Acceuil_client.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_a_propos;
    private javax.swing.JButton bt_acceuil;
    private javax.swing.JButton bt_ajouter_offre;
    private javax.swing.JButton bt_mes_favoris;
    private javax.swing.JButton bt_mon_compte;
    private javax.swing.JButton bt_recherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
