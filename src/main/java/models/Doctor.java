/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author madan
 */
public class Doctor extends Person {
    private String about;
    private int doctorID;
    private ArrayList<Patient> patientList;
    private ArrayList<Encounter> encounterList;
    private Hospital hospital;

    public Doctor(String about, Hospital hospital, int doctorID, String name, int age, String email, String gender, String phoneNumber, City city, Community community, String username, String password) {
        super(name, age, email, gender, phoneNumber, city, community, username, password);
        this.about = about;
        this.hospital = hospital;
        this.doctorID = doctorID;
        patientList = new  ArrayList();
        encounterList = new  ArrayList();
    }
    
//    public Doctor (String about, Hospital hospital, int doctorID, ){
//        
        
//    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounter(Encounter encounter) {
        this.encounterList.add(encounter);
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public boolean isMatch(String name){
        if(this.getName().equals(name)) return true;
        return false;
    }
}
