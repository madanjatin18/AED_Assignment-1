package com.assignment2.hospital;

import java.util.ArrayList;
/**
 *
 * @author madan
 */
public class Person {
    
    private String personName;
    private int age;
    private String gender;
    private String address;
    private String city;
    private String state;
    private int pinCode;
    private Long contact;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
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

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }
    
public void callSetter(String personName, int age, String gender, String address, String city, String state, int pinCode, Long contact){
        
        setPersonName(personName);
        setAge(age);
        setGender(gender);
        setAddress(address);
        setCity(city);
        setState(state);
        setPinCode(pinCode);
        setContact(contact);

    }

}
