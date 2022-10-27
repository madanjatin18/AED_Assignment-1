package com.assignment2.hospital;

import java.util.ArrayList;


public class DoctorData {
    
    private ArrayList<Doctor> history;
    
    public DoctorData(){
        this.history = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Doctor> history) {
        this.history = history;
    }
    
    public Doctor addNewDoctor() {
        Doctor doctor = new Doctor();
        history.add (doctor);
        return doctor;
        
    }

    public void deleteDoctorData(Doctor selecteddoctor) {
        history.remove(selecteddoctor);
        
    }
    public void updateDoctorData(Doctor selecteddoctor, 
                            String docName, int docId, int age, 
                            String gender, String address, String city, String state, int pinCode,
                            String qualifications, String bloodGroup, Long contact){
        selecteddoctor.callSetter(docName,docId, age, gender, address, 
                                        city, state, pinCode, qualifications, bloodGroup, contact);
                    
    }
 
}
