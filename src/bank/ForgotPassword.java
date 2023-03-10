/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chira
 */
public class ForgotPassword extends javax.swing.JInternalFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
    }
    
    Connection con;
    PreparedStatement pst;

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtold = new javax.swing.JTextField();
        txtnew = new javax.swing.JTextField();
        txtconfirm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password Update");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Old Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 150, -1));
        getContentPane().add(txtold, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 150, -1));
        getContentPane().add(txtnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 150, -1));
        getContentPane().add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 150, -1));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/last.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String username = txtusername.getText();
        String oldpassword = txtold.getText();
        String newpassword = txtnew.getText();
        String confirmpassword = txtconfirm.getText();
        
        try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/bankdatabase","root","Chir@g244724");
                pst = con.prepareStatement("select * from admin where username=? and password=?");
                pst.setString(1,username);
                pst.setString(2,oldpassword);

                ResultSet rs = pst.executeQuery();
                
                if(rs.next())
                {
                    pst = con.prepareStatement("update admin set password=? where username=?");
                        
                    pst.setString(1,newpassword);
                    pst.setString(2,username);
                    if(newpassword.equals(confirmpassword))
                    {
                        pst.executeUpdate();
                        this.hide();
                        JOptionPane.showMessageDialog(null, "Password Updated Successfully.....");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "New and Confirm Password Not Matched.....");
                        txtnew.setText("");
                        txtconfirm.setText("");
                        txtnew.requestFocus();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Either UserName or Old Password not Matched.....");
                    txtusername.setText("");
                    txtold.setText("");
                    txtnew.setText("");
                    txtconfirm.setText("");
                    txtusername.requestFocus();
                }
            } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ForgotPassword.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        
        txtusername.setText("");
        txtold.setText("");
        txtnew.setText("");
        txtconfirm.setText("");
        
        txtusername.requestFocus();
        
    }//GEN-LAST:event_ResetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.hide();
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtconfirm;
    private javax.swing.JTextField txtnew;
    private javax.swing.JTextField txtold;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
