package models;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Encounter {
    private Date date;
    private Doctor doctor;
    private Hospital hospital;
    private VitalSigns vitalSigns; 
    private Patient patient;
    private ArrayList<Doctor> doctorList;
    private ArrayList<Patient> patientList; 
    
    public Encounter(Date date, Doctor doctor, Hospital hospital,Patient patient) {
        this.date = date;
        this.doctor = doctor;
        this.hospital = hospital;
        this.patient = patient;
        this.doctorList = hospital.getDoctorList();
    }
    
    public Doctor getDoctorByUsername(String username) {
        for (Doctor d: doctorList) {
            if (d.getPerson().getUsername().equals(username)) {
                return d;
            }
        }
        
        return null;
    }
    
    public Patient getPatientByUsername(String username) {
        for (Patient p: patientList) {
            if (p.getPerson().getUsername().equals(username)) {
                return p;
            }
        }
        
        return null;
    }
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
}
