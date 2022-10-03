package com.employee.application;


import java.util.ArrayList;
import java.util.Date;

public class EmployeeInfo {
    
    private String name;
    private int empId;
    private int age;
    private String gender;
    private Date startDate;
    private String level;
    private String teamInfo;
    private String posTitle;
    private Long contact;
    private String mailId;
    private String profilePicture;

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getPosTitle() {
        return posTitle;
    }

    public void setPosTitle(String posTitle) {
        this.posTitle = posTitle;
    }
    
    public void callSetter(String name, int age, 
                            String gender, String level, 
                            String teamInfo, String posTitle, 
                            Long contact, String mailId, String Imagepath){
        setName(name);
        setAge(age);
        setGender(gender);
        setLevel(level);
        setTeamInfo(teamInfo);
        setPosTitle(posTitle);
        setContact(contact);
        setMailId(mailId);
        setProfilePicture(Imagepath);
    }

}
