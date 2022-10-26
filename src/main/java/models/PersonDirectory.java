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
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory (){
          
        personList = new ArrayList();

    }

    public Person newPerson(String name, int age, String email, String gender, String phoneNumber, City city, Community community, String username, String password) {

        Person c = new Person(name, age, email, gender, phoneNumber, city, community, username, password);
        personList.add(c);
        return c;
    }
    
    public ArrayList<Person> getPersonList() {

        return personList;
    }

    public Person findPerson(String email) {

        for (Person c : personList) {

            if (c.isMatch(email)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public boolean isPersonByEmailExist(String email) {

        for (Person c : personList) {

            if (c.getEmail().equals(email)) {
                return true;
            }
        }
            return false;
         }
    
    public boolean isPersonByUsernameExist(String username) {
        for (Person c : personList) {

            if (c.getUsername().equals(username)) {
                return true;
            }
        }
            return false;
         
    }
}
