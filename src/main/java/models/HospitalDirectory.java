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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalList;
    
    public HospitalDirectory (){
          
       hospitalList = new ArrayList();

    }
      
    public Hospital newHospital(String name, String about, int zipCode, String address, City city, Community community) {

        Hospital c = new Hospital(name, about, zipCode, address, city, community);
        hospitalList.add(c);
        return c;
    }
    
    public ArrayList<Hospital> getHospitalList() {

        return hospitalList;
    }
    
    public boolean isHospitalExistInCity(String name, City city) {
        for (Hospital h : hospitalList) {
            if (h.getCity().equals(city)) {
                if (h.getName().startsWith(name)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public Hospital getHospitalObject(String name, City city, Community community) {
        for (Hospital h : hospitalList) {
            if (h.getCity().equals(city) && h.getCommunity().equals(community)) {
                if (h.getName().equals(name)) {
                    return h;
                }
            }
        }
        
        return null;
    }
    
    public ArrayList<Hospital> searchHospitalByCommunity(Community community)
    {
        ArrayList<Hospital> searchHospitalDirectory = new ArrayList();
        for(Hospital hospital: hospitalList)
        {
            if(hospital.getCommunity().equals(community))
            {
                searchHospitalDirectory.add(hospital);
            
        }}
        return searchHospitalDirectory;
    }
}
