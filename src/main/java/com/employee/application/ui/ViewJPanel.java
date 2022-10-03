/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.employee.application.ui;

import com.employee.application.EmployeeHistory;
import com.employee.application.EmployeeInfo;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author madan
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeHistory employeeHistory;
    String selectedImagePath;
    public ViewJPanel(EmployeeHistory employeeHistory) {
        initComponents();
        this.employeeHistory = employeeHistory;
        lblImageIcon.setText("");
        lblImageIcon.setVisible(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewTable = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblGender = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblContactNum = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        txtContactNum = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblMailId = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtMailId = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        lblEmpId = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblImageIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblViewTable.setBackground(new java.awt.Color(204, 204, 204));
        tblViewTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Start Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 79, 590, 150));

        btnView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        lblGender.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblGender.setText("Gender:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 384, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 310, -1, -1));

        lblTeamInfo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblTeamInfo.setText("Team Information:");
        add(lblTeamInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 418, -1, -1));

        txtStartDate.setEditable(false);
        add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 517, 194, -1));

        lblAge.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblAge.setText("Age: ");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 350, -1, -1));

        lblContactNum.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblContactNum.setText("Contact Number:");
        add(lblContactNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 554, -1, -1));

        lblPosition.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblPosition.setText("Position:");
        add(lblPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 452, -1, -1));

        txtContactNum.setEditable(false);
        txtContactNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumActionPerformed(evt);
            }
        });
        add(txtContactNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 551, 194, -1));

        lblLevel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblLevel.setText("Level:");
        add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 486, -1, -1));

        lblStartDate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblStartDate.setText("Start Date:");
        add(lblStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 520, -1, -1));

        txtTeamInfo.setEditable(false);
        add(txtTeamInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 415, 194, -1));

        lblMailId.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblMailId.setText("Mail ID:");
        add(lblMailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 588, -1, -1));

        txtGender.setEditable(false);
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 381, 194, -1));

        txtMailId.setEditable(false);
        txtMailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailIdActionPerformed(evt);
            }
        });
        add(txtMailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 585, 194, -1));

        txtEmpId.setEditable(false);
        add(txtEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 273, 194, -1));

        txtName.setEditable(false);
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 307, 194, -1));

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 347, 194, -1));

        txtLevel.setEditable(false);
        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });
        add(txtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 483, 194, -1));

        lblEmpId.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblEmpId.setText("Employee ID:");
        add(lblEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 276, -1, -1));

        txtPosition.setEditable(false);
        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });
        add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 449, 194, -1));

        lblImageIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblImageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 100, 100));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText(" EMPLOYEE PROFILE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtMailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailIdActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblViewTable.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"No Record selected to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblViewTable.getModel();
        EmployeeInfo selectedemployeeInfo = (EmployeeInfo) model.getValueAt(selectedRowIndex , 0);
        
        employeeHistory.deleteEmployeeHistory(selectedemployeeInfo);
        
        populateTable();
        viewRefresh();
        JOptionPane.showMessageDialog(this,"The selected record has been deleted");
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        lblImageIcon.setVisible(true);
        
        int selectedRowIndex = tblViewTable.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"No Record selected to view");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblViewTable.getModel();
        int selectedEmployeeId =  (int) model.getValueAt(selectedRowIndex , 0);
        
        ArrayList<EmployeeInfo> listEmployee = employeeHistory.getHistory();
        for (EmployeeInfo individualEmployee : listEmployee) {
            if(selectedEmployeeId == individualEmployee.getEmpId()){      
                txtName.setText(individualEmployee.getName());
                txtEmpId.setText(String.valueOf(individualEmployee.getEmpId()));
                txtAge.setText(String.valueOf(individualEmployee.getAge()));
                txtGender.setText(individualEmployee.getGender());
                txtStartDate.setText(String.valueOf(individualEmployee.getStartDate()));
                txtLevel.setText(individualEmployee.getLevel());
                txtTeamInfo.setText(individualEmployee.getTeamInfo());
                txtPosition.setText(individualEmployee.getPosTitle());
                txtContactNum.setText(String.valueOf(individualEmployee.getContact()));
                txtMailId.setText(individualEmployee.getMailId());
          
                ImageIcon ii = new ImageIcon(individualEmployee.getProfilePicture());
                selectedImagePath = individualEmployee.getProfilePicture();
                //Resize image
                Image image = ii.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
                lblImageIcon.setIcon(new ImageIcon(image));
            }
        }
                

    }//GEN-LAST:event_btnViewActionPerformed
    public void viewRefresh(){
        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPosition.setText("");
        txtContactNum.setText("");
        txtMailId.setText("");
        lblImageIcon.setVisible(false);
        lblImageIcon.setIcon(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContactNum;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImageIcon;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblMailId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JTable tblViewTable;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNum;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtMailId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("unchecked")
    private void populateTable() {
       
        DefaultTableModel model = (DefaultTableModel) tblViewTable.getModel();
        model.setRowCount(0);
        

        for (EmployeeInfo employeeInfo  : employeeHistory.getHistory()) {
            Object [] row = new Object[3];
            row[0] = employeeInfo.getEmpId();
            row[1] = employeeInfo.getName();
            row[2] = employeeInfo.getStartDate();
            
            model.addRow(row);
  
    }
    }
   
    
}
