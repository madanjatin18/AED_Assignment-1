/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.Random;


public class AdminDirectory {
  
    ArrayList<Admins> adminsList ;
    
    public AdminDirectory (){
          
        adminsList = new ArrayList();

    }

    public Admins newAdmins(String name, int age, String email, String gender, String phoneNumber, String username, String password) {
        
        Admins a = new Admins(name,age,email,gender,phoneNumber,username,password);
        adminsList.add(a);
        return a;
    }
    
    public ArrayList<Admins> getAdminsList() {

        return adminsList;
    }

    public Admins findAdminsByName(String name) {

        for (Admins c : adminsList) {

            if (c.isMatch(name)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public boolean isAdminsUsernameExist(String username) {
        for (Admins p : adminsList) {
            if (p.getUsername() == username) {
                return true;
            }
        }
        return false;
    }

    public void deleteAdmin (Admins selectedAdmins) {
        adminsList.remove(selectedAdmins);
    }
}
