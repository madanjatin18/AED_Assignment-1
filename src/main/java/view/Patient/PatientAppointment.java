/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Patient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import models.Doctor;
import models.Patient;
import resources.Validations;
import view.MainJFrame;

/**
 *
 * @author madan
 */
public class PatientAppointment extends javax.swing.JPanel {

    /**
     * Creates new form PatientAppointment
     */
    
    Vector originalTableModel;
    Validations validations;
    Patient patient;
    Date date;
    Date now;
    SimpleDateFormat formatter;
    Boolean valid;
    public PatientAppointment() {
        initComponents();
        MainJFrame.defaultSearchText(txtSearch, "Search ...");
        formatter = new SimpleDateFormat("yyyy-MM-dd");
        populateTable();
        patient = (Patient) MainJFrame.loginSession.getObject();
        validations = new Validations();
        originalTableModel = (Vector) ((DefaultTableModel) tblDetails.getModel()).getDataVector().clone();
        btn_create.setVisible(false);
        txtDate1.setVisible(false);
        lblDate.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        lblDoctorRecord = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtHospital = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        lblCommunity4 = new javax.swing.JLabel();
        lblCommunity3 = new javax.swing.JLabel();
        lblCommunity1 = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        txtAbout = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        valDate = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateKeyReleased(evt);
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
                "Name", "About", "Community", "Hospital", "Gender", "object"
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

        lblDoctorRecord.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 24)); // NOI18N
        lblDoctorRecord.setText("Community Doctors");

        txtGender.setEditable(false);

        txtHospital.setEditable(false);

        txtCommunity.setEditable(false);

        lblCommunity4.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity4.setText("Gender :");

        lblCommunity3.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity3.setText("Hospital :");

        lblCommunity1.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity1.setText("Community :");

        btn_create.setText("Book Appointment");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCity.setText("Doctor :");

        lblCommunity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity.setText("About :");

        txtDoctor.setEditable(false);

        txtAbout.setEditable(false);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        valDate.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valDate.setForeground(new java.awt.Color(255, 0, 0));

        txtDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDate1ActionPerformed(evt);
            }
        });
        txtDate1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDate1KeyReleased(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblDate.setText("Date :");

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 72, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCommunity)
                                    .addComponent(lblCommunity4)
                                    .addComponent(lblCommunity3)
                                    .addComponent(lblCommunity1)
                                    .addComponent(lblCity)
                                    .addComponent(lblDate))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(txtHospital, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                        .addComponent(txtDate1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(valDate, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity1)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity3)
                            .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity4)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate)))
                    .addComponent(valDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_create)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetailsMouseClicked

        DefaultTableModel tblModel = (DefaultTableModel) tblDetails.getModel();

        // set data to textfield when raw is selected

        String tblName = tblModel.getValueAt(tblDetails.getSelectedRow(),0).toString();
        String tblAbout = tblModel.getValueAt(tblDetails.getSelectedRow(),1).toString();
        String tblCommunity = tblModel.getValueAt(tblDetails.getSelectedRow(),2).toString();
        String tblHospital = tblModel.getValueAt(tblDetails.getSelectedRow(),3).toString();
        String tblGender = tblModel.getValueAt(tblDetails.getSelectedRow(),4).toString();

        txtDoctor.setText(tblName);
        txtAbout.setText(tblAbout);
        txtHospital.setText(tblHospital);
        txtCommunity.setText(tblCommunity);
        txtGender.setText(tblGender);
        
        btn_create.setVisible(true);
        txtDate1.setVisible(true);
        lblDate.setVisible(false);
    }//GEN-LAST:event_tblDetailsMouseClicked

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed

        DefaultTableModel tblModel = (DefaultTableModel) tblDetails.getModel();
        Doctor doctor = (Doctor) tblModel.getValueAt(tblDetails.getSelectedRow(),5);
        
        var valid = true;

        if (txtDate1.getText()!=null){

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            try {
                date = formatter.parse(txtDate1.getText());
                now = formatter.parse("2022-10-30");
            } catch (ParseException ex) {
                valid=false;
                valDate.setText("Date should be in yyyy-mm-dd");
            }
            
            if(date!= null){
                if(date.compareTo(now) < 0){
                    valid = false;
                    valDate.setText("Date should be of future");
                }
            }
        }
        if (valid) {
                      
            if (!doctor.getHospital().isPatientExist(patient)) {
               doctor.getHospital().addPatient(patient);
            }
            
            MainJFrame.encounterDirectory.newEncounter(date, doctor, doctor.getHospital(), patient);
            valDate.setText(null);
            
            JOptionPane.showMessageDialog(this, "Appointment Created");
            txtDate1.setVisible(false);
            lblDate.setVisible(false);
        }
        
    }//GEN-LAST:event_btn_createActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        setTextNull();
        btn_create.setVisible(false);
        txtDate.setVisible(false);
        
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

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDateKeyReleased

    private void txtDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDate1ActionPerformed

    private void txtDate1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDate1KeyReleased
        // TODO add your handling code here:
        if ((txtDate1.getText() == null) ) {
            valDate.setText("Date is required");
        }
        try {
            date = formatter.parse(txtDate1.getText());
        }
        catch (ParseException ex) {
            valid=false;
            valDate.setText("Date should be in yyyy-mm-dd");
        }
    }//GEN-LAST:event_txtDate1KeyReleased

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        Patient p = (Patient) MainJFrame.loginSession.getObject();
        
        for (Doctor c : MainJFrame.hospitalDirectory.getDoctorsInCommunity(p.getCommunity())){
            Object[] row = new Object[6];
            row[0] = c.getName();
            row[1] = c.getAbout();
            row[2] = c.getCommunity().getName();
            row[3] = c.getHospital().getName();
            row[4] = c.getGender();
            row[5] = c;
            
            model.addRow(row);
        }
    }
    
    private void setTextNull() {
        txtDoctor.setText(null);
        txtCommunity.setText(null);
        txtHospital.setText(null);
        txtGender.setText(null);
        txtAbout.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunity1;
    private javax.swing.JLabel lblCommunity3;
    private javax.swing.JLabel lblCommunity4;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorRecord;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtAbout;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel valDate;
    // End of variables declaration//GEN-END:variables
}
