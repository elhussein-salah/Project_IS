/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dental_clinic_sys;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asmaa
 */


public class Examination extends javax.swing.JFrame {
    String first  , last , phonenum , history  , status,phone  ;
    double price ; 
    
    static HashMap<String,Integer>  material = new HashMap<String,Integer>();
    public void getMatrial(HashMap<String,Integer>  m){
        try {
            String sql = "select NameResource and NumberResource from resources";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                m.put(rs.getString("NameResource"),rs.getInt("NumberResource") );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Examination.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //DefaultTableModel dtm ; 
    
    
    
    Connection con;
    //ArrayList<Integer> deptsIds = new ArrayList<>();
    
    /**
     * Creates new form Examination
     */
    public Examination() {
        initComponents();
        this.setLocationRelativeTo(null);
        getMatrial(material);
      
        try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection failed");
        }
        
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        finame = new javax.swing.JTextField();
        laname = new javax.swing.JTextField();
        statuecombobox = new javax.swing.JComboBox<>();
        date = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        edt_phone = new javax.swing.JTextField();
        Labelcost = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examination ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel2.add(finame, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 218, 30));

        laname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        laname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanameActionPerformed(evt);
            }
        });
        jPanel2.add(laname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, 30));

        statuecombobox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        statuecombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cavities", "Gingivitis/Periodontitis", "Tooth Sensitivity", "Tooth Abscess", "Bad Breath", "Malocclusion" }));
        statuecombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                statuecomboboxItemStateChanged(evt);
            }
        });
        jPanel2.add(statuecombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 170, -1));

        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 230, 30));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 139, -1));
        jPanel2.add(edt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, 40));

        Labelcost.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Labelcost.setText("Cost:");
        Labelcost.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(Labelcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("FirstName:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Phone:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 120, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Date:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, 30));

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, 80, 960, 340));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("SecondName:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (!finame.getText().isEmpty() &&  ! laname.getText().isEmpty() &&  ! date.getText().isEmpty() && ! edt_phone.getText().isEmpty()){
           
            try {
                first = finame.getText();
                last = laname.getText() ;
                history = date.getText();
                phone = edt_phone.getText();
                int counter;
                status = statuecombobox.getSelectedItem().toString();
                String sql = "select * from customers where first_name="+"'"+first+"'"+" and last_name="+"'"+last+"'"+" and phone="+"'"+phone+"'";
                PreparedStatement stmt1 = con.prepareStatement(sql);
                ResultSet rs = stmt1.executeQuery(sql);
                
                
                if(rs.next()){
                //JOptionPane.showMessageDialog(this, first +fir " " + last + " " + history + " " + statue );
                 //String sql = "select * from customers where First_name='" + first +"' AND Last_name='" + last +"'AND phone="' ";
                PreparedStatement stmt = con.prepareStatement("insert into records(first_name,last_name,phone,age,gender,address ,date_, status_ , cost ) values(?,?,?,?,? ,?,?,?,?)");
                   stmt.setString(1, first); 
                   stmt.setString(2, last); 
                   stmt.setString(3, phone); 
                   stmt.setInt(4, rs.getInt("age")); 
                   stmt.setString(5, rs.getString("gander"));
                   stmt.setString(6, rs.getString("address"));
                   stmt.setString(7, history);
                   stmt.setString(8,status); 
                   stmt.setDouble(9, price); 
                   switch (status){
                    case "Cavities":
                        Labelcost.setText("700");
                        price = 700 ;
                        
                        counter = material.get("Dental drill");
                        counter--;
                        material.put("Dental drill", counter);
                        
                        counter = material.get("Dental bur");
                        counter--;
                        material.put(" Dental bur", counter);
                        
                        counter = material.get("Excavator");
                        counter--;
                        material.put(" Excavator", counter);
                        {
                        PreparedStatement stmtr1 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental drill") +" WHERE Id=11" );
                        PreparedStatement stmtr2 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental bur") +" WHERE Id=8" );
                        PreparedStatement stmtr3 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Excavator") +" WHERE Id=18" );
              
                        stmtr1.executeQuery();
                        stmtr2.executeQuery();
                        stmtr3.executeQuery();
                        }
                        break;
                        
                    case "Gingivitis/Periodontitis":
                        Labelcost.setText("800");
                        price = 800 ; 
                        
                        counter = material.get("Dental drill");
                        counter--;
                        material.put("Dental drill", counter);
                        
                        counter = material.get("Dental bur");
                        counter--;
                        material.put(" Dental bur", counter);
                        
                        counter = material.get("Excavator");
                        counter--;
                        material.put(" Excavator", counter);
                        {
                        PreparedStatement stmtr1 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental drill") +" WHERE Id=11" );
                        PreparedStatement stmtr2 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental bur") +" WHERE Id=8" );
                        PreparedStatement stmtr3 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Excavator") +" WHERE Id=18" );
              
                        stmtr1.executeQuery();
                        stmtr2.executeQuery();
                        stmtr3.executeQuery();
                        }
                        
                        break;
                        
                        
                    case "Tooth Sensitivity":
                        Labelcost.setText("500");
                        price = 500 ; 
                        
                        counter = material.get("Dental drill");
                        counter--;
                        material.put("Dental drill", counter);
                        
                        counter = material.get("Dental bur");
                        counter--;
                        material.put(" Dental bur", counter);
                        
                        counter = material.get("Excavator");
                        counter--;
                        material.put(" Excavator", counter);
                        
                        {
                        PreparedStatement stmtr1 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental drill") +" WHERE Id=11" );
                        PreparedStatement stmtr2 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental bur") +" WHERE Id=8" );
                        PreparedStatement stmtr3 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Excavator") +" WHERE Id=18" );
              
                        stmtr1.executeQuery();
                        stmtr2.executeQuery();
                        stmtr3.executeQuery();
                        }
                        
                        
                        
                        break;
                        
                        
                    case "Tooth Abscess":
                        Labelcost.setText("900");
                        price = 900 ;
                        
                        counter = material.get("Dental drill");
                        counter--;
                        material.put("Dental drill", counter);
                        
                        counter = material.get("Dental bur");
                        counter--;
                        material.put(" Dental bur", counter);
                        
                        counter = material.get("Excavator");
                        counter--;
                        material.put(" Excavator", counter);
                        {
                        PreparedStatement stmtr1 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental drill") +" WHERE Id=11" );
                        PreparedStatement stmtr2 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental bur") +" WHERE Id=8" );
                        PreparedStatement stmtr3 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Excavator") +" WHERE Id=18" );
              
                        stmtr1.executeQuery();
                        stmtr2.executeQuery();
                        stmtr3.executeQuery();
                        
                        }                        
                        break;
                        
                        
                    case "Bad Breath":
                        Labelcost.setText("400");
                        price = 400 ;
                        
                        counter = material.get("Dental drill");
                        counter--;
                        material.put("Dental drill", counter);
                        
                        counter = material.get("Dental bur");
                        counter--;
                        material.put(" Dental bur", counter);
                        
                        counter = material.get("Excavator");
                        counter--;
                        material.put(" Excavator", counter);
                        {
                        PreparedStatement stmtr1 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental drill") +" WHERE Id=11" );
                        PreparedStatement stmtr2 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental bur") +" WHERE Id=8" );
                        PreparedStatement stmtr3 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Excavator") +" WHERE Id=18" );
              
                        stmtr1.executeQuery();
                        stmtr2.executeQuery();
                        stmtr3.executeQuery();
                        
                        } 
                        break;
                        
                        
                    case "Malocclusion":
                        Labelcost.setText("1500");
                        price = 1900 ; 
                        
                        counter = material.get("Dental drill");
                        counter--;
                        material.put("Dental drill", counter);
                        
                        counter = material.get("Dental bur");
                        counter--;
                        material.put(" Dental bur", counter);
                        
                        counter = material.get("Excavator");
                        counter--;
                        material.put(" Excavator", counter);
                        {
                        PreparedStatement stmtr1 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental drill") +" WHERE Id=11" );
                        PreparedStatement stmtr2 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Dental bur") +" WHERE Id=8" );
                        PreparedStatement stmtr3 = con.prepareStatement("UPDATE resources SET NumberResource="+material.get("Excavator") +" WHERE Id=18" );
              
                        stmtr1.executeQuery();
                        stmtr2.executeQuery();
                        stmtr3.executeQuery();
                        
                        } 
                        break;
                        
                        
                    default:
                        Labelcost.setText("");
                        break;
                        
                }
                    
                stmt.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Booking Successfully");
                                
                }
                else{
                        JOptionPane.showMessageDialog(this, "must add the client first!");

                }
            } catch (SQLException ex) {
                Logger.getLogger(Examination.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        }
        else{
            JOptionPane.showMessageDialog(this, "please fill data first!");

        }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    
    
    
    
    
    
    
    private void lanameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lanameActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void statuecomboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_statuecomboboxItemStateChanged
        // TODO add your handling code here:
        status = statuecombobox.getSelectedItem().toString() ;
                switch (status){
                    case "Cavities":
                        Labelcost.setText("700");
                        price = 700 ; 
                        break;
                        
                    case "Gingivitis/Periodontitis":
                        Labelcost.setText("800");
                        price = 800 ; 
                        break;
                        
                        
                    case "Tooth Sensitivity":
                        Labelcost.setText("500");
                        price = 500 ; 
                        break;
                        
                        
                    case "Tooth Abscess":
                        Labelcost.setText("900");
                        price = 900 ; 
                        break;
                        
                        
                    case "Bad Breath":
                        Labelcost.setText("400");
                        price = 400 ;
                        break;
                        
                        
                    case "Malocclusion":
                        Labelcost.setText("1500");
                        price = 1900 ; 
                        
                        break;
                        
                        
                    default:
                        Labelcost.setText("");
                        break;
                        
                }
        
    }//GEN-LAST:event_statuecomboboxItemStateChanged

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
            java.util.logging.Logger.getLogger(Examination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labelcost;
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField date;
    private javax.swing.JTextField edt_phone;
    private javax.swing.JTextField finame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField laname;
    private javax.swing.JComboBox<String> statuecombobox;
    // End of variables declaration//GEN-END:variables
}
