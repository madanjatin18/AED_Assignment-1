/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author vaibhav
 */
public class Doctor {
    private String about;
    private ArrayList<Patient> patientList;
    private ArrayList<Encounter> encounterList;
    private Hospital hospital;
    private Person person;
    
    public Doctor (String about, Hospital hospital, Person person){
        
        this.about = about;
        this.hospital = hospital;
        this.person = person;
        patientList = new  ArrayList();
        encounterList = new  ArrayList();
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public boolean isMatch(String name){
        if(this.person.getName().equals(name)) return true;
        return false;
    }
}
