package com.assignment2.hospital;

import java.util.ArrayList;

public class Doctor {
    
    private String docName;
    private int docId;
    private int age;
    private String gender;
    private String address;
    private String city;
    private String state;
    private int pinCode;
    private String qualifications;
    private String bloodGroup;
    private Long contact;

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }
    
    public void callSetter(String docName, int docId, int age, 
                            String gender, String address,String city, String state, int pinCode, 
                            String qualifications, String bloodGroup, 
                            Long contact){
        setDocName(docName);
        setDocId(docId);
        setAge(age);
        setGender(gender);
        setAddress(address);
        setCity(city);
        setState(state);
        setPinCode(pinCode);
        setQualifications(qualifications);
        setBloodGroup(bloodGroup);
        setContact(contact);
    }
    
}
    