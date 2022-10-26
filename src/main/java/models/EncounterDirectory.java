/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vaibhav
 */
public class EncounterDirectory {
    ArrayList<Encounter> encounterList ;
    
    public EncounterDirectory (){
          
        encounterList = new ArrayList();

    }

    public Encounter newEncounter(Date date, Doctor doctor, Hospital hospital) {

        Encounter d = new Encounter(date, doctor, hospital);
        encounterList.add(d);
        return d;
    }
    
    public ArrayList<Encounter> getEncouterList() {

        return encounterList;
    }
}
