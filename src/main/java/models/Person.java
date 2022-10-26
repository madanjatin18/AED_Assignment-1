/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author vaibhav
 */
public class Person {
    private String name;
    private int age;
    private String email;
    private String gender;
    private String phoneNumber;
    private City city;
    private Community community;
    private String username;
    private String password;

    public Person(String name, int age, String email, String gender, String phoneNumber, City city, Community community, String username, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.community = community;
        this.username = username;
        this.password = password;
    }
    
    public boolean isMatch(String name){
        if(getName().equals(name)) return true;
        return false;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
}
