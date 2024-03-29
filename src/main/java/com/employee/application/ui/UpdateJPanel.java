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
import java.util.Date;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author madan
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    EmployeeHistory employeeHistory;
    EmployeeInfo employeeupdate;
    String selectedImagePath;
    public UpdateJPanel(EmployeeHistory employeeHistory) {
        initComponents();
        this.employeeHistory = employeeHistory;
        lblImageIcon1.setText("");
        lblImageIcon1.setVisible(false);
        btnChangeImage.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTeamInfo = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblMailId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        txtMailId = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblContactNum = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        txtContactNum = new javax.swing.JTextField();
        lblEmpId = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        lblImageIcon = new javax.swing.JLabel();
        txtSearchEmpId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtTeamInfo1 = new javax.swing.JTextField();
        lblMailId1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblTeamInfo1 = new javax.swing.JLabel();
        txtMailId1 = new javax.swing.JTextField();
        txtStartDate1 = new javax.swing.JTextField();
        txtEmpId1 = new javax.swing.JTextField();
        lblAge1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        lblContactNum1 = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JTextField();
        lblPosition1 = new javax.swing.JLabel();
        txtLevel1 = new javax.swing.JTextField();
        txtContactNum1 = new javax.swing.JTextField();
        lblEmpId1 = new javax.swing.JLabel();
        lblLevel1 = new javax.swing.JLabel();
        txtPosition1 = new javax.swing.JTextField();
        lblStartDate1 = new javax.swing.JLabel();
        lblImageIcon1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblError1 = new javax.swing.JLabel();
        lblGender1 = new javax.swing.JLabel();
        txtGender1 = new javax.swing.JTextField();
        btnChangeImage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        lblGender.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblGender.setText("Gender:");

        lblMailId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMailId.setText("Mail ID:");

        lblName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblName.setText("Name:");

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblTeamInfo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblTeamInfo.setText("Team Information:");

        txtMailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailIdActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblAge.setText("Age: ");

        lblContactNum.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblContactNum.setText("Contact Number:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblPosition.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblPosition.setText("Position:");

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        txtContactNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumActionPerformed(evt);
            }
        });

        lblEmpId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblEmpId.setText("Employee ID:");

        lblLevel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblLevel.setText("Level:");

        txtPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionActionPerformed(evt);
            }
        });

        lblStartDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblStartDate.setText("Start Date:");

        lblImageIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchEmpId.setText("Enter Employee ID");
        txtSearchEmpId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchEmpIdFocusGained(evt);
            }
        });
        txtSearchEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchEmpIdActionPerformed(evt);
            }
        });
        add(txtSearchEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 125, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));
        add(txtTeamInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 194, -1));

        lblMailId1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblMailId1.setText("Mail ID:");
        add(lblMailId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        lblName1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblName1.setText("Name:");
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 170, -1, -1));

        lblTeamInfo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblTeamInfo1.setText("Team Information:");
        add(lblTeamInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtMailId1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailId1FocusLost(evt);
            }
        });
        txtMailId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailId1ActionPerformed(evt);
            }
        });
        add(txtMailId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 194, -1));

        txtStartDate1.setEditable(false);
        add(txtStartDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 194, -1));

        txtEmpId1.setEditable(false);
        add(txtEmpId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 133, 194, -1));

        lblAge1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblAge1.setText("Age: ");
        add(lblAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 214, -1, -1));

        txtName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtName1FocusLost(evt);
            }
        });
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 167, 194, -1));

        lblContactNum1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblContactNum1.setText("Contact Number:");
        add(lblContactNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        txtAge1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAge1FocusLost(evt);
            }
        });
        txtAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAge1ActionPerformed(evt);
            }
        });
        add(txtAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 211, 194, -1));

        lblPosition1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblPosition1.setText("Position:");
        add(lblPosition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        txtLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevel1ActionPerformed(evt);
            }
        });
        add(txtLevel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 194, -1));

        txtContactNum1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactNum1FocusLost(evt);
            }
        });
        txtContactNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNum1ActionPerformed(evt);
            }
        });
        add(txtContactNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 194, -1));

        lblEmpId1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblEmpId1.setText("Employee ID:");
        add(lblEmpId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 136, -1, -1));

        lblLevel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblLevel1.setText("Level:");
        add(lblLevel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        txtPosition1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosition1ActionPerformed(evt);
            }
        });
        add(txtPosition1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 194, -1));

        lblStartDate1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblStartDate1.setText("Start Date:");
        add(lblStartDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        lblImageIcon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lblImageIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 133, 85, 85));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));
        add(lblError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 252, 17));

        lblGender1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblGender1.setText("Gender:");
        add(lblGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtGender1.setEditable(false);
        txtGender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGender1ActionPerformed(evt);
            }
        });
        add(txtGender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 194, -1));

        btnChangeImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChangeImage.setText("Change Image");
        btnChangeImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeImageActionPerformed(evt);
            }
        });
        add(btnChangeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 110, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("UPDATE EMPLOYEE PROFILE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private Boolean validationFailed(){
        lblError1.setForeground(new java.awt.Color(255, 0, 0));
        if ("Name Pattern is incorrect".equals(txtName1.getText()) || "Enter Name".equals(txtName1.getText()) ){
            txtName1.setForeground(new java.awt.Color(255, 0, 0));
            lblError1.setText("There is some error saving, Check red fields");
            return true;
        }
        if ("Age should be integer".equals(txtAge1.getText()) || "Enter Age".equals(txtAge1.getText()) ){
            txtAge1.setForeground(new java.awt.Color(255, 0, 0));
            lblError1.setText("There is some error saving, Check red fields");
            return true;
        }
        if ("Enter Team Information".equals(txtTeamInfo1.getText())){
            txtTeamInfo1.setText(""); 
        }
        if ("Enter Contact Number".equals(txtContactNum1.getText()) || "Enter 10 digit Number".equals(txtContactNum1.getText()) ){
            txtContactNum1.setForeground(new java.awt.Color(255, 0, 0));
            lblError1.setText("There is some error saving, check red fields");
            return true;
        }
        if ("Email is incorrect".equals(txtMailId1.getText()) || "Enter Email".equals(txtMailId1.getText()) ){
            txtMailId1.setForeground(new java.awt.Color(255, 0, 0));
            lblError1.setText("There is some error saving, check red fields");
            return true;
         }
       
        
        if ("Enter Position".equals(txtPosition1.getText())){
            txtPosition1.setText(""); 
        }
        
        if ("Enter Level".equals(txtLevel1.getText())){
            txtLevel1.setText(""); 
        }
 
        
        
        return false;
    }
    
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

    private void txtContactNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumActionPerformed

    private void txtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionActionPerformed

    private void txtMailId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailId1ActionPerformed

    private void txtAge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAge1ActionPerformed

    private void txtLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevel1ActionPerformed

    private void txtContactNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNum1ActionPerformed

    private void txtPosition1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosition1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosition1ActionPerformed

    private void txtSearchEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmpIdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        lblImageIcon1.setVisible(true);
        btnChangeImage.setVisible(true);
        int empID = Integer.parseInt(txtSearchEmpId.getText());
        //lblImageIcon.setVisible(true);
        Boolean notFound = true;
        ArrayList<EmployeeInfo> listEmployee = employeeHistory.getHistory();
        System.out.print(listEmployee);
        for (EmployeeInfo selectedemployeeInfo : listEmployee) {
            if(empID == selectedemployeeInfo.getEmpId()){
                notFound = false;
                employeeupdate = selectedemployeeInfo;
                txtName1.setText(selectedemployeeInfo.getName());
                txtEmpId1.setText(String.valueOf(selectedemployeeInfo.getEmpId()));
                txtAge1.setText(String.valueOf(selectedemployeeInfo.getAge()));
                txtGender1.setText(selectedemployeeInfo.getGender());
                txtStartDate1.setText(String.valueOf(selectedemployeeInfo.getStartDate()));
                txtLevel1.setText(selectedemployeeInfo.getLevel());
                txtTeamInfo1.setText(selectedemployeeInfo.getTeamInfo());
                txtPosition1.setText(selectedemployeeInfo.getPosTitle());
                txtContactNum1.setText(String.valueOf(selectedemployeeInfo.getContact()));
                txtMailId1.setText(selectedemployeeInfo.getMailId());
          
                ImageIcon ii = new ImageIcon(selectedemployeeInfo.getProfilePicture());
                selectedImagePath = selectedemployeeInfo.getProfilePicture();
                //Resize image
                Image image = ii.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
                lblImageIcon1.setIcon(new ImageIcon(image));
                
            }
        }
        if (notFound){                
                JOptionPane.showMessageDialog(this,"No Record selected to view");
            }     
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchEmpIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchEmpIdFocusGained
        // TODO add your handling code here:
        txtSearchEmpId.setText("");
    }//GEN-LAST:event_txtSearchEmpIdFocusGained

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        if (validationFailed()){
            return;
        }
        String name = txtName1.getText();
        int empId = Integer.parseInt(txtEmpId1.getText());
        int age = Integer.parseInt(txtAge1.getText());
        String level = txtLevel1.getText();
        String gender = txtGender1.getText();
        String teamInfo = txtTeamInfo1.getText();
        String position = txtPosition1.getText(); 
        Long contact = Long.parseLong(txtContactNum1.getText());
        String mailId= txtMailId1.getText(); 
        
         
        
        employeeHistory.updateEmployeeHistory(employeeupdate,
                name,age,gender,
                level,teamInfo,position,
                contact,mailId,selectedImagePath);

        JOptionPane.showMessageDialog(this,"Employee record updated !!");
       
        viewRefresh();                                    
    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtName1FocusLost
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z- ]{1,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtName1.getText());
        if(!match.matches()){
            txtName1.setText("Name Pattern is incorrect");
            txtName1.setForeground(new java.awt.Color(255, 0, 0));
        }
        
    }//GEN-LAST:event_txtName1FocusLost

    private void txtAge1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAge1FocusLost
        // TODO add your handling code here:
          try 
		{ 
                    Integer.parseInt(txtAge1.getText());  
		}  
		catch (NumberFormatException e)  
		{ 
                    txtAge1.setText("Age should be integer");
                    txtAge1.setForeground(new java.awt.Color(255, 0, 0)); 
		}
    }//GEN-LAST:event_txtAge1FocusLost

    private void txtContactNum1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactNum1FocusLost
        // TODO add your handling code here:
        String PATTERN1="^[0-9]{9,10}$";
       Pattern patt=Pattern.compile(PATTERN1);
       Matcher match=patt.matcher(txtContactNum1.getText().toString());
       if(!match.matches())
       {
           txtContactNum1.setText("Enter 10 digit Number");
           txtContactNum1.setForeground(new java.awt.Color(255, 0, 0));
       }
    }//GEN-LAST:event_txtContactNum1FocusLost

    private void txtMailId1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailId1FocusLost
        // TODO add your handling code here:
        String PATTERN1="^(.+)@(.+)$";
        Pattern patt=Pattern.compile(PATTERN1);
        Matcher match=patt.matcher(txtMailId1.getText());
        if(!match.matches())
        {
            txtMailId1.setText("Email is incorrect");
            txtMailId1.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_txtMailId1FocusLost

    private void txtGender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGender1ActionPerformed

    private void btnChangeImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeImageActionPerformed
        // TODO add your handling code here:

        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int ShowOpenDialogue = browseImageFile.showOpenDialog(null);
        File selectedImageFile = browseImageFile.getSelectedFile();
        selectedImagePath = selectedImageFile.getAbsolutePath();
        //lblImageIcon.setVisible(true);
        //Display image on jLablel1
        ImageIcon ii = new ImageIcon(selectedImagePath);
        //Resize image
        Image image = ii.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
        lblImageIcon1.setIcon(new ImageIcon(image));
        lblImageIcon1.setVisible(true);

    }//GEN-LAST:event_btnChangeImageActionPerformed
 
    
    public void viewRefresh(){
        txtName1.setText("");
        txtEmpId1.setText("");
        txtAge1.setText("");
        txtStartDate1.setText("");
        txtGender1.setText("");
        txtLevel1.setText("");
        txtTeamInfo1.setText("");
        txtPosition1.setText("");
        txtContactNum1.setText("");
        txtMailId1.setText("");
        lblImageIcon1.setVisible(false);
        lblImageIcon1.setIcon(null);
        lblError1.setText("");
        txtSearchEmpId.setText("");
        btnChangeImage.setVisible(false);
    }
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeImage;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAge1;
    private javax.swing.JLabel lblContactNum;
    private javax.swing.JLabel lblContactNum1;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblEmpId1;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblImageIcon;
    private javax.swing.JLabel lblImageIcon1;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblLevel1;
    private javax.swing.JLabel lblMailId;
    private javax.swing.JLabel lblMailId1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblPosition1;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblStartDate1;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTeamInfo1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge1;
    private javax.swing.JTextField txtContactNum;
    private javax.swing.JTextField txtContactNum1;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpId1;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtGender1;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtLevel1;
    private javax.swing.JTextField txtMailId;
    private javax.swing.JTextField txtMailId1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtPosition1;
    private javax.swing.JTextField txtSearchEmpId;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtStartDate1;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JTextField txtTeamInfo1;
    // End of variables declaration//GEN-END:variables

   
}
