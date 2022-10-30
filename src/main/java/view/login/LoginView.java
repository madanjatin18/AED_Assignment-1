/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.login;

import models.Admins;
import models.Doctor;
import models.Patient;
import view.Admin.AdminJFrame;
import view.Admin.CommunityAdmin.CommunityAdmin;
import view.Admin.HospitalAdmin.HospitalAdminJFrame;
import view.Admin.SystemAdmin.SystemAdminJFrame;
import view.Doctor.DoctorEncounters;
import view.MainJFrame;
import view.Patient.PatientView;

/**
 *
 * @author vaibhav
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    
    String type;
    
    public LoginView(String type) {
        initComponents();
        this.type = type;
        setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(btnLogin);
        
        if (!type.equals("patient")) {
            btnRegister.setVisible(false);
        }
        
        switch(type) {
            case("patient") : lblLogin.setText("Patient Login");break;
            case("doctor") : lblLogin.setText("Doctor Login");break;
            case("system") : lblLogin.setText("System Admin Login");break;
            case("community") : lblLogin.setText("Community Admin Login");break;
            case("hospital") : lblLogin.setText("Hospital Admin Login");break;
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

        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        valCreds = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(558, 356));

        lblLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblLogin.setText("Please Login ");

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPassword.setText("Password:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword)
                            .addComponent(lblUsername))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLogin)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(valCreds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogin)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(btnBack))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(valCreds, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnRegister))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (txtUsername.getText().equals("")) {
            valCreds.setText("Username is required");
        } else if (String.valueOf(txtPassword.getPassword()).equals("")) {
            valCreds.setText("Password is required");
        } else {
            if (type.equals("patient")) {
                Patient p = MainJFrame.patientDirectory.checkPatientCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
                if (p == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(p);
                    this.dispose();
                    new PatientView().setVisible(true);
                }
            } else if (type.equals("doctor")) {
                Doctor d = MainJFrame.doctorDirectory.checkDoctorCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
                if (d == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(d);
                    this.dispose();
                    new DoctorEncounters().setVisible(true);
                }
            } else if (type.equals("community")) {
                Admins d = MainJFrame.adminDirectory.checkAdminCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()), Admins.AdminType.COMMUNITY);
                if (d == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(d);
                    this.dispose();
                    new CommunityAdmin().setVisible(true);
                }
            } else if (type.equals("system")) {
                Admins d = MainJFrame.adminDirectory.checkAdminCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()), Admins.AdminType.SYSTEM);
                if (d == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(d);
                    this.dispose();
                    new SystemAdminJFrame().setVisible(true);
                }
            } else if (type.equals("hospital")) {
                Admins d = MainJFrame.adminDirectory.checkAdminCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()), Admins.AdminType.HOSPITAL);
                if (d == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(d);
                    this.dispose();
                    new HospitalAdminJFrame().setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new AdminJFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        this.dispose();
        PatientRegister p = new PatientRegister();
        p.setVisible(true);
        
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView("admin").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel valCreds;
    // End of variables declaration//GEN-END:variables
}
