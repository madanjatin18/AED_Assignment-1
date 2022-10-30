/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author madan
 */
public class Admins extends Person {

    
    
    public enum AdminType {
    SYSTEM, COMMUNITY, HOSPITAL 
    }
    
    private AdminType adminType;
    
    public Admins(String name, int age, String email, String gender, String phoneNumber, City city, Community community, String username, String password, AdminType type) {
        super(name, age, email, gender, phoneNumber, city, community, username, password);
        this.adminType = type;
    }

    public AdminType getAdminType() {
        return adminType;
    }

    public void setAdminType(AdminType adminType) {
        this.adminType = adminType;
    }
    
}
