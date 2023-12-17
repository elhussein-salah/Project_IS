/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dental_clinic_sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class settings extends javax.swing.JFrame {

    
    public settings() {
        initComponents();
        dtm = new DefaultTableModel();
        
        dtm.addColumn("Id");
        dtm.addColumn("Username");
        dtm.addColumn("Password");
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
        fillTable();
    }
    //Login login = new Login();
    
    
    
    DefaultTableModel dtm;
    Connection con;
    Statement  stm; 

    public void fillTable(){
        dtm.setRowCount(0);
        try {
            PreparedStatement stmt = con.prepareStatement("select id,username , passwd from users;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3)});
            }
            
            tbl_show.setModel(dtm);
        
        } catch (SQLException ex) {
            Logger.getLogger(settings.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        upnewpass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnDel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        upUser = new javax.swing.JTextField();
        edtAddConPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_AddUser = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        etdDeluser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        edtAddUser1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edtAddPass1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_show = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 296, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 10));
        jPanel1.add(upnewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 140, -1));

        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel7.setText("Username");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        btnDel.setText("delete user");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanel1.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("delete User");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));
        jPanel1.add(upUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 140, -1));
        jPanel1.add(edtAddConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 140, -1));

        jLabel5.setText("Confirm");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("update user");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        btn_AddUser.setText("add user");
        btn_AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddUserActionPerformed(evt);
            }
        });
        jPanel1.add(btn_AddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 83, 20));
        jPanel1.add(etdDeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 137, -1));

        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Add User");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 83, 10));

        jLabel10.setText("Username");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(edtAddUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 140, -1));

        jLabel11.setText("New Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        jPanel1.add(edtAddPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 140, -1));

        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnUpdate.setText("update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        tbl_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tbl_show);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 40, 310, 570));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Users table");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jCheckBox1.setText("show password");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 296, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        String username = etdDeluser.getText();
        if(! username.isEmpty()){
            try{
                stm = con.createStatement();
                ResultSet  rs = stm.executeQuery("select username from users where username="+"'"+username+"'");
                if(rs.next()){
                String sql = "DELETE FROM users WHERE username="+"'"+username+"'";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.executeUpdate();
                fillTable();
                 }
                else
                    JOptionPane.showMessageDialog(this, "username doesn't exist !");
            }
            catch (SQLException ex) {
            Logger.getLogger(settings.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
        else
            JOptionPane.showMessageDialog(this, "fill username field first !");

        
    }//GEN-LAST:event_btnDelActionPerformed

    private void btn_AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddUserActionPerformed
        // TODO add your handling code here:
        String password,username,confirmPassword;
        username = edtAddUser1.getText();
        password = edtAddPass1.getText();
        confirmPassword = edtAddConPass.getText();
        if(!username.isEmpty() && !password.isEmpty() && !confirmPassword.isEmpty()){
            if(password.equals(confirmPassword)){
            try {
            PreparedStatement stmt = con.prepareStatement("insert into users(username,passwd) values(?,?) ;");
            stmt.setString(1,username);
            stmt.setString(2,password);
            stmt.executeUpdate();
            fillTable();
            JOptionPane.showMessageDialog(this, "added successfully!");
//            while (rs.next()) {
//                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2)});
//            }
            
        //    tbl_show.setModel(dtm);
        
        } catch (SQLException ex) {
            Logger.getLogger(settings.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }   
    }//GEN-LAST:event_btn_AddUserActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String username , newPassword;
        username = upUser.getText();
        newPassword = upnewpass.getText();
        
        if(!username.isEmpty()   && !newPassword.isEmpty()){
           String sql="select username, passwd from users where username="+"'"+username+"'";
            
             try {
                stm = con.createStatement();
                ResultSet  rs = stm.executeQuery(sql);
                if(rs.next()){
                PreparedStatement stmt = con.prepareStatement("UPDATE users SET passwd="+"'"+newPassword+"' where username="+"'"+username+"';");
                stmt.executeUpdate();
                fillTable();
                }
                else
                    JOptionPane.showMessageDialog(this, "username or password wrong !");
                
             } catch (SQLException ex) {
                Logger.getLogger(settings.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "fill username, new password first !");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_AddUser;
    private javax.swing.JPasswordField edtAddConPass;
    private javax.swing.JPasswordField edtAddPass1;
    private javax.swing.JTextField edtAddUser1;
    private javax.swing.JTextField etdDeluser;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable tbl_show;
    private javax.swing.JTextField upUser;
    private javax.swing.JPasswordField upnewpass;
    // End of variables declaration//GEN-END:variables
}
