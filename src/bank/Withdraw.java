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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chira
 */
public class Withdraw extends javax.swing.JInternalFrame {

    /**
     * Creates new form Deposit
     */
    public Withdraw() {
        initComponents();
        date();
    }
    
    Connection con;
    PreparedStatement pst;
    PreparedStatement update;
    
    public void date(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        
        jLabel8.setText(date);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcustid = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtacc = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1022, 531));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 266, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 324, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 382, -1, -1));

        txtcustid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtcustid.setForeground(new java.awt.Color(255, 255, 255));
        txtcustid.setText("..");
        getContentPane().add(txtcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 264, -1, -1));

        txtfirstname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtfirstname.setForeground(new java.awt.Color(255, 255, 255));
        txtfirstname.setText("..");
        getContentPane().add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 322, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("..");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 438, -1, -1));

        txtlastname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtlastname.setForeground(new java.awt.Color(255, 255, 255));
        txtlastname.setText("..");
        getContentPane().add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BALANCE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        txtbalance.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtbalance.setForeground(new java.awt.Color(255, 255, 255));
        txtbalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbalance.setText("..");
        getContentPane().add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 132, 114, -1));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enter Withdrawal Amount");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        txtamount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtamount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });
        getContentPane().add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 279, 261, 37));

        jButton1.setText("Withdraw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 393, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 393, -1, -1));

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 153, -1, -1));

        txtacc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtacc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 87, 232, -1));

        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 153, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter the Account No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 42, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/copy3.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamountActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try {
            String accno = txtacc.getText();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bankdatabase","root","Chir@g244724");
            pst = con.prepareStatement("select c.customerid, c.firstname, c.lastname, a.balance from customer c, account a where c.customerid = a.customerid and a.accountid = ?");
            
            pst.setString(1, accno);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Account not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txtacc.setText("");
                    txtacc.requestFocus();
            }
            else
            {
                String id = rs.getString(1);
                String firstname = rs.getString(2);
                String lastname = rs.getString(3);
                String balance = rs.getString(4);
                
                txtcustid.setText(id.trim());
                txtfirstname.setText(firstname.trim());
                txtlastname.setText(lastname.trim());
                txtbalance.setText(balance.trim());
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        txtacc.setText("");
        txtacc.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            // TODO add your handling code here:
            con.setAutoCommit(false);
            String accno = txtacc.getText();
            String custid = txtcustid.getText();
            String date = jLabel8.getText();
            String balance = txtbalance.getText();
            String withdraw = txtamount.getText();
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bankdatabase","root","Chir@g244724");
            pst = con.prepareStatement("insert into withdraw(accountid, customerid, date, balance, withdraw)values(?,?,?,?,?)");
            pst.setString(1, accno);
            pst.setString(2,custid);
            pst.setString(3,date);
            pst.setString(4,balance);
            pst.setString(5,withdraw);
            
            pst.executeUpdate();
            
            
            update = con.prepareStatement("update account set balance = balance - ? where accountid = ?");
            update.setString(1, withdraw);
            update.setString(2, accno);
            
            update.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Ammount Withdraw Successfully.....");
            con.commit();

            
            txtacc.setText("");
            txtcustid.setText("");
            txtbalance.setText("");
            txtamount.setText("");
            txtfirstname.setText("");
            txtlastname.setText("");
            txtacc.requestFocus();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            try {
                con.rollback();
                Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex1) {
                Logger.getLogger(Withdraw.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtacc;
    private javax.swing.JTextField txtamount;
    private javax.swing.JLabel txtbalance;
    private javax.swing.JLabel txtcustid;
    private javax.swing.JLabel txtfirstname;
    private javax.swing.JLabel txtlastname;
    // End of variables declaration//GEN-END:variables
}
