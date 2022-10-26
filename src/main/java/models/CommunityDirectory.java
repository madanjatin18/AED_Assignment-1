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
public class CommunityDirectory {
    ArrayList<Community> communityList ;
    
    public CommunityDirectory (){
          
       communityList = new ArrayList();

    }
      
    public Community newCommunity(String name, City city) {

        Community c = new Community(name, city);
        communityList.add(c);
        return c;
    }
    
    public ArrayList<Community> getDirectory() {

        return communityList;
    }
    
    public ArrayList<Community> searchCommunitiesByCityObject(City city)
    {
        ArrayList<Community> searchCommunityDirectory = new ArrayList();
        for(Community community: communityList)
        {
            if(community.getCity().getName().toLowerCase().startsWith(city.getName().toLowerCase()))
            {
                searchCommunityDirectory.add(community);
            }
        }
        return searchCommunityDirectory;
    }
    
    public boolean isCommunityByCityExist(City city, String community_name)
    {
        for(Community community: communityList)
        {
            if(community.getCity().getName().toLowerCase().startsWith(city.getName().toLowerCase()) && community.getName().toLowerCase().equals(community_name.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean isOtherCommunityByCityExist(City city, String community_name, String present_name)
    {
        for(Community community: communityList)
        {
            if((!community.getCity().getName().toLowerCase().startsWith(city.getName().toLowerCase()) || !community.getName().toLowerCase().equals(community_name.toLowerCase())) ||
                    community.getName().toLowerCase().equals(present_name))
            {
            } else {
                return true;
            }
        }
        return false;
    }
    
    public Community getCommunity(String cityName, String communityName) {
        for(Community community: communityList)
        {
            if (community.getCity().getName().toLowerCase().startsWith(cityName.toLowerCase()) || community.getName().toLowerCase().equals(communityName.toLowerCase()))
            {
                return community;
            }
        }
        return null;
    }
    
    
}
