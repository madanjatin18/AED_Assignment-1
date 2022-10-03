/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.employee.application;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author madan
 */
public class EmployeeHistory {
    
    private ArrayList<EmployeeInfo> history;
    
    public EmployeeHistory(){
        this.history = new ArrayList<EmployeeInfo>();
    }

    public ArrayList<EmployeeInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeInfo> history) {
        this.history = history;
    }
    
    public EmployeeInfo addNewEmployee() {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        history.add (employeeInfo);
        return employeeInfo;
        
    }

    public void deleteEmployeeHistory(EmployeeInfo selectedemployeeInfo) {
        history.remove(selectedemployeeInfo);
        
    }
    public void updateEmployeeHistory(EmployeeInfo selectedemployeeInfo, 
                                        String name, int age,
                                        String gender, String level, 
                                        String teamInfo, String posTitle, 
                                        Long contact, String mailId, String Imagepath){
        selectedemployeeInfo.callSetter(name,age,gender,
                                        level, teamInfo,
                                        posTitle,contact,mailId, Imagepath);
                    
    
    }
 
    }
        
