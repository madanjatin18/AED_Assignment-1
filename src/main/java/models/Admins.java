/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


public class Admins {
    
    public enum AdminType {
    SYSTEM, COMMUNITY, HOSPITAL 
    }
    
    private Person person;
    private AdminType adminType;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public AdminType getAdminType() {
        return adminType;
    }

    public void setAdminType(AdminType adminType) {
        this.adminType = adminType;
    }
    
}
