/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arss;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author ADMIN
 */
public class registrationForm extends javax.swing.JFrame {

    /**
     * Creates new form registrationForm
     */
    public registrationForm() {
        initComponents();
    }
    
    public static String email, usname;  
    
    public boolean duplicateCheck(){
        dbConnector dbc = new  dbConnector();
       try{
          String query = "SELECT * FROM tbl_user  WHERE u_username = '" + un.getText() + "' OR u_email = '" +em.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);  
            if(resultSet.next()){
               email = resultSet.getString("u_email");
                if(email.equals(em.getText())){
                JOptionPane.showMessageDialog(null,"Email is Already Used!");
                em.setText("");
                }
               usname = resultSet.getString("u_username");
               if(usname.equals(un.getText())){
                JOptionPane.showMessageDialog(null,"Username is Already Used!");
                 un.setText("");
                }
               return true;
            }else{
               return false;
            }
       }catch(SQLException ex){
           System.out.println(""+ex);    
           return false;
       }
    }
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        userole = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        pass1 = new javax.swing.JLabel();
        ct = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0,0,0,60));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText(" APPOINTMENT RECORD SYSTEM");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("REGISTRATION FORM:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 180, -1));

        jLabel4.setText("First Name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jLabel5.setText("Last Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel2.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 250, 25));

        pass.setText("Password:");
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 20));
        jPanel2.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 250, 25));
        jPanel2.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 250, 25));

        register.setBackground(new java.awt.Color(204, 255, 255));
        register.setText("Register");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel2.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 80, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 80, 30));

        userole.setText("User Type:");
        jPanel2.add(userole, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel2.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 250, 25));

        username.setText("User Name:");
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 20));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff", "" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel2.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 250, 25));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel2.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 250, 25));

        pass1.setText("Contact:");
        jPanel2.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 20));

        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });
        jPanel2.add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 250, 25));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 390));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 610, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/JEN BG (1).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked

    }//GEN-LAST:event_registerMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        if(fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()
                ||un.getText().isEmpty()||ps.getText().isEmpty()||ct.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All fields are Required!");  
        
        }else if(ps.getText().length()<8){
            JOptionPane.showMessageDialog(null,"Password should be 8 above!");
            ps.setText("");  
        }else if(!em.getText().matches("^.+@.+..com")){
            JOptionPane.showMessageDialog(null,"Invalid Email format!");  
        }else if(!ct.getText().matches("\\d{11}")){
            JOptionPane.showMessageDialog(null,"Contact number Must be only numbers!");
            JOptionPane.showMessageDialog(null,"Type atleast 11 numbers!");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
        }else{
        dbConnector dbc = new dbConnector();
        if(dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_email, u_type, u_username, u_password, u_contact, u_status)"
                + "VALUES('"+fn.getText()+"', '"+ln.getText()+"', '"+em.getText()+"',"
                        + " '"+ut.getSelectedItem()+"', '"+un.getText()+"',"
                        + " '"+ps.getText()+"', '"+ct.getText()+"', 'Pending')"))
        {
          JOptionPane.showMessageDialog(null,"Inserted Sucessfully!");
          loginForm lfr = new loginForm();
          lfr.setVisible(true);
          this.dispose();
        }else{
          JOptionPane.showMessageDialog(null,"Connection Error!");
        }
        
        }
    }//GEN-LAST:event_registerActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginForm lfr = new loginForm();
        lfr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctActionPerformed

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ct;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField ln;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel pass1;
    private javax.swing.JPasswordField ps;
    private javax.swing.JButton register;
    private javax.swing.JTextField un;
    private javax.swing.JLabel username;
    private javax.swing.JLabel userole;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
