/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resources;

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

/**
 *
 * @author madan
 */
public class CreateDefaultData {
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
        Hospital f = MainJFrame.hospitalDirectory.newHospital("kgf", "At home", 452003, "ok sir", boston, jp);
        
        // create person
        Person p1 = MainJFrame.personDirectory.newPerson("vaibhav", 24, "vaibhav@gmail.com", "Male", "7878787878", boston, jp, "vbhv", "vbhv10");
        Person p2 = MainJFrame.personDirectory.newPerson("megha", 25, "megha@gmail.com", "Female", "7878743878", springField, gb, "megha", "vbhv10");
        Person p3 = MainJFrame.personDirectory.newPerson("nalin", 26, "nalin@gmail.com", "Male", "9878787878", worcester, vn, "nalin", "vbhv10");
        Person p4 = MainJFrame.personDirectory.newPerson("amit", 27, "amit@gmail.com", "Male", "2378787878", cambridge, sn, "amit", "vbhv10");
        Person p5 = MainJFrame.personDirectory.newPerson("adi", 24, "adi@gmail.com", "Male", "3578787878", brockton, r, "adi", "vbhv10");
        Person p6 = MainJFrame.personDirectory.newPerson("avi", 24, "avi@gmail.com", "Male", "7878787878", boston, jp, "avi", "vbhv10");
        Person p7 = MainJFrame.personDirectory.newPerson("ankit", 24, "ankit@gmail.com", "Male", "7878787878", worcester, rn, "ankit", "vbhv10");
        Person p8 = MainJFrame.personDirectory.newPerson("anki", 29, "anki@gmail.com", "Male", "9878787878", lowell, ai, "anki", "vbhv10");
        Person p9 = MainJFrame.personDirectory.newPerson("mahi", 24, "mahi@gmail.com", "Female", "9878783478", boston, sb, "mahi", "vbhv10");
        Person p10 = MainJFrame.personDirectory.newPerson("sayoni", 24, "sayoni@gmail.com", "Female", "2547878787", lowell, mr, "sayoni", "vbhv10");
        
        // create doctor
        Doctor d1 = MainJFrame.doctorDirectory.newDoctor("gynic", a, "vaibhav", 24, "vaibhav@gmail.com", "Male", "7878787878", boston, jp, "vbhv", "vbhv10");
        Doctor d2 = MainJFrame.doctorDirectory.newDoctor("med", b, "megha", 25, "megha@gmail.com", "Female", "7878743878", springField, gb, "megha", "vbhv10");
        Doctor d3 = MainJFrame.doctorDirectory.newDoctor("clinic", c, "nalin", 26, "nalin@gmail.com", "Male", "9878787878", worcester, vn, "nalin", "vbhv10");
        Doctor d4 = MainJFrame.doctorDirectory.newDoctor("skin",d, "amit", 27, "amit@gmail.com", "Male", "2378787878", cambridge, sn, "amit", "vbhv10");
        Doctor d5 = MainJFrame.doctorDirectory.newDoctor("obs", e, "adi", 24, "adi@gmail.com", "Male", "3578787878", brockton, r, "adi", "vbhv10");
        Doctor d6 = MainJFrame.doctorDirectory.newDoctor("bone", f, "karan", 24, "karan@gmail.com", "Male", "3578745878", boston, jp, "karan", "vbhv10");
        
        
        // House
        House h1 = cn.addHouse("515 kalani nagar", "aerodrome road");
        House h2 = rw.addHouse("43 C vijay nagar", "aerodrome road");
        House h3 = cn.addHouse("123 kalani nagar", "aerodrome road");
        
        // Create patient
        Patient pa1 = MainJFrame.patientDirectory.newPatient("Headache", h1, a, "avi", 24, "avi@gmail.com", "Male", "7878787878", boston, jp, "avi", "vbhv10");
        Patient pa2 = MainJFrame.patientDirectory.newPatient("Accident", h2, b, "ankit", 24, "ankit@gmail.com", "Male", "7878787878", worcester, rn, "ankit", "vbhv10");
        Patient pa3 = MainJFrame.patientDirectory.newPatient("Regular checkup", h3, c, "anki", 29, "anki@gmail.com", "Male", "9878787878", lowell, ai, "anki", "vbhv10");
        Patient pa4 = MainJFrame.patientDirectory.newPatient("heart break", h1, d, "mahi", 24, "mahi@gmail.com", "Female", "9878783478", boston, sb, "mahi", "vbhv10");
        Patient pa5 = MainJFrame.patientDirectory.newPatient("Heark attack", h2, e, "sayoni", 24, "sayoni@gmail.com", "Female", "2547878787", lowell, mr, "sayoni", "vbhv10");
        
        // Create Admins
        Admins ad1 = MainJFrame.adminDirectory.newAdmin("vaibhav", 24, "vaibhav@gmail.com", "Male", "7878787878", boston, jp, "vbhv", "vbhv10", Admins.AdminType.SYSTEM);
        Admins ad2 = MainJFrame.adminDirectory.newAdmin("megha", 25, "megha@gmail.com", "Female", "7878743878", springField, gb, "megha", "vbhv10", Admins.AdminType.COMMUNITY);
        Admins ad3 = MainJFrame.adminDirectory.newAdmin("nalin", 26, "nalin@gmail.com", "Male", "9878787878", worcester, vn, "nalin", "vbhv10", Admins.AdminType.HOSPITAL);
        
        Encounter e1 = MainJFrame.encounterDirectory.newEncounter(new Date(1998, 10, 10), d1, a, pa1);
    }
}
