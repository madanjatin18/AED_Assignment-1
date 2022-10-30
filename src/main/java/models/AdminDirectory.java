/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import models.Admins.AdminType;

/**
 *
 * @author madan
 */
public class AdminDirectory {
    ArrayList<Admins> adminlist ;
    
    public AdminDirectory (){
          
        adminlist = new ArrayList();

    }

    public Admins newAdmin(String name, int age, String email, String gender, String phoneNumber, City city, Community community, String username, String password, AdminType type) {

        Admins c = new Admins(name, age, email, gender, phoneNumber, city, community, username, password, type);
        adminlist.add(c);
        return c;
    }
    
    public ArrayList<Admins> getAdminsList() {

        return adminlist;
    }

    public Admins findAdmin(String username) {

        for (Admins c : adminlist) {

            if (c.getUsername().equals(username)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public Admins checkAdminCredentials(String username, String password, Admins.AdminType type) {
        
        for (Admins p : adminlist) {
            if (p.getUsername().equals(username) && p.getPassword().equals(password) && p.getAdminType().equals(type)) {
                return p;
            }
        }
        return null;
    }
    public void deleteAdmin(Admins admin) {
        adminlist.remove(admin);
    }
}
