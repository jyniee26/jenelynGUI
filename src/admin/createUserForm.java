/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import arss.registrationForm;
import static arss.registrationForm.email;
import static arss.registrationForm.usname;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Harold
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }
    
    Color navcolor = new Color(204,255,255);
    Color hovercolor = new Color(0,255,255);
    
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
    
    
   public boolean updateCheck(){
    
    dbConnector dbc = new dbConnector();    
    
    try{
        String query = "SELECT * FROM tbl_user  WHERE (u_username = '" +un.getText()+ "' OR u_email = '" +em.getText()+ "') AND u_id !='"+uid.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                 email = resultSet.getString("u_email");
                 if(email.equals(em.getText())){
                 JOptionPane.showMessageDialog(null,"Email is already used");
                 em.setText("");
                 }
                 
                 usname = resultSet.getString("u_username");
                 if(usname.equals(un.getText())){
                 JOptionPane.showMessageDialog(null,"Username is already used");
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        un = new javax.swing.JTextField();
        ct = new javax.swing.JTextField();
        pass1 = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        userole = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        us = new javax.swing.JComboBox<>();
        userole1 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        ps = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0,0,0,60));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 250, 25));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 250, 25));
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 250, 25));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff", "" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel3.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 250, 25));

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel3.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 250, 25));

        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });
        jPanel3.add(ct, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 250, 25));

        pass1.setText("Contact:");
        jPanel3.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 20));

        pass.setText("Password:");
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 20));

        username.setText("User Name:");
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        userole.setText("User Type:");
        jPanel3.add(userole, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel6.setText("Email:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel5.setText("Last Name:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setText("First Name:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        add.setBackground(new java.awt.Color(204, 255, 255));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, 30));

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " ", " " }));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel3.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 250, 25));

        userole1.setText("User Status:");
        jPanel3.add(userole1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        uid.setEnabled(false);
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        jPanel3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 250, 25));

        jLabel7.setText("User ID:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        refresh.setBackground(new java.awt.Color(204, 255, 255));
        refresh.setText("Refresh");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel3.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 80, 30));

        update.setBackground(new java.awt.Color(204, 255, 255));
        update.setText("Update");
        update.setEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 80, 30));

        delete.setBackground(new java.awt.Color(204, 255, 255));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 80, 30));

        clear.setBackground(new java.awt.Color(204, 255, 255));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 80, 30));

        cancel.setBackground(new java.awt.Color(204, 255, 255));
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 80, 30));

        ps.setEnabled(false);
        jPanel3.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 250, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 670, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked

    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        if (fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty()
        || un.getText().isEmpty() || ps.getText().isEmpty() || ct.getText().isEmpty()) {
           JOptionPane.showMessageDialog(null, "All fields are Required!");
        } else if (ps.getText().length() < 8) {
           JOptionPane.showMessageDialog(null, "Password should be 8 characters or more!");
             ps.setText("");
        } else if (!em.getText().matches("^.+@.+..com")) { 
           JOptionPane.showMessageDialog(null, "Invalid Email format!");
        } else if (!ct.getText().matches("\\d{11}")) {
           JOptionPane.showMessageDialog(null, "Contact number must be exactly 11 digits!");
        } else if (duplicateCheck()) {
           System.out.println("Duplicate Exist!");
        } else {
           dbConnector dbc = new dbConnector();
    
        try {
        // Hash the password before inserting
        String hashedPass = passwordHasher.hashPassword(ps.getText());
        
        // Use the hashed password in the SQL insert statement
        if (dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_email, u_type, u_username, u_password, u_contact, u_status) "
                + "VALUES('" + fn.getText() + "', '" + ln.getText() + "', '" + em.getText() + "', "
                + "'" + ut.getSelectedItem() + "', '" + un.getText() + "', "
                + "'" + hashedPass + "', '" + ct.getText() + "', '" + us.getSelectedItem() + "')")) {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    } catch (NoSuchAlgorithmException ex) {
        System.out.println("" + ex);
    }
}
    }//GEN-LAST:event_addActionPerformed

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

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
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
        }else if(updateCheck()){
            System.out.println("Duplicate Exist!");
        }else{
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE tbl_user SET u_fname ='"+fn.getText()+"',"
                + " u_lname ='"+ln.getText()+"', u_email ='"+em.getText()+"', "
                        + "u_username ='"+un.getText()+"', u_password ='"+ps.getText()+"',"
                + "u_type = '"+ut.getSelectedItem()+"', u_status = '"+us.getSelectedItem()+"', "
                        + "u_contact = '"+ct.getText()+"' WHERE u_id = '"+uid.getText()+"'");
        
        
        usersForm uf = new usersForm();
        uf.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       usersForm usf = new usersForm();
       usf.setVisible(true);
       this.dispose();
       
       
    }//GEN-LAST:event_cancelActionPerformed

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(hovercolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(hovercolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(navcolor);
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(hovercolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(hovercolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
       clear.setBackground(navcolor);
    }//GEN-LAST:event_clearMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
       cancel.setBackground(hovercolor);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
       cancel.setBackground(navcolor);
    }//GEN-LAST:event_cancelMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setBackground(hovercolor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(navcolor);
    }//GEN-LAST:event_refreshMouseExited

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    public javax.swing.JTextField ct;
    private javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ln;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel pass1;
    public javax.swing.JPasswordField ps;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField un;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> us;
    private javax.swing.JLabel username;
    private javax.swing.JLabel userole;
    private javax.swing.JLabel userole1;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
