/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.SystemAdmin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.City;
import models.Community;
import models.Doctor;
import models.Encounter;
import models.Hospital;
import models.Patient;
import resources.Validations;
import view.MainJFrame;

/**
 *
 * @author madan
 */
public class EncounterCreate extends javax.swing.JPanel {

    /**
     * Creates new form EncounterCreate
     */
    
    City city;
    Community community;
    Hospital hospital;
    Doctor doctor;
    Patient patient;
    Validations validations;
    
    public EncounterCreate() {
        initComponents();
        ddCity.removeAllItems();
        ddCity.addItem("");
        for (City c: MainJFrame.cityDirectory.getCityList()) {
            ddCity.addItem(c.getName());
        }
        ddCity.setSelectedItem("");
        validations = new Validations();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valCommunity = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        valHospital = new javax.swing.JLabel();
        ddCity = new javax.swing.JComboBox<>();
        ddCommunity = new javax.swing.JComboBox<>();
        valCity = new javax.swing.JLabel();
        ddHospital = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        ddDoctor = new javax.swing.JComboBox<>();
        lblDoctor = new javax.swing.JLabel();
        ddPatient = new javax.swing.JComboBox<>();
        valDoctor = new javax.swing.JLabel();
        valPatient = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        valDate = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        valCommunity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCommunity.setForeground(new java.awt.Color(255, 0, 0));

        lblHospital.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblHospital.setText("Hospital :");

        lblCommunity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity.setText("Community:");

        valHospital.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valHospital.setForeground(new java.awt.Color(255, 0, 0));

        ddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCityActionPerformed(evt);
            }
        });

        ddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCommunityActionPerformed(evt);
            }
        });

        valCity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCity.setForeground(new java.awt.Color(255, 0, 0));

        ddHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddHospitalActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCity.setText("City:");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Encounter Details");

        lblPatient.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblPatient.setText("Patient :");

        ddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddDoctorActionPerformed(evt);
            }
        });

        lblDoctor.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblDoctor.setText("Doctor :");

        ddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddPatientActionPerformed(evt);
            }
        });

        valDoctor.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valDoctor.setForeground(new java.awt.Color(255, 0, 0));

        valPatient.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valPatient.setForeground(new java.awt.Color(255, 0, 0));

        lblDate.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblDate.setText("Date :");

        datePicker.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                datePickerKeyReleased(evt);
            }
        });

        valDate.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valDate.setForeground(new java.awt.Color(255, 0, 0));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPatient)
                            .addComponent(lblDoctor)
                            .addComponent(lblDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ddDoctor, 0, 223, Short.MAX_VALUE)
                            .addComponent(ddPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ddCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ddCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ddHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valCity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valDate, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCity)
                        .addComponent(lblCommunity)
                        .addComponent(lblHospital))
                    .addContainerGap(595, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valCity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoctor)
                            .addComponent(valDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPatient)
                        .addComponent(ddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(lblCity)
                    .addGap(18, 18, 18)
                    .addComponent(lblCommunity)
                    .addGap(18, 18, 18)
                    .addComponent(lblHospital)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCityActionPerformed

        Object city_name = ddCity.getSelectedItem();

        if (city_name == null || city_name.toString().equals("")) {
            valCity.setText("Please Select City");
            ddCommunity.removeAllItems();
            ddHospital.removeAllItems();
            ddDoctor.removeAllItems();
            ddPatient.removeAllItems();
            valHospital.setText(null);
            valCommunity.setText(null);
            valDoctor.setText(null);
            valPatient.setText(null);
            
        } else {
            valCity.setText(null);
            valHospital.setText(null);
            valDoctor.setText(null);
            valPatient.setText(null);
            ddCommunity.removeAllItems();
            ddHospital.removeAllItems();
            ddDoctor.removeAllItems();
            ddPatient.removeAllItems();
            city = MainJFrame.cityDirectory.findCity(city_name.toString());
            ArrayList<Community> communityList = MainJFrame.communityDirectory.searchCommunitiesByCityObject(city);

            ddCommunity.addItem("");
            for (Community c: communityList) {
                ddCommunity.addItem(c.getName());
            }
            ddCommunity.setSelectedItem("");
        }
    }//GEN-LAST:event_ddCityActionPerformed

    private void ddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCommunityActionPerformed

        Object communityName = ddCommunity.getSelectedItem();
        Object cityName = ddCity.getSelectedItem();

        if (communityName == null || communityName.toString().equals("")) {
            valCommunity.setText("Please Select Community");
            ddHospital.removeAllItems();
            valHospital.setText(null);
            ddDoctor.removeAllItems();
            ddPatient.removeAllItems();
            valDoctor.setText(null);
            valPatient.setText(null);
        } else {
            valHospital.setText(null);
            valCommunity.setText(null);
            valDoctor.setText(null);
            valPatient.setText(null);
            ddHospital.removeAllItems();
            ddDoctor.removeAllItems();
            ddPatient.removeAllItems();
            community = MainJFrame.communityDirectory.getCommunity(cityName.toString(),communityName.toString());
            ArrayList<Hospital> hospitalList = MainJFrame.hospitalDirectory.searchHospitalByCommunity(community);

            ddHospital.addItem("");
            for (Hospital c: hospitalList) {
                ddHospital.addItem(c.getName());
            }
            ddHospital.setSelectedItem("");
        }
    }//GEN-LAST:event_ddCommunityActionPerformed

    private void ddHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddHospitalActionPerformed
        Object hospitalName = ddHospital.getSelectedItem();

        if (hospitalName == null || hospitalName.toString().equals("")) {
            valHospital.setText("Please Select Hospital");
            ddDoctor.removeAllItems();
            ddPatient.removeAllItems();
            valDoctor.setText(null);
            valPatient.setText(null);
        } else {
            ddDoctor.removeAllItems();
            ddPatient.removeAllItems();
            valHospital.setText(null);
            hospital = MainJFrame.hospitalDirectory.getHospitalObject(hospitalName.toString(), city, community);
            
            ddDoctor.addItem("");
            for (Doctor c: hospital.getDoctorList()) {
                ddDoctor.addItem(c.getName());
            }
            ddDoctor.setSelectedItem("");
            
            ddPatient.addItem("");
            for (Patient c: hospital.getPatientList()) {
                ddPatient.addItem(c.getName());
            }
            ddPatient.setSelectedItem("");

        }
    }//GEN-LAST:event_ddHospitalActionPerformed

    private void ddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddDoctorActionPerformed
        Object doctorName = ddDoctor.getSelectedItem();

        if (doctorName == null || doctorName.toString().equals("")) {
            valDoctor.setText("Please Select Doctor");
        } else {
            valDoctor.setText(null);
            doctor = hospital.getDoctorByName(doctorName.toString());

        }
    }//GEN-LAST:event_ddDoctorActionPerformed

    private void ddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddPatientActionPerformed
        Object patientName = ddPatient.getSelectedItem();

        if (patientName == null || patientName.toString().equals("")) {
            valPatient.setText("Please Select Doctor");
        } else {
            valPatient.setText(null);
            patient = hospital.getPatientByName(patientName.toString());

        }
    }//GEN-LAST:event_ddPatientActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        var valid = true;

        if (ddCity.getSelectedItem() == null || ddCity.getSelectedItem().toString().isEmpty()) {
            valCity.setText("Please Select City");
            valid = false;
        }

        if (ddCommunity.getSelectedItem() == null || ddCommunity.getSelectedItem().toString().isEmpty()) {
            valCommunity.setText("Please Select Community");
            valid = false;
        }

        if (ddHospital.getSelectedItem() == null || ddHospital.getSelectedItem().toString().isEmpty()) {
            valHospital.setText("Please Select Hospital");
            valid = false;
        }
        
        if (!this.validations.ValidateEmpty(datePicker.getDateStringOrEmptyString()) ) {
            valDate.setText("Date of joining is required");
            valid = false;
        }

        if (ddDoctor.getSelectedItem() == null || ddDoctor.getSelectedItem().toString().isEmpty()) {
            valDoctor.setText("Please Select doctor");
            valid = false;
        }
        
        if (ddPatient.getSelectedItem() == null || ddPatient.getSelectedItem().toString().isEmpty()) {
            valPatient.setText("Please Select patient");
            valid = false;
        }
        if (valid) {

            Date date;
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
            
            try {
                date = formatter.parse(datePicker.getDateStringOrEmptyString());
                
            } catch (ParseException ex) {
                date = new Date(1970, 01, 01);
            }

            MainJFrame.encounterDirectory.newEncounter(date, doctor, hospital, patient);
            
            JOptionPane.showMessageDialog(this, "encounter details Added");
            ddCity.setSelectedItem("");
            ddCommunity.setSelectedItem("");
            ddHospital.setSelectedItem("");
            ddDoctor.setSelectedItem("");
            ddPatient.setSelectedItem("");
            datePicker.setDate(null);
            valCity.setText(null);
            valCommunity.setText(null);
            valDate.setText(null);
            valDoctor.setText(null);
            valHospital.setText(null);
            valPatient.setText(null);
                    
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        SystemAdminJFrame adminArea = new SystemAdminJFrame();
        adminArea.setVisible(true);
        adminArea.setEncounterUpdateView();
    }//GEN-LAST:event_btnBackActionPerformed

    private void datePickerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datePickerKeyReleased
        if (!this.validations.ValidateEmpty(datePicker.getDateStringOrEmptyString()) ) {
            valDate.setText("Date of joining is required");
        }
        else {
            valDate.setText(null);
        }
    }//GEN-LAST:event_datePickerKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JComboBox<String> ddCity;
    private javax.swing.JComboBox<String> ddCommunity;
    private javax.swing.JComboBox<String> ddDoctor;
    private javax.swing.JComboBox<String> ddHospital;
    private javax.swing.JComboBox<String> ddPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel valCity;
    private javax.swing.JLabel valCommunity;
    private javax.swing.JLabel valDate;
    private javax.swing.JLabel valDoctor;
    private javax.swing.JLabel valHospital;
    private javax.swing.JLabel valPatient;
    // End of variables declaration//GEN-END:variables
}
