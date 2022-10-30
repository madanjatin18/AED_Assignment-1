/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Admin.CommunityAdmin;

import models.CityDirectory;
import view.Admin.AdminJFrame;
import view.MainJFrame;

/**
 *
 * @author madan
 */
public class CommunityAdmin extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdmin
     */
    
    public CityDirectory cityDirectory = new CityDirectory();
    
    public CommunityAdmin() {
        initComponents();
        workArea.setSize(900, 900);
        setLocationRelativeTo(null);
        CommunityViewUpdate communityView = new CommunityViewUpdate();
        splitPane.setRightComponent(communityView);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btn_community = new javax.swing.JButton();
        btn_houses = new javax.swing.JButton();
        btn_back_admin = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));

        controlPanel.setBackground(new java.awt.Color(102, 102, 102));

        btn_community.setBackground(new java.awt.Color(255, 255, 255));
        btn_community.setForeground(new java.awt.Color(51, 51, 255));
        btn_community.setText("Community");
        btn_community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_communityActionPerformed(evt);
            }
        });

        btn_houses.setBackground(new java.awt.Color(255, 255, 255));
        btn_houses.setForeground(new java.awt.Color(51, 51, 255));
        btn_houses.setText("Houses");
        btn_houses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_housesActionPerformed(evt);
            }
        });

        btn_back_admin.setBackground(new java.awt.Color(255, 255, 255));
        btn_back_admin.setForeground(new java.awt.Color(51, 51, 255));
        btn_back_admin.setText("<- Logout");
        btn_back_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back_admin)
                    .addComponent(btn_community)
                    .addComponent(btn_houses))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_back_admin)
                .addGap(120, 120, 120)
                .addComponent(btn_community)
                .addGap(18, 18, 18)
                .addComponent(btn_houses)
                .addContainerGap(446, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(153, 153, 153));
        workArea.setPreferredSize(new java.awt.Dimension(800, 700));

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_communityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_communityActionPerformed
        CommunityViewUpdate communityView = new CommunityViewUpdate();
        splitPane.setRightComponent(communityView);
    }//GEN-LAST:event_btn_communityActionPerformed

    private void btn_housesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_housesActionPerformed
        CommunityHouseViewUpdate viewHousePanel = new CommunityHouseViewUpdate();
        splitPane.setRightComponent(viewHousePanel);
    }//GEN-LAST:event_btn_housesActionPerformed

    private void btn_back_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_adminActionPerformed
        MainJFrame.loginSession.setObject(null);
        this.dispose();
        new AdminJFrame().setVisible(true);
    }//GEN-LAST:event_btn_back_adminActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdmin().setVisible(true);
            }
        });
    }
    
    public void setCreateView() {                                               
        // TODO add your handling code here:
        CommunityCreate createPanel = new CommunityCreate();
        splitPane.setRightComponent(createPanel);
    }
    
    public void setHouseCreateView() {                                               
        // TODO add your handling code here:
        CommunityHouseCreate createHousePanel = new CommunityHouseCreate();
        splitPane.setRightComponent(createHousePanel);
    }
    
    public void setHouseReadView() {                                               
        // TODO add your handling code here:
        CommunityHouseViewUpdate viewHousePanel = new CommunityHouseViewUpdate();
        splitPane.setRightComponent(viewHousePanel);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_admin;
    private javax.swing.JButton btn_community;
    private javax.swing.JButton btn_houses;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}

