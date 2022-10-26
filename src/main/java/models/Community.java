/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;


public class Community {
    String name;
    City city;
    ArrayList<House> house ;
    
    public Community(String name, City city) {
        this.name = name;
        this.city = city;
        house = new ArrayList();

    }
    
    public House addHouse(String a1, String a2) {
        House h = new House(a1, a2);
        house.add(h); 
        return h;
    }
    
    public ArrayList<House> getHouseList() {
       return house; 
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public City getCity() {
        return city;
    }
    
    public Boolean isAddressExist(String addressLine1, String addressLine2) {
        String fullAddress = addressLine1 + addressLine2;
        
        for (House h: house) {
            
            if (h.checkAddress().startsWith(fullAddress)) {
                return true;
            }
        }
        
        return false;
    }
    
    public House getHouseObject(String addressLine1, String addressLine2) {
        String fullAddress = addressLine1 + addressLine2;
        
        for (House h: house) {
            
            if (h.checkAddress().startsWith(fullAddress)) {
                return h;
            }
        }
        
        return null;
    }
    
//    public 
}
