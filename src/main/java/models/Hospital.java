/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author vaibhav
 */
public class Hospital {
    private String name;
    private String about;
    private int zipCode;
    private String address;
    private City city;
    private Community community;
    private ArrayList<Doctor> doctorList;
    private ArrayList<Patient> patientList;
    
    
    public Hospital(String name, String about, int zipCode, String address, City city, Community community) {
        this.name = name;
        this.about = about;
        this.zipCode = zipCode;
        this.address = address;
        this.city = city;
        this.community = community;
        doctorList = new ArrayList();
        patientList = new ArrayList();
    }
    
    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }
    
    public void addPatient(Patient patient) {
        patientList.add(patient);
    }
    
    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Doctor getDoctorByName(String doctor) {
        for (Doctor d: doctorList) {
            if (d.getPerson().getName().equals(doctor)) {
                return d;
            }
        }
        
        return null;
    }
    
    public Patient getPatientByName(String patient) {
        for (Patient d: patientList) {
            if (d.getPerson().getName().equals(patient)) {
                return d;
            }
        }
        
        return null;
    }
}
