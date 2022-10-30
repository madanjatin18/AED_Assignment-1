/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.SystemAdmin;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.City;
import models.Community;
import models.Hospital;
import models.Person;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import resources.Validations;
import view.MainJFrame;

/**
 *
 * @author madan
 */
public class DoctorCreate extends javax.swing.JPanel {

    /**
     * Creates new form DoctorCreate
     */
    
    Validations validations;
    City city;
    Community community;
    Hospital hospital;
    
    public DoctorCreate() {
        initComponents();
        AutoCompleteDecorator.decorate(ddCity);
        AutoCompleteDecorator.decorate(ddCommunity);
        AutoCompleteDecorator.decorate(ddHospital);
        
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

        btnGender = new javax.swing.ButtonGroup();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        ddCommunity = new javax.swing.JComboBox<>();
        lblAbout = new javax.swing.JLabel();
        valAbout = new javax.swing.JLabel();
        valCity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        valCommunity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        ddCity = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnOther = new javax.swing.JRadioButton();
        valName = new javax.swing.JLabel();
        valAge = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        valGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        valPhone = new javax.swing.JLabel();
        valEmail = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtAbout = new javax.swing.JTextField();
        valUsername = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        valHospital = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        ddHospital = new javax.swing.JComboBox<>();

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

        ddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCommunityActionPerformed(evt);
            }
        });

        lblAbout.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblAbout.setText("About:");

        valAbout.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAbout.setForeground(new java.awt.Color(255, 0, 0));

        valCity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCity.setForeground(new java.awt.Color(255, 0, 0));

        lblCity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCity.setText("City:");

        valCommunity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCommunity.setForeground(new java.awt.Color(255, 0, 0));

        lblCommunity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity.setText("Community:");

        ddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCityActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Personal Details");

        btnGender.add(btnOther);
        btnOther.setText("Other");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherActionPerformed(evt);
            }
        });

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valName.setForeground(new java.awt.Color(255, 0, 0));

        valAge.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAge.setForeground(new java.awt.Color(255, 0, 0));

        lblName.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblName.setText("Name:");

        valGender.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valGender.setForeground(new java.awt.Color(255, 0, 0));

        lblAge.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblAge.setText("Age:");

        lblGender.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblGender.setText("Gender:");

        valPhone.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valPhone.setForeground(new java.awt.Color(255, 0, 0));

        valEmail.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valEmail.setForeground(new java.awt.Color(255, 0, 0));

        lblPhoneNumber.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");

        lblEmail.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblEmail.setText("Email:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        btnGender.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        btnGender.add(btnFemale);
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 18)); // NOI18N
        lblPassword.setText("Password:");

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });

        txtAbout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAboutKeyReleased(evt);
            }
        });

        valUsername.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valUsername.setForeground(new java.awt.Color(255, 0, 0));

        valPassword.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valPassword.setForeground(new java.awt.Color(255, 0, 0));

        lblHospital.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblHospital.setText("Hospital :");

        valHospital.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valHospital.setForeground(new java.awt.Color(255, 0, 0));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        ddHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAge)
                            .addComponent(lblGender)
                            .addComponent(lblName)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblEmail))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnMale)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnFemale)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnOther))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valGender, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valAge, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword)
                            .addComponent(lblCity)
                            .addComponent(lblCommunity)
                            .addComponent(lblHospital)
                            .addComponent(lblAbout))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave))
                            .addComponent(ddCity, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(txtAbout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(ddCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(ddHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valCity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valAge, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valGender, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMale)
                            .addComponent(lblGender))
                        .addComponent(btnFemale)
                        .addComponent(btnOther)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(valPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhoneNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsername)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(valPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCity)
                        .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valCity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunity)
                    .addComponent(ddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHospital)
                        .addComponent(ddHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAbout)
                        .addComponent(txtAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        }

        if (!this.validations.ValidateEmpty(txtAbout.getText()) ) {
            valAbout.setText("Details are required");
            valid = false;
        }
        
        if (btnGender.getSelection() == null) {
            valGender.setText("Gender is required");
            valid = false;
        }
        
        if (!this.validations.ValidateEmail(txtEmail.getText()) ) {
            valEmail.setText("Email address is Invalid");
            valid = false;
        } else if (MainJFrame.personDirectory.isPersonByEmailExist(txtEmail.getText())) {
                valEmail.setText("Email address already exist");
                valid = false;
            }
        
        if (!this.validations.ValidatePhoneNumber(txtPhoneNumber.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
            valid = false;
        }
        
        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
            valid = false;
        }
        
        if (!this.validations.ValidateUsername(txtUsername.getText()) ) {
            valUsername.setText("Username is Invalid");
            valid = false;
        } else if (MainJFrame.personDirectory.isPersonByUsernameExist(txtUsername.getText())) {
                valUsername.setText("Username already exist");
                valid = false;
            }
        
        String password = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(password) ) {
            valPassword.setText("Should be 5-12 character long");
            valid = false;
        }

        //
        if (valid) {
            
            String gender;
            if (btnMale.isSelected()) {
                gender = "Male";
            }
            else if (btnFemale.isSelected()) {
                gender = "Female";
            }
            else {
                gender = "Other";
            }
            
            MainJFrame.doctorDirectory.newDoctor(txtAbout.getText(), this.hospital, txtName.getText(), Integer.parseInt(txtAge.getText()), txtEmail.getText(), gender, txtPhoneNumber.getText(), city, community, txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
            JOptionPane.showMessageDialog(this, "Doctor details Added");
            setTextNull();
            setValidationNull();

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        SystemAdminJFrame adminArea = new SystemAdminJFrame();
        adminArea.setVisible(true);
        adminArea.setDoctorCreateView();
    }//GEN-LAST:event_btnBackActionPerformed

    private void ddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCommunityActionPerformed

        Object communityName = ddCommunity.getSelectedItem();
        Object cityName = ddCity.getSelectedItem();
        
        if (communityName == null) {
            communityName = "";
        }
                

        if (communityName.toString().equals("")) {
            valCommunity.setText("Please Select Community");
            ddHospital.removeAllItems();
            valHospital.setText(null);
        } else {
            valHospital.setText(null);
            valCommunity.setText(null);
            ddHospital.removeAllItems();
            community = MainJFrame.communityDirectory.getCommunity(cityName.toString(),communityName.toString());
            ArrayList<Hospital> hospitalList = MainJFrame.hospitalDirectory.searchHospitalByCommunity(community);

            ddHospital.addItem("");
            for (Hospital c: hospitalList) {
                ddHospital.addItem(c.getName());
            }
            ddHospital.setSelectedItem("");
        }
    }//GEN-LAST:event_ddCommunityActionPerformed

    private void ddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCityActionPerformed

        Object city_name = ddCity.getSelectedItem();

        if (city_name == null || city_name.toString().equals("")) {
            valCity.setText("Please Select City");
            ddCommunity.removeAllItems();
            ddHospital.removeAllItems();
            valHospital.setText(null);
            valCommunity.setText(null);
        } else {
            valCity.setText(null);
            valHospital.setText(null);
            ddCommunity.removeAllItems();
            ddHospital.removeAllItems();
            city = MainJFrame.cityDirectory.findCity(city_name.toString());
            ArrayList<Community> communityList = MainJFrame.communityDirectory.searchCommunitiesByCityObject(city);

            ddCommunity.addItem("");
            for (Community c: communityList) {
                ddCommunity.addItem(c.getName());
            }
            ddCommunity.setSelectedItem("");
        }
    }//GEN-LAST:event_ddCityActionPerformed

    private void btnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnOtherActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased

        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
        }
        else {
            valName.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased

        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
        }
        else {
            valAge.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased

        if (!this.validations.ValidatePhoneNumber(txtPhoneNumber.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
        }
        else {
            valPhone.setText(null);
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateEmail(txtEmail.getText()) ) {
            valEmail.setText("Email address is Invalid");
        } else if (MainJFrame.personDirectory.isPersonByEmailExist(txtEmail.getText())) {
                valEmail.setText("Email address already exist");
            }
        
        else {
            valEmail.setText(null);
        }
        
    }//GEN-LAST:event_txtEmailKeyReleased

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        if (!this.validations.ValidateUsername(txtUsername.getText()) ) {
                valUsername.setText("Username is Invalid");
        } else if (MainJFrame.personDirectory.isPersonByUsernameExist(txtUsername.getText())) {
                valUsername.setText("Username already exist");
            }
        
        else {
            valUsername.setText(null);
        }
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtAboutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAboutKeyReleased
        if (!this.validations.ValidateEmpty(txtAbout.getText()) ) {
            valAbout.setText("Description is required");
        } else {
            valAbout.setText(null);
        }
    }//GEN-LAST:event_txtAboutKeyReleased

    private void ddHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddHospitalActionPerformed
        Object hospitalName = ddHospital.getSelectedItem();
        
        if (hospitalName == null) {
            hospitalName = "";
        }

        if (hospitalName.toString().equals("")) {
            valHospital.setText("Please Select Hospital");
        } else {
            valHospital.setText(null);
            hospital = MainJFrame.hospitalDirectory.getHospitalObject(hospitalName.toString(), city, community);

        }
    }//GEN-LAST:event_ddHospitalActionPerformed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        
        String password = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(password) ) {
            valPassword.setText("Should be 5-12 character long");
        } else {
            valPassword.setText(null);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void setTextNull() {
        ddCity.setSelectedItem("");
        ddCommunity.setSelectedItem("");
        ddHospital.setSelectedItem("");
        btnGender.clearSelection();
        txtName.setText(null);
        txtAge.setText(null);
        txtPhoneNumber.setText(null);
        txtEmail.setText(null);
        txtUsername.setText(null);
        txtPassword.setText(null);
        txtAbout.setText(null);
        
    }
    
    private void setValidationNull() {
        valCity.setText(null);
        valCommunity.setText(null);
        valHospital.setText(null);
        valName.setText(null);
        valAbout.setText(null);
        valAge.setText(null);
        valGender.setText(null);
        valPhone.setText(null);
        valEmail.setText(null);
        valUsername.setText(null);
        valPassword.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOther;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> ddCity;
    private javax.swing.JComboBox<String> ddCommunity;
    private javax.swing.JComboBox<String> ddHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAbout;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel valAbout;
    private javax.swing.JLabel valAge;
    private javax.swing.JLabel valCity;
    private javax.swing.JLabel valCommunity;
    private javax.swing.JLabel valEmail;
    private javax.swing.JLabel valGender;
    private javax.swing.JLabel valHospital;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valPhone;
    private javax.swing.JLabel valUsername;
    // End of variables declaration//GEN-END:variables
}
