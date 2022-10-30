/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.HospitalAdmin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import models.Doctor;
import models.Encounter;
import resources.Validations;
import view.MainJFrame;

/**
 *
 * @author madan
 */
public class EncounterViewUpdate extends javax.swing.JPanel {

    /**
     * Creates new form EncounterViewUpdate
     */
    
    Validations validations;
    Vector originalTableModel;
    public EncounterViewUpdate() {
        initComponents();
        MainJFrame.defaultSearchText(txtSearch, "Search by city or community");
        validations = new Validations();
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

        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        lblDoctorRecord = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        lblCommunity1 = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        txtPatient = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        valDate = new javax.swing.JLabel();

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Hospital", "Doctor", "Patient", "Date", "object", "City", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            tblDetails.getColumnModel().getColumn(6).setMinWidth(0);
            tblDetails.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblDetails.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        lblDoctorRecord.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 24)); // NOI18N
        lblDoctorRecord.setText("Encounter Records");

        lblName.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblName.setText("Doctor :");

        btn_create.setText("Create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCity.setText("City :");

        lblCommunity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity.setText("Community :");

        lblAge.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblAge.setText("Patient :");

        txtCity.setEditable(false);

        txtCommunity.setEditable(false);

        lblCommunity1.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity1.setText("Hospital :");

        txtHospital.setEditable(false);

        txtDoctor.setEditable(false);

        txtPatient.setEditable(false);

        lblDate.setText("Date :");
        lblDate.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N

        valDate.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valDate.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDoctorRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lblAge))
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCommunity1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(41, 41, 41)
                        .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblDate)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valDate, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoctorRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCity))
                    .addComponent(btn_create))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCommunity1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(valDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectRowIndex = tblDetails.getSelectedRow();
        if (selectRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        Encounter selectedDetails = (Encounter) model.getValueAt(selectRowIndex, 4);

        var valid = true;
        
        if (!this.validations.ValidateEmpty(datePicker.getDateStringOrEmptyString()) ) {
            valDate.setText("Date of joining is required");
            valid = false;
        }

        //
        if (valid) {

            Date date;
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
            
            try {
                date = formatter.parse(datePicker.getDateStringOrEmptyString());
                
            } catch (ParseException ex) {
                date = new Date(1970, 01, 01);
            }


            selectedDetails.setDate(date);

            JOptionPane.showMessageDialog(this, "Encounter details Updated");
            setTextNull();
            valDate.setText(null);
            populateTable();

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        setTextNull();
        valDate.setText(null);
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

        String tblHospital = tblModel.getValueAt(tblDetails.getSelectedRow(),0).toString();
        String tblDoctor = tblModel.getValueAt(tblDetails.getSelectedRow(),1).toString();
        String tblPatient = tblModel.getValueAt(tblDetails.getSelectedRow(),2).toString();
        Date tblDate = (Date) tblModel.getValueAt(tblDetails.getSelectedRow(),3);
        Encounter tblObj = (Encounter) tblModel.getValueAt(tblDetails.getSelectedRow(),4);
        String tblCity = tblModel.getValueAt(tblDetails.getSelectedRow(),5).toString();
        String tblCommunity = tblModel.getValueAt(tblDetails.getSelectedRow(),6).toString();
        
        LocalDate localDate = tblDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        txtCity.setText(tblCity);
        txtCommunity.setText(tblCommunity);
        txtHospital.setText(tblHospital);
        txtDoctor.setText(tblDoctor);
        txtPatient.setText(tblPatient);
        datePicker.setDate(localDate);

        valDate.setText(null);
    }//GEN-LAST:event_tblDetailsMouseClicked

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed

        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        HospitalAdminJFrame adminArea = new HospitalAdminJFrame();
        adminArea.setVisible(true);
        adminArea.setEncounterCreateView();
    }//GEN-LAST:event_btn_createActionPerformed

    private void datePickerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datePickerKeyReleased
        if (!this.validations.ValidateEmpty(datePicker.getDateStringOrEmptyString()) ) {
            valDate.setText("Date of joining is required");
        }
        else {
            valDate.setText(null);
        }
    }//GEN-LAST:event_datePickerKeyReleased

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        
        for (Encounter c : MainJFrame.encounterDirectory.getEncouterList()){
            Object[] row = new Object[7];
            row[0] = c.getHospital().getName();
            row[1] = c.getDoctor().getName();
            row[2] = c.getPatient().getName();
            row[3] = c.getDate();
            row[4] = c;
            row[5] = c.getHospital().getCity().getName();
            row[6] = c.getHospital().getCommunity().getName();
            
            model.addRow(row);
        }
    }
    
    public void setTextNull() {
        txtCity.setText(null);
        txtCommunity.setText(null);
        txtDoctor.setText(null);
        txtPatient.setText(null);
        txtHospital.setText(null);
        datePicker.setDate(null);
               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_create;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunity1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorRecord;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtPatient;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel valDate;
    // End of variables declaration//GEN-END:variables
}
