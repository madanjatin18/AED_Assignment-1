/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Random;
import view.MainJFrame;

/**
 *
 * @author madan
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctorList ;
    
    public DoctorDirectory (){
          
        doctorList = new ArrayList();

    }

    public Doctor newDoctor(String about, Hospital hospital, String name, int age, String email, String gender, String phoneNumber, City city, Community community, String username, String password) {
        
        int doctorID = generateRandomId();
        while(isDoctorIdExist(doctorID)) {
            doctorID = generateRandomId();
        }

        Doctor d = new Doctor(about, hospital, doctorID, name, age, email, gender, phoneNumber, city, community, username, password);
        doctorList.add(d);
        hospital.addDoctor(d);
        return d;
    }
    
    public ArrayList<Doctor> getDoctorList() {

        return doctorList;
    }

    public Doctor findDoctorByName(String name) {

        for (Doctor c : doctorList) {

            if (c.isMatch(name)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public Doctor checkDoctorCredentials(String username, String password) {
        for (Doctor d : doctorList) {
            if (d.getUsername().equals(username) && d.getPassword().equals(password)) {
                return d;
            }
        }
        return null;
    }
    
    private int generateRandomId() {
        return new Random().nextInt(900000) + 100000;
    }
    
    public boolean isDoctorIdExist(int id) {
        for (Doctor p : doctorList) {
            if (p.getDoctorID()== id) {
                return true;
            }
        }
        return false;
    }
    
    public void deleteDoctor(Doctor d) {
        for (Encounter e: d.getEncounterList()) {
            e.getPatient().getEncounterList().remove(e);
            MainJFrame.encounterDirectory.getEncouterList().remove(e);
        }
        doctorList.remove(d);
        d.getHospital().getDoctorList().remove(d);
    }
}
