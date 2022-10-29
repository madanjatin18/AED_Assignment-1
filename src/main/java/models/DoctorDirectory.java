/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;


public class DoctorDirectory {
    private ArrayList<Doctor> doctorList ;
    
    
    public DoctorDirectory (){
          
        doctorList = new ArrayList();

    }

    public Doctor newDoctor(String about, Hospital hospital, Person person) {

        Doctor d = new Doctor(about, hospital, person);
        doctorList.add(d);
        hospital.addDoctor(d);
        return d;
    }
    
    public ArrayList<Doctor> getDoctorList() {

        return doctorList;
    }
    public Doctor getDoctorObject(String name) {
        for (Doctor d : doctorList) {
            if (d.getPerson().getName().equals(name)) {
                    return d;
                }
            }  
        return null;
    }
    

    public Doctor findDoctorByName(String name) {

        for (Doctor c : doctorList) {

            if (c.isMatch(name)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
         }

    public void deleteHospital(Doctor selectedDoctor) {
        doctorList.remove(selectedDoctor);
    }
}
