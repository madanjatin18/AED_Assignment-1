/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.assignment2.hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author madan
 */
public class HospitalData {
    
    private String hospName;
    private Integer locId ;
    private Integer hospId;
    
   Map<Integer, String> hospitalInfo;
   Map<Integer, Integer> hospitalLocInfo;
   
    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public Integer getHospId() {
        return hospId;
    }

    public void setHospId(Integer hospId) {
        this.hospId = hospId;
    }


    public HospitalData() {
       hospitalInfo = new HashMap<>();
       hospitalInfo.put(01,"ABC");
       hospitalInfo.put(02,"XYZ");
       hospitalInfo.put(03,"QWER");
       
       hospitalLocInfo = new HashMap<>();
       hospitalLocInfo.put(01,11);
       hospitalLocInfo.put(02,12);
       hospitalLocInfo.put(03,12);
    }

    public Map<Integer, String> getHospitalInfo() {
        return hospitalInfo;
    }

    public Map<Integer, Integer> getHospitalLocInfo() {
        return hospitalLocInfo;
    }
  
}
