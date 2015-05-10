/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BDD.*;
import dataElements.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Axel
 */
public class GUI_login extends javax.swing.JFrame {

    /**
     * Creates new form GUI_login
     */
    private Connexion C;
    
    public GUI_login() {
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

        lblLogin = new javax.swing.JLabel();
        lblIdCampus = new javax.swing.JLabel();
        txtIdCampus = new javax.swing.JTextField();
        lblMdpCampus = new javax.swing.JLabel();
        pswdMdpCampus = new javax.swing.JPasswordField();
        lblIdBdd = new javax.swing.JLabel();
        txtIdBdd = new javax.swing.JTextField();
        lblMdpBdd = new javax.swing.JLabel();
        pswdMdpBdd = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogin.setText("Login / Connection à la base de donnée");

        lblIdCampus.setText("Identifiant Campus ECE");

        txtIdCampus.setText("wickham");

        lblMdpCampus.setText("Mots de passe Campus ECE");

        pswdMdpCampus.setText("49NS/yloP.");
        pswdMdpCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdMdpCampusActionPerformed(evt);
            }
        });

        lblIdBdd.setText("Identifiant base de données (en rw c'est mieux)");

        txtIdBdd.setText("wickham-rw");
        txtIdBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBddActionPerformed(evt);
            }
        });

        lblMdpBdd.setText("Mot de passe Base de données");

        pswdMdpBdd.setText("dfD2njT8");
        pswdMdpBdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdMdpBddActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 102, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setText("Connection");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pswdMdpBdd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMdpBdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdBdd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdCampus, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdCampus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMdpCampus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswdMdpCampus, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdBdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIdCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMdpCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pswdMdpCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdBdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMdpBdd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswdMdpBdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBddActionPerformed

    private void pswdMdpCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdMdpCampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdMdpCampusActionPerformed

    private void pswdMdpBddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdMdpBddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdMdpBddActionPerformed
    
    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        //Stockage des IDs en local (temporaire)
        PrintWriter writer;
        try {
            writer = new PrintWriter("password.txt", "UTF-8");
            writer.println(txtIdCampus.getText());
            writer.println(pswdMdpCampus.getText());
            writer.println(txtIdBdd.getText());
            writer.println(pswdMdpBdd.getText());
            writer.close();    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI_login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(GUI_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // utiliser txtIdCampus pswdMdpCampus txtIdBdd pswdMdpBdd dans requete pour ce connecter à la bdd
        try {
            C = new Connexion(txtIdCampus.getText(),pswdMdpCampus.getText(),txtIdBdd.getText(),pswdMdpBdd.getText());
            
            GUI_Hospital ghosto = new GUI_Hospital();
            this.dispose();
            C.destroy();
            ghosto.setVisible(true);
           
        } catch (SQLException ex) {
            Logger.getLogger(GUI_login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblIdBdd;
    private javax.swing.JLabel lblIdCampus;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMdpBdd;
    private javax.swing.JLabel lblMdpCampus;
    private javax.swing.JPasswordField pswdMdpBdd;
    private javax.swing.JPasswordField pswdMdpCampus;
    private javax.swing.JTextField txtIdBdd;
    private javax.swing.JTextField txtIdCampus;
    // End of variables declaration//GEN-END:variables
}
