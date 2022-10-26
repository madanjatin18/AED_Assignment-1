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
public class CityDirectory {
    
    ArrayList<City> citylist ;
    
    public CityDirectory (){
          
        citylist = new ArrayList();

    }

    public City newCity(String name) {

        City c = new City(name);
        citylist.add(c);
        return c;
    }
    
    public ArrayList<City> getCityList() {

        return citylist;
    }

    public City findCity(String name) {

        for (City c : citylist) {

            if (c.isMatch(name)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
