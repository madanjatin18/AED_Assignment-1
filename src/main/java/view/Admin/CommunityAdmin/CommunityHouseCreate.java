/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.CommunityAdmin;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.City;
import models.Community;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import view.MainJFrame;

/**
 *
 * @author vaibhav
 */
public class CommunityHouseCreate extends javax.swing.JPanel {

    /**
     * Creates new form CommunityHouseCreate
     */
    City city;
    Community community;
    public CommunityHouseCreate() {
        initComponents();
        AutoCompleteDecorator.decorate(ddCity);
        AutoCompleteDecorator.decorate(ddCommunity);
            
        ddCity.removeAllItems();
        ddCity.addItem("");
        for (City city: MainJFrame.cityDirectory.getCityList()) {
            ddCity.addItem(city.getName());
        }
        ddCity.setSelectedItem("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        ddCity = new javax.swing.JComboBox<>();
        btn_save = new javax.swing.JButton();
        btn_back_community_admin = new javax.swing.JButton();
        ddCommunity = new javax.swing.JComboBox<>();
        lblAddressLine2 = new javax.swing.JLabel();
        lblAddressLine1 = new javax.swing.JLabel();
        txtAddressLine1 = new javax.swing.JTextField();
        txtAddressLine2 = new javax.swing.JTextField();
        valCity = new javax.swing.JLabel();
        valCommunity = new javax.swing.JLabel();

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAddress.setForeground(new java.awt.Color(255, 0, 0));

        lblCity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCity.setText("City : ");

        lblCommunity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity.setText("Community :");

        ddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCityActionPerformed(evt);
            }
        });

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_back_community_admin.setText("<- Back");
        btn_back_community_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_community_adminActionPerformed(evt);
            }
        });

        ddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCommunityActionPerformed(evt);
            }
        });

        lblAddressLine2.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblAddressLine2.setText("Address Line 2 :");

        lblAddressLine1.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblAddressLine1.setText("Address Line 1 :");

        txtAddressLine1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressLine1KeyReleased(evt);
            }
        });

        txtAddressLine2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressLine2KeyReleased(evt);
            }
        });

        valCity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCity.setForeground(new java.awt.Color(255, 0, 0));

        valCommunity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCommunity.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(lblCommunity)
                    .addComponent(lblAddressLine1)
                    .addComponent(lblAddressLine2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_back_community_admin)
                                .addGap(62, 62, 62)
                                .addComponent(btn_save))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valCity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ddCommunity, javax.swing.GroupLayout.Alignment.LEADING, 0, 212, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(132, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCity)
                        .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valCity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCommunity)
                        .addComponent(ddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine1)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressLine2)
                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_back_community_admin))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCityActionPerformed
        
        String city_name;
        try {
            city_name = ddCity.getSelectedItem().toString();
        } catch (Exception e) {
            city_name = "";
        }
        
        if ("".equals(city_name)) {
            valCity.setText("Please Select City");
            ddCommunity.removeAllItems();
            valAddress.setText(null);
        } else {
            valCity.setText(null);
            ddCommunity.removeAllItems();
            city = MainJFrame.cityDirectory.findCity(city_name);
            ArrayList<Community> communityList = MainJFrame.communityDirectory.searchCommunitiesByCityObject(city);
            
            ddCommunity.addItem("");
            for (Community c: communityList) {
                ddCommunity.addItem(c.getName());
            }
            ddCommunity.setSelectedItem("");
        }
    }//GEN-LAST:event_ddCityActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        var valid = true;

        if (ddCity.getSelectedItem().toString().isEmpty()) {
            valCity.setText("Please Select City");
            valid = false;
        }

        if (ddCommunity.getSelectedItem().toString().isEmpty()) {
            valCommunity.setText("Please Select Community");
            valid = false;
        } 
        
        if (txtAddressLine1.getText().isEmpty()) {
            valCommunity.setText("Address Line 1 is required");
            valid = false;
        }
        
        if (!(community==null) && community.isAddressExist(txtAddressLine1.getText(), txtAddressLine2.getText())) {
            valAddress.setText("This address already exist");
            valid = false;
        }
        
        

        if (valid) {
            community.addHouse(txtAddressLine1.getText(), txtAddressLine2.getText());
            JOptionPane.showMessageDialog(this, "House Added");
            ddCity.setSelectedItem("");
            ddCommunity.setSelectedItem("");
            txtAddressLine1.setText(null);
            txtAddressLine2.setText(null);
            valCity.setText(null);
            valCommunity.setText(null);
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_back_community_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_community_adminActionPerformed
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        CommunityAdmin adminArea = new CommunityAdmin();
        adminArea.setVisible(true);
        adminArea.setHouseReadView();

    }//GEN-LAST:event_btn_back_community_adminActionPerformed

    private void ddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCommunityActionPerformed
        
        String city_name;
        String community_name;
        try {
            city_name = ddCity.getSelectedItem().toString();
        } catch (Exception e) {
            city_name = "";
        }
        
        try {
            community_name = ddCommunity.getSelectedItem().toString();
        } catch (Exception e) {
            community_name = "";
        }
        
        if ("".equals(community_name)) {
            valCommunity.setText("Please Select Community");
            valAddress.setText(null);
        } else {
            valCommunity.setText(null);
            community = MainJFrame.communityDirectory.getCommunity(city_name, community_name);
            valAddress.setText(null);
        }
    }//GEN-LAST:event_ddCommunityActionPerformed

    private void txtAddressLine1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressLine1KeyReleased
        String city_name;
        String community_name;
        try {
            city_name = ddCity.getSelectedItem().toString();
        } catch (Exception e) {
            city_name = "";
        }
        
        try {
            community_name = ddCommunity.getSelectedItem().toString();
        } catch (Exception e) {
            community_name = "";
        }
        
        if ("".equals(txtAddressLine1.getText())) {
            valAddress.setText("Address Line 1 is required");
        } else if ("".equals(community_name)) {
            valAddress.setText(null);
            valCommunity.setText("Please Select Community");
            valAddress.setText(null);
        } else {
            valAddress.setText(null);
            community = MainJFrame.communityDirectory.getCommunity(city_name, community_name);
            if (community.isAddressExist(txtAddressLine1.getText(), txtAddressLine2.getText())) {
                valAddress.setText("This address already exist");
            }
            else {
                valAddress.setText(null);
            }
        }
    }//GEN-LAST:event_txtAddressLine1KeyReleased

    private void txtAddressLine2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressLine2KeyReleased
        String city_name;
        String community_name;
        try {
            city_name = ddCity.getSelectedItem().toString();
        } catch (Exception e) {
            city_name = "";
        }
        
        try {
            community_name = ddCommunity.getSelectedItem().toString();
        } catch (Exception e) {
            community_name = "";
        }
        
        if ("".equals(community_name)) {
            valCommunity.setText("Please Select Community");
            valAddress.setText(null);
        } else {
            community = MainJFrame.communityDirectory.getCommunity(city_name, community_name);
            if (community.isAddressExist(txtAddressLine1.getText(), txtAddressLine2.getText())) {
                valAddress.setText("This address already exist");
            }
            else {
                valAddress.setText(null);
            }
        }
    }//GEN-LAST:event_txtAddressLine2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_community_admin;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> ddCity;
    private javax.swing.JComboBox<String> ddCommunity;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JLabel valAddress;
    private javax.swing.JLabel valCity;
    private javax.swing.JLabel valCommunity;
    // End of variables declaration//GEN-END:variables
}
