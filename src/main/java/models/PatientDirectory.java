/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vaibhav
 */
public class PatientDirectory {
    ArrayList<Patient> patientList ;
    
    public PatientDirectory (){
          
        patientList = new ArrayList();

    }

    public Patient newPatient(String issue, House house, Person person, Hospital hospital) {

        int patientId = generateRandomId();
        while(isPatientIdExist(patientId)) {
            patientId = generateRandomId();
        }
        
        
        Patient p = new Patient(issue, house, person, patientId, hospital);
        patientList.add(p);
        hospital.addPatient(p);
        return p;
    }
    
    public ArrayList<Patient> getPatientList() {

        return patientList;
    }

    public Patient findPatientByName(String name) {

        for (Patient c : patientList) {

            if (c.isMatch(name)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public boolean isPatientIdExist(int id) {
        for (Patient p : patientList) {
            if (p.getPatientID() == id) {
                return true;
            }
        }
        return false;
    }
    
    public Patient getPatientId(int id) {
        for (Patient p : patientList) {
            if (p.getPatientID() == id) {
                return p;
            }
        }
        return null;
    }
    
    private int generateRandomId() {
        return new Random().nextInt(900000) + 100000;
    }
}
