package com.assignment2.hospital;

import java.util.ArrayList;


public class Patient extends Person{
    
    private String patientName;
    private int hospitalId;
    private int docId;
    private String vitalSigns;
    private String bloodGroup;

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(String vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    
    public void callSetter(String patientName, int hospitalId, int docId, String vitalSigns, String bloodGroup ){
        
        setPatientName(patientName);
        setHospitalId(hospitalId);
        setDocId(docId);
        setVitalSigns(vitalSigns);
        setBloodGroup(bloodGroup);
        

    }
}
