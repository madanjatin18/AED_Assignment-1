/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import models.AdminDirectory;
import models.Admins;
import models.City;
import models.CityDirectory;
import models.Community;
import models.CommunityDirectory;
import models.DoctorDirectory;
import models.EncounterDirectory;
import models.HospitalDirectory;
import models.LoginSession;
import models.PatientDirectory;
import models.PersonDirectory;
import resources.CreateDefaultData;
import view.Admin.AdminJFrame;
import view.login.LoginView;

/**
 *
 * @author madan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public static CommunityDirectory communityDirectory = new CommunityDirectory();
    public static CityDirectory cityDirectory = new CityDirectory();
    public static HospitalDirectory hospitalDirectory = new HospitalDirectory();
    public static DoctorDirectory doctorDirectory  = new DoctorDirectory();
    public static PersonDirectory personDirectory = new PersonDirectory();
    public static PatientDirectory patientDirectory = new PatientDirectory();
    public static EncounterDirectory encounterDirectory = new EncounterDirectory();
    public static AdminDirectory adminDirectory = new AdminDirectory();
    public static LoginSession loginSession = new LoginSession();
    private static boolean create = true;
    public MainJFrame() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(102, 102, 102));
           if (create) {
            //CreateDefaultData.createData();
            City boston = MainJFrame.cityDirectory.newCity("Boston");
            Community jp = MainJFrame.communityDirectory.newCommunity("Jamaica Plain", boston);
            Admins ad1 = MainJFrame.adminDirectory.newAdmin("jatin", 24, "madanjatin18@gmail.com", "Male", "6179358513", boston, jp, "jatin", "jatin123", Admins.AdminType.SYSTEM);
            Admins ad2 = MainJFrame.adminDirectory.newAdmin("jatin", 24, "madanjatin18@gmail.com", "Male", "6179358513", boston, jp, "jatin", "jatin123", Admins.AdminType.HOSPITAL);
            Admins ad3 = MainJFrame.adminDirectory.newAdmin("jatin", 24, "madanjatin18@gmail.com", "Male", "6179358513", boston, jp, "jatin", "jatin123", Admins.AdminType.COMMUNITY);
            
            create = false; 
        }
        setLocationRelativeTo(null);
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
        btn_doctors = new javax.swing.JButton();
        btn_admins = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_person = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_title1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        lbl_title.setBackground(new java.awt.Color(255, 51, 51));
        lbl_title.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 36)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText(".gov");

        btn_doctors.setText("DOCTOR LOGIN");
        btn_doctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doctorsActionPerformed(evt);
            }
        });

        btn_admins.setText("ADMIN LOGIN");
        btn_admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Please select the login type");

        btn_person.setText("PATIENT LOGIN");
        btn_person.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personActionPerformed(evt);
            }
        });

        jLabel2.setText("       About HHS          Programs & Services        Grants & Contracts          Laws & Regulations ");

        lbl_title1.setBackground(new java.awt.Color(255, 51, 51));
        lbl_title1.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 36)); // NOI18N
        lbl_title1.setForeground(new java.awt.Color(255, 204, 0));
        lbl_title1.setText("HHS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText(" U.S. Department of Health & Human Services");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_doctors)
                    .addComponent(btn_person, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_admins, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(lbl_title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_title1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(btn_admins)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_person)
                .addGap(12, 12, 12)
                .addComponent(btn_doctors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_doctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doctorsActionPerformed
        this.dispose();
        new LoginView("doctor").setVisible(true);
    }//GEN-LAST:event_btn_doctorsActionPerformed

    private void btn_adminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminsActionPerformed
        this.dispose();
        new AdminJFrame().setVisible(true);
    }//GEN-LAST:event_btn_adminsActionPerformed

    private void btn_personActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personActionPerformed
        this.dispose();
        new LoginView("patient").setVisible(true);
    }//GEN-LAST:event_btn_personActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admins;
    private javax.swing.JButton btn_doctors;
    private javax.swing.JButton btn_person;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_title1;
    // End of variables declaration//GEN-END:variables
}
