/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import models.Admins;
import models.City;
import models.Community;
import models.Doctor;
import models.Encounter;
import models.Hospital;
import models.House;
import models.Patient;
import models.Person;
import view.MainJFrame;


public class CreateDefaultData {
    
    static Date datenow;
    public static void createData() {
        
        // create city
        City boston = MainJFrame.cityDirectory.newCity("Boston");
        City worcester = MainJFrame.cityDirectory.newCity("Worcester");
        City springField = MainJFrame.cityDirectory.newCity("Springfield");
        City lowell = MainJFrame.cityDirectory.newCity("Lowell");
        City cambridge = MainJFrame.cityDirectory.newCity("Cambridge");
        City brockton = MainJFrame.cityDirectory.newCity("Brockton");
        
        // create community
        Community sb = MainJFrame.communityDirectory.newCommunity("South Boston", boston);
        Community jp = MainJFrame.communityDirectory.newCommunity("Jamaica Plain", boston);
        Community rn = MainJFrame.communityDirectory.newCommunity("Ranipura", worcester);
        Community vn = MainJFrame.communityDirectory.newCommunity("Vijay Nagar", worcester);
        Community gb = MainJFrame.communityDirectory.newCommunity("Geeta Bhawan", springField);
        Community ai = MainJFrame.communityDirectory.newCommunity("Airport", lowell);
        Community mr = MainJFrame.communityDirectory.newCommunity("MR10", lowell);
        Community cn = MainJFrame.communityDirectory.newCommunity("Chandan nagar", lowell);
        Community rw = MainJFrame.communityDirectory.newCommunity("Rajwada", cambridge);
        Community sn = MainJFrame.communityDirectory.newCommunity("Sudama nagar", cambridge);
        Community r = MainJFrame.communityDirectory.newCommunity("Rau", brockton);
        
        // create hospital
        Hospital a = MainJFrame.hospitalDirectory.newHospital("apple", "At bhawarkua", 452005, "637 sd", boston, sb);
        Hospital b = MainJFrame.hospitalDirectory.newHospital("gmc", "At bhopal", 452001, "637 sd", worcester, rn);
        Hospital c = MainJFrame.hospitalDirectory.newHospital("mgm", "At indore", 452002, "637 sd", springField, gb);
        Hospital d = MainJFrame.hospitalDirectory.newHospital("gurukripa", "At high court", 452003, "637 sd", lowell, mr);
        Hospital e = MainJFrame.hospitalDirectory.newHospital("mengo", "At nowhere", 452004, "637 sd", lowell, ai);
        
        // create person
        Person p1 = MainJFrame.personDirectory.newPerson("jatin", 24, "jatin@gmail.com", "Male", "7878787878", boston, jp, "jatin", "madan18");
        Person p2 = MainJFrame.personDirectory.newPerson("heer", 25, "heer@gmail.com", "Female", "7878743878", springField, gb, "megha", "madan18");
        Person p3 = MainJFrame.personDirectory.newPerson("adnan", 26, "adnan@gmail.com", "Male", "9878787878", worcester, vn, "nalin", "madan18");
        Person p4 = MainJFrame.personDirectory.newPerson("amit", 27, "amit@gmail.com", "Male", "2378787878", cambridge, sn, "amit", "madan18");
        Person p5 = MainJFrame.personDirectory.newPerson("adi", 24, "adi@gmail.com", "Male", "3578787878", brockton, r, "adi", "madan18");
        Person p6 = MainJFrame.personDirectory.newPerson("avi", 24, "avi@gmail.com", "Male", "7878787878", boston, jp, "avi", "madan18");
        Person p7 = MainJFrame.personDirectory.newPerson("ankit", 24, "ankit@gmail.com", "Male", "7878787878", worcester, rn, "ankit", "madan18");
        Person p8 = MainJFrame.personDirectory.newPerson("anki", 29, "anki@gmail.com", "Male", "9878787878", lowell, ai, "anki", "madan18");
        Person p9 = MainJFrame.personDirectory.newPerson("mahi", 24, "mahi@gmail.com", "Female", "9878783478", boston, sb, "mahi", "madan18");
        Person p10 = MainJFrame.personDirectory.newPerson("sayoni", 24, "sayoni@gmail.com", "Female", "2547878787", lowell, mr, "sayoni", "madan18");
        
        // create doctor
        Doctor d1 = MainJFrame.doctorDirectory.newDoctor("gynic", a, p1);
        Doctor d2 = MainJFrame.doctorDirectory.newDoctor("med", b, p2);
        Doctor d3 = MainJFrame.doctorDirectory.newDoctor("clinic", c, p3);
        Doctor d4 = MainJFrame.doctorDirectory.newDoctor("skin",d, p4);
        Doctor d5 = MainJFrame.doctorDirectory.newDoctor("obs", e, p5);
        
        // House
        House h1 = cn.addHouse("515 kalani nagar", "aerodrome road");
        House h2 = rw.addHouse("43 C vijay nagar", "aerodrome road");
        House h3 = cn.addHouse("123 kalani nagar", "aerodrome road");
        
        // Create patient
        Patient pa1 = MainJFrame.patientDirectory.newPatient("Headache", h1, p6, a, d1);
        Patient pa2 = MainJFrame.patientDirectory.newPatient("Accident", h2, p7, b,d1);
        Patient pa3 = MainJFrame.patientDirectory.newPatient("Regular checkup", h3, p8, c,d2);
        Patient pa4 = MainJFrame.patientDirectory.newPatient("heart break", h1, p9, d,d3);
        Patient pa5 = MainJFrame.patientDirectory.newPatient("Heark attack", h2, p10, e, d3);
        
        //person main
        Person pdefault = MainJFrame.personDirectory.newPerson("person", 24, "peron@gmail.com", "Male", "2547878787", lowell, mr, "default", "123456");
       
        //doctor main
        Doctor doctor = MainJFrame.doctorDirectory.newDoctor("obs", e, pdefault);
        
        //pateint main
        Patient pat1 = MainJFrame.patientDirectory.newPatient("Headache", h1, p1, e, doctor);
       //Encounter);     
       SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm");
       Date date = new Date(System.currentTimeMillis());
       String dateTimeString = formatter.format(date);
       try 
        { 
           datenow = formatter.parse(dateTimeString);
        }  
        catch (ParseException e12){}  
       //Encounter e1 = MainJFrame.encounterDirectory.newEncounter(datenow,doctor,e,pat1);
       
       
       //Admins
       Admins system = MainJFrame.adminDirectory.newAdmins("Jatin", 24, "jatin@gmail.com", "Male", "7878787878", "system", "123456");
       
       //Person pdefault = MainJFrame.personDirectory.newPerson("person", 24, "peron@gmail.com", "Male", "2547878787", lowell, mr, "default", "123456");
       //Doctor doctor = MainJFrame.doctorDirectory.newDoctor("obs", e, pdefault);
    }
}
