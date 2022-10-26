/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.CommunityAdmin;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import models.Community;
import models.House;
import view.MainJFrame;

/**
 *
 * @author vaibhav
 */
public class CommunityHouseViewUpdate extends javax.swing.JPanel {

    /**
     * Creates new form CommunityHouseViewUpdate
     */
    
    Vector originalTableModel;
    public CommunityHouseViewUpdate() {
        initComponents();
        MainJFrame.defaultSearchText(txtSearch, "Search by city, community or house");
        populateTable();
        originalTableModel = (Vector) ((DefaultTableModel) tblDetails.getModel()).getDataVector().clone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        lblCommunity = new javax.swing.JLabel();
        lblAddressLine1 = new javax.swing.JLabel();
        valAddress = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        txtAddressLine1 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        lblHouseRecord = new javax.swing.JLabel();
        lblAddressLine2 = new javax.swing.JLabel();
        txtAddressLine2 = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblCommunity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity.setText("Community :");

        lblAddressLine1.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblAddressLine1.setText("Address Line 1 :");

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAddress.setForeground(new java.awt.Color(255, 0, 0));

        txtCommunity.setEditable(false);

        txtAddressLine1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressLine1KeyReleased(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "City", "Community", "Address Line 1", "Address Line 2", "comm_obj", "house_obj"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(4).setMinWidth(0);
            tblDetails.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblDetails.getColumnModel().getColumn(4).setMaxWidth(0);
            tblDetails.getColumnModel().getColumn(5).setMinWidth(0);
            tblDetails.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblDetails.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        lblHouseRecord.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 24)); // NOI18N
        lblHouseRecord.setText("House Record");

        lblAddressLine2.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblAddressLine2.setText("Address Line 2 :");

        txtAddressLine2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressLine2KeyReleased(evt);
            }
        });

        txtCity.setEditable(false);

        lblCity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCity.setText("City : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdate)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCommunity)
                                .addComponent(lblAddressLine1)
                                .addComponent(lblCity))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(txtAddressLine2)
                                .addComponent(txtAddressLine1)
                                .addComponent(txtCity))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHouseRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtSearch))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(btnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblAddressLine2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHouseRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddressLine1)
                    .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddressLine2)
                    .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        CommunityAdmin adminArea = new CommunityAdmin();
        adminArea.setVisible(true);
        adminArea.setHouseCreateView();

    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtAddressLine1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressLine1KeyReleased

        int selectRowIndex = tblDetails.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        Community community = (Community) model.getValueAt(selectRowIndex, 4);
        String currentAddress = model.getValueAt(selectRowIndex, 2).toString() + " " + model.getValueAt(selectRowIndex, 3);
        
        
        if ("".equals(txtAddressLine1.getText())) {
            valAddress.setText("Address Line 1 is required");
        } else {
            
            if (!((txtAddressLine1.getText()+ " "+ txtAddressLine2.getText()).equals(currentAddress)) && community.isAddressExist(txtAddressLine1.getText(), txtAddressLine2.getText())) {
                valAddress.setText("This address already exist");
            }
            else {
                valAddress.setText(null);
            }
        }
    }//GEN-LAST:event_txtAddressLine1KeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectRowIndex = tblDetails.getSelectedRow();
        if (selectRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        Community selectedDetails = (Community) model.getValueAt(selectRowIndex, 4);
        House houseDetails = (House) model.getValueAt(selectRowIndex, 5);

        // Validation
        var valid = true;

        // Validations
        if (txtAddressLine1.getText().isEmpty()) {
            valAddress.setText("Address Line 1 is required");
            valid = false;
        }

        String currentAddress = model.getValueAt(selectRowIndex, 2).toString() + " " + model.getValueAt(selectRowIndex, 3);
        
        
        if (!((txtAddressLine1.getText()+ " "+ txtAddressLine2.getText()).equals(currentAddress)) && selectedDetails.isAddressExist(txtAddressLine1.getText(), txtAddressLine2.getText())) {
            valAddress.setText("This address already exist");
            valid = false;
        }

        // Validations ended

        if (valid) {

            // Set value
            houseDetails.setAddressLine1(txtAddressLine1.getText());
            houseDetails.setAddressLine2(txtAddressLine2.getText());

            JOptionPane.showMessageDialog(this, "Updated the details successfully");

            populateTable();
            originalTableModel = (Vector) ((DefaultTableModel) tblDetails.getModel()).getDataVector().clone();
            valAddress.setText(null);
            txtCommunity.setText(null);
            txtAddressLine1.setText(null);
            txtCity.setText(null);
            txtAddressLine2.setText(null);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();

        model.setRowCount(0);
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().toLowerCase().contains(txtSearch.getText())) {
                    //content found so adding to table
                    model.addRow(rowVector);
                    break;
                }
            }

        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetailsMouseClicked

        DefaultTableModel tblModel = (DefaultTableModel) tblDetails.getModel();

        // set data to textfield when raw is selected

        String tblCity = tblModel.getValueAt(tblDetails.getSelectedRow(),0).toString();
        String tblCommunity = tblModel.getValueAt(tblDetails.getSelectedRow(),1).toString();
        String tblAddressLine1 = tblModel.getValueAt(tblDetails.getSelectedRow(),2).toString();
        String tblAddressLine2 = tblModel.getValueAt(tblDetails.getSelectedRow(),3).toString();

        txtCommunity.setText(tblCommunity);
        txtCity.setText(tblCity);
        txtAddressLine1.setText(tblAddressLine1);
        txtAddressLine2.setText(tblAddressLine2);

    }//GEN-LAST:event_tblDetailsMouseClicked

    private void txtAddressLine2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressLine2KeyReleased
        int selectRowIndex = tblDetails.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        Community community = (Community) model.getValueAt(selectRowIndex, 4);
        String currentAddress = model.getValueAt(selectRowIndex, 2).toString() + " " + model.getValueAt(selectRowIndex, 3);
        
        
        if (!((txtAddressLine1.getText()+ " "+ txtAddressLine2.getText()).equals(currentAddress)) && community.isAddressExist(txtAddressLine1.getText(), txtAddressLine2.getText())) {
                valAddress.setText("This address already exist");
        }
        else {
            valAddress.setText(null);
        }
    }//GEN-LAST:event_txtAddressLine2KeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed
    
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        
        for (Community c : MainJFrame.communityDirectory.getDirectory()){
            for (House h : c.getHouseList()) {
                Object[] row = new Object[6];
                
                row[0] = c.getCity().getName();
                row[1] = c.getName();
                row[2] = h.getAddressLine1();
                row[3] = h.getAddressLine2();
                row[4] = c;
                row[5] = h;
                
                model.addRow(row);
            } 
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddressLine1;
    private javax.swing.JLabel lblAddressLine2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHouseRecord;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel valAddress;
    // End of variables declaration//GEN-END:variables
}