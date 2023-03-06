/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bank;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author chira
 */
public class Account extends javax.swing.JInternalFrame {

    /**
     * Creates new form Customer
     */
    public Account() {
        initComponents();
        autoID();
    }
    
    Connection con;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void autoID()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bankdatabase", "root", "Chir@g244724");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(accountid) from account");
            rs.next();
            rs.getString("MAX(accountid)");
            if(rs.getString("MAX(accountid)") == null)
            {
                txtaccno.setText("AU001");
            }
            else
            {
                long id = Long.parseLong(rs.getString("MAX(accountid)").substring(2, rs.getString("MAX(accountid)").length()));
                id++;
                txtaccno.setText("AU" + String.format("%03d", id));
            }
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtcustid = new javax.swing.JTextField();
        txtcustname = new javax.swing.JTextField();
        txtaccount = new javax.swing.JComboBox<>();
        txtbalance = new javax.swing.JTextField();
        txtaccno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("New Account Creation");
        setPreferredSize(new java.awt.Dimension(788, 545));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Add");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        jButton2.setText("Cancel");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        jButton3.setText("Find");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        txtcustid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 169, -1));

        txtcustname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtcustname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 169, -1));

        txtaccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtaccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAVINGS", "FIXED", "CURRENT" }));
        txtaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccountActionPerformed(evt);
            }
        });
        getContentPane().add(txtaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 169, -1));

        txtbalance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 169, -1));

        txtaccno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtaccno.setForeground(new java.awt.Color(255, 255, 255));
        txtaccno.setText("..");
        getContentPane().add(txtaccno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 169, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Balance");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/copy1.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String accno = txtaccno.getText();
        String custid = txtcustid.getText();
        String custname = txtcustname.getText();
        String balance = txtbalance.getText();
        String acctype = txtaccount.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bankdatabase","root","Chir@g244724");
            pst = con.prepareStatement("insert into account(accountid, customerid, accounttype, balance)values(?,?,?,?)");
            pst.setString(1, accno);
            pst.setString(2,custid);
            pst.setString(3,acctype);
            pst.setString(4,balance);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Account Created Successfully.....");
            
            txtcustid.setText("");
            txtcustname.setText("");
            txtbalance.setText("");
            txtaccount.setSelectedIndex(-1);   
            autoID();
            txtcustid.requestFocus();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            String custid = txtcustid.getText();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bankdatabase","root","Chir@g244724");
            pst = con.prepareStatement("select * from customer where customerid = ?");
            pst.setString(1, custid);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Record not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txtcustid.setText("");
                    txtcustid.requestFocus();
            }
            else
            {
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                
                String name = firstname + " " + lastname;
                
                txtcustname.setText(name.trim());
                
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txtaccno;
    private javax.swing.JComboBox<String> txtaccount;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcustid;
    private javax.swing.JTextField txtcustname;
    // End of variables declaration//GEN-END:variables
}