
package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class login extends javax.swing.JFrame {
    
    private String username;
     
    public login() {
        initComponents();
        this.setLocationRelativeTo(null); //set the frame to the middle of the screen
        jComboBox1.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        registerb = new java.awt.Button();
        loginb = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 241, 255));
        setResizable(false);

        label1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        label1.setText("Login as :");

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 2, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Parent", "Educator" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        label2.setText("Username / Email");

        label3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        label3.setText("Password");

        Username.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        show.setText("show password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        registerb.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        registerb.setLabel("Register");
        registerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbActionPerformed(evt);
            }
        });

        loginb.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        loginb.setLabel("Login");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginb, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(show)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerb, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if (show.isSelected()) {
                Password.setEchoChar((char) 0); // Show the password
            } else {
                Password.setEchoChar('*'); // Hide the password
        }
    }//GEN-LAST:event_showActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        
    }//GEN-LAST:event_PasswordActionPerformed

    private void registerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbActionPerformed
        if(registerb.isEnabled()){
            // Create and display the signup frame
            signup signup = new signup();
            signup.setVisible(true);
                
            // Dispose of the login frame
            dispose();
        }
    }//GEN-LAST:event_registerbActionPerformed

    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbActionPerformed
        String role, email, usernameOrEmail, password, query, passDb=null, Parent1=null, Parent2=null, Child1=null;
        String SUrl, SUser, Spass;
        SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        SUser = "root";
        Spass="host@123";
        int notFound = 0;

        role = String.valueOf(jComboBox1.getSelectedItem());
        String loggedInUsername = null;
        String currentUserType = null;
        String loggedInEmail = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            
            usernameOrEmail = Username.getText();
            password = Password.getText();
                
            query = "SELECT * FROM user WHERE (Username = ? OR Email = ?) AND Role = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, usernameOrEmail);
            pstmt.setString(2, usernameOrEmail);
            pstmt.setString(3, role); // Set the role parameter
            ResultSet rs = pstmt.executeQuery();
                
            while(rs.next()){
                Parent1 = rs.getString("Parent1");
                Parent2 = rs.getString("Parent2");
                currentUserType = rs.getString("Role");
                Child1 = rs.getString("Child1");
            }
            
            if("null".equals(role)){
                JOptionPane.showMessageDialog(new JFrame(), "Please select your role", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Username.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username / Email is require", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(Password.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("Student".equals(role)){
                if ("".equals(Parent1) || Parent1 == null || !checkUsernameExists(Parent1, "Parent")) {
                    deleteAccount(usernameOrEmail);
                    return;
                }else if (Parent2 != null && !"".equals(Parent2) && !checkUsernameExists(Parent2, "Parent")) {
                   deleteAccount(usernameOrEmail);
                   return;
                 }
            } else if ("Parent".equals(role)) {
                  // Check if child1 username exists in the database
                   if ("".equals(Child1) || Child1 == null || !checkUsernameExists(Child1, "Student")) {
                        // If child1 is null or empty, show error message and return
                        deleteAccount(usernameOrEmail);
                        return;
                    } else {
                     // Check if other child usernames exist in the database
                     for (int i = 2; i <= 10; i++) {
                        String child = rs.getString("Child" + i);
                        if (child != null && !"".equals(child) && !checkUsernameExists(child, "student")) {
                        // If any child username doesn't exist, delete the parent account and return
                        deleteAccount(username);
                        return;
                    }
                    }
                 }
        
            }else{
                usernameOrEmail = Username.getText();
                password = Password.getText();
                
                query = "SELECT * FROM user WHERE (Username = ? OR Email = ?) AND Role = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pstmt.setString(1, usernameOrEmail);
                pstmt.setString(2, usernameOrEmail);
                pstmt.setString(3, role); // Set the role parameter
                ResultSet rst = pst.executeQuery();
                
                while(rst.next()){
                    passDb = rst.getString("password");
                    notFound = 1;
                    currentUserType = rst.getString("Role");
                    loggedInUsername = rst.getString("Username");
                    loggedInEmail = rst.getString("Email");
                }
                if(notFound == 1 && password.equals(passDb)){
                    showMessageDialog(null, "You are successfully login as: "+role);
               
                    // back to home page
                    Main main = new Main();
                    main.setVisible(true);
                    // Pass the username to the Main class
                    main.setLoggedInUser(currentUserType, loggedInUsername);
                    
                    // Dispose of the login frame
                    dispose();
                
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Incorrect username or password","Error", JOptionPane.ERROR_MESSAGE);
                }
            
                Username.setText("");
                Password.setText("");
                jComboBox1.setSelectedItem(null);
              
            }
        }catch(Exception e){
            System.out.println("Error!"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_loginbActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void deleteAccount(String username) {
        String SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        String SUser = "root";
        String Spass="host@123";
    try {
        // Establish database connection
        Connection con = DriverManager.getConnection(SUrl, SUser, Spass);

        // Construct the delete query
        String query = "DELETE FROM user WHERE Username = ?";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, username);

        // Execute the delete query
        int rowsAffected = pstmt.executeUpdate();

        // Check if the delete operation was successful
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Account does not exsits", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Close the prepared statement and database connection
        pstmt.close();
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(new JFrame(), "Error deleting account: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    //method to check if the username already exists in database
    private boolean checkUsernameExists(String usernameOrEmail, String roleToCheck) {
        String SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
        String SUser = "root";
        String Spass = "host@123";

        String query = "SELECT Username FROM user WHERE Username = ? OR Email = ?";
    
        try (Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            PreparedStatement pstmt = con.prepareStatement(query)) {
        
            pstmt.setString(1, usernameOrEmail);
            pstmt.setString(2, usernameOrEmail);
            
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                String userRole = rs.getString("Role");
                // If the retrieved user's role matches the role to check, return true
                return userRole.equalsIgnoreCase(roleToCheck);
            } else {
                // No user found with the given username or email
                return false;
            }
        }
    } catch (Exception e) {
        // Log the error instead of printing directly
        System.out.println("Error checking username existence: " + e.getMessage());
        return false; // Return false in case of any exception
    }
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Button loginb;
    private java.awt.Button registerb;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
