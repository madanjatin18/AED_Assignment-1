/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author madan
 */
public class EncounterDirectory {
    ArrayList<Encounter> encounterList ;
    
    public EncounterDirectory (){
          
        encounterList = new ArrayList();

    }

    public Encounter newEncounter(Date date, Doctor doctor, Hospital hospital, Patient patient) {
        
        int encounterId = generateRandomId();
        while(isEncounterIdExist(encounterId)) {
            encounterId = generateRandomId();
        }
        
        Encounter d = new Encounter(date, doctor, hospital, patient, encounterId);
        doctor.setEncounter(d);
        patient.setEncounter(d);
        encounterList.add(d);
        return d;
    }
    
    public boolean isEncounterIdExist(int id) {
        for (Encounter p : encounterList) {
            if (p.getEncounterID() == id) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Encounter> getEncouterList() {

        return encounterList;
    }
    
    private int generateRandomId() {
        return new Random().nextInt(900000) + 100000;
    }
}
