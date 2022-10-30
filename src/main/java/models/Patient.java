package models;

import java.util.ArrayList;

/**
 *
 * @author madan
 */
public class Patient extends Person {
    
    private int patientID;
    private String issue;
    private ArrayList<Encounter> encounterList;
    private House house;
    private Hospital hospital;
    
    public Patient (String issue, House house, int patientID, Hospital hospital, String name, int age, String email, String gender, String phoneNumber, City city, Community community, String username, String password){
        super( name,  age,  email,  gender,  phoneNumber,  city,  community,  username,  password);
        this.issue = issue;
        this.patientID = patientID;
        this.house = house;
        this.hospital = hospital;
        
        encounterList = new  ArrayList();
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounter(Encounter encounter) {
        this.encounterList.add(encounter);
    }
    
    
    public int getPatientID() {
        return patientID;
    }
    
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    public boolean isMatch(String name){
        if(this.getName().equals(name)) return true;
        return false;
    }
}
