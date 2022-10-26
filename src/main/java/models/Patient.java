package models;

import java.util.ArrayList;


public class Patient {
    
    private int patientID;
    private String issue;
    private ArrayList<Encounter> encounterList;
    private Person person;
    private House house;
    private Hospital hospital;
    
    public Patient (String issue, House house, Person person, int patientID, Hospital hospital){
        
        this.issue = issue;
        this.patientID = patientID;
        this.house = house;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
        if(this.person.getName().equals(name)) return true;
        return false;
    }
}
