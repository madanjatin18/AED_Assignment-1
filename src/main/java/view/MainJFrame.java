/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import models.CityDirectory;
import models.CommunityDirectory;
import models.DoctorDirectory;
import models.HospitalDirectory;
import models.PatientDirectory;
import models.PersonDirectory;
import view.Admin.AdminJFrame;
import resources.CreateDefaultData;

/**
 *
 * @author vaibhav
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    // initialize objects
    public static CommunityDirectory communityDirectory = new CommunityDirectory();
    public static CityDirectory cityDirectory = new CityDirectory();
    public static HospitalDirectory hospitalDirectory = new HospitalDirectory();
    public static DoctorDirectory doctorDirectory  = new DoctorDirectory();
    public static PersonDirectory personDirectory = new PersonDirectory();
    public static PatientDirectory patientDirectory = new PatientDirectory();
    
    public MainJFrame() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(102, 255, 204));
        CreateDefaultData.createData();
        setLocationRelativeTo(null);
        lblComment.setText("Enter Admin Credentials");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        btn_admins = new javax.swing.JButton();
        btn_doctors = new javax.swing.JButton();
        btn_person = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbChoice = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblComment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));

        lbl_title.setBackground(new java.awt.Color(255, 51, 51));
        lbl_title.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 36)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 51, 51));
        lbl_title.setText("Health UP");

        btn_admins.setText("Admins");
        btn_admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsActionPerformed(evt);
            }
        });

        btn_doctors.setText("Doctors");
        btn_doctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doctorsActionPerformed(evt);
            }
        });

        btn_person.setText("Patient");
        btn_person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personActionPerformed(evt);
            }
        });

        jLabel1.setText("Please select the login type");

        cbChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Patient" }));
        cbChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChoiceActionPerformed(evt);
            }
        });

        txtUsername.setText("Enter Username");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.setText("Enter Password");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblComment.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_person)
                            .addComponent(btn_doctors)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_admins)
                                .addGap(71, 71, 71)
                                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblComment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbChoice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(btn_admins)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_doctors)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_person)
                    .addComponent(cbChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblComment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnLogin)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_personActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_personActionPerformed

    private void btn_adminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsActionPerformed
        this.dispose();
        new AdminJFrame().setVisible(true);
    }//GEN-LAST:event_btn_adminsActionPerformed

    private void btn_doctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doctorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_doctorsActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
/*if (cbChoice.getSelectedItem().toString().equals("Admin")){
            lblComment.setText("Enter Admin Credentials");}
        if (cbChoice.getSelectedItem().toString().equals("Doctor")){
            lblComment.setText("Enter Doctor Credentials");}
        if (cbChoice.getSelectedItem().toString().equals("Patient")){
            lblComment.setText("Enter Patient Credentials");}*/
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (cbChoice.getSelectedItem().toString().equals("Admin")){
            if (txtUsername.getText().equals("abc") && txtPassword.getText().equals("abc12")){
                this.dispose();
        new AdminJFrame().setVisible(true);
            }
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cbChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChoiceActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    // public functions
    public static void defaultSearchText(JTextField txtSearch, String content) {
        String defaultValue = content;
        txtSearch.setText(defaultValue);
	txtSearch.setForeground(Color.gray);

	// Add listener
	txtSearch.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			if (txtSearch.getText().equals(defaultValue)) {
				txtSearch.setForeground(Color.black);
				txtSearch.setText("");
			}
			super.focusGained(e);
		}

		@Override
		public void focusLost(FocusEvent e) {
			if (txtSearch.getText().equals("")) {
				txtSearch.setForeground(Color.gray);
				txtSearch.setText(defaultValue);
			}
			super.focusLost(e);
		}
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btn_admins;
    private javax.swing.JButton btn_doctors;
    private javax.swing.JButton btn_person;
    private javax.swing.JComboBox<String> cbChoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables



}