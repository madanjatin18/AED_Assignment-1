package com.assignment2.hospital;

import java.util.ArrayList;


public class PatientData {
    private ArrayList<Patient> history;
    
    public PatientData(){
        this.history = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Patient> history) {
        this.history = history;
    }
    
    public Patient addNewPatient() {
        Patient patient = new Patient();
        history.add (patient);
        return patient;
        
    }

    public void deletePatientData(Patient selectedpatient) {
        history.remove(selectedpatient);
        
    }
    public void updatePatientData(Patient selectedpatient, 
                            String patientName, int hospitalId, int docId, 
                            String vitalSigns, String bloodGroup){
        selectedpatient.callSetter(patientName,hospitalId, docId, vitalSigns, bloodGroup);
                    
    }
 
}
