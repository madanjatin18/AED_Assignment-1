/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;


public class EncounterDirectory {
    ArrayList<Encounter> encounterList ;
    
    public EncounterDirectory (){
          
        encounterList = new ArrayList();

    }

    public Encounter newEncounter(LocalDateTime date, Doctor doctor, Hospital hospital,Patient p) {

        Encounter d = new Encounter(date, doctor, hospital,p);
        encounterList.add(d);
        return d;
    }
    
    public ArrayList<Encounter> getEncouterList() {

        return encounterList;
    }

    public void deleteEncounter(Encounter selectedEncounter) {
        encounterList.remove(selectedEncounter);
    }
}
