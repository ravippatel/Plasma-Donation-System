/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_People;
import java.util.Date;
/**
 *
 * @author RST
 */
public class Donor {
    
    // Donor Attributes
    private String ID;
    private String name;
    private Date dateOfBirth;
    private int age;
    private String gender;
    private String blood_Group;
    private Date COVID_Infected_Date;
    private Date COVID_Cured_Date;
    private String street_Address;
    private String city;
    private String state;
    private int pincode;
    private String mobile;
    private String email;
    private String recent_status;
    private Date previous_Donation_Date;
    private boolean lab_Confirmation;
    private boolean symptoms;       
    private boolean last_Day_Symptoms;
    private boolean follow_Up_Test;  
    private String img_Path;
    private byte[] dP;

    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    public String getImg_Path() {
        return img_Path;
    }

    public void setImg_Path(String img_Path) {
        this.img_Path = img_Path;
    }

    // Getter Setter for all variables
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getBlood_Group() {
        return blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        this.blood_Group = blood_Group;
    }

    public Date getCOVID_Infected_Date() {
        return COVID_Infected_Date;
    }

    public void setCOVID_Infected_Date(Date COVID_Infected_Date) {
        this.COVID_Infected_Date = COVID_Infected_Date;
    }

    public Date getCOVID_Cured_Date() {
        return COVID_Cured_Date;
    }

    public void setCOVID_Cured_Date(Date COVID_Cured_Date) {
        this.COVID_Cured_Date = COVID_Cured_Date;
    }

    public String getStreet_Address() {
        return street_Address;
    }

    public void setStreet_Address(String street_Address) {
        this.street_Address = street_Address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRecent_status() {
        return recent_status;
    }

    public void setRecent_status(String recent_status) {
        this.recent_status = recent_status;
    }

    public Date getPrevious_Donation_Date() {
        return previous_Donation_Date;
    }

    public void setPrevious_Donation_Date(Date previous_Donation_Date) {
        this.previous_Donation_Date = previous_Donation_Date;
    }

    public boolean isLab_Confirmation() {
        return lab_Confirmation;
    }

    public void setLab_Confirmation(boolean lab_Confirmation) {
        this.lab_Confirmation = lab_Confirmation;
    }

    public boolean isSymptoms() {
        return symptoms;
    }

    public void setSymptoms(boolean symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isLast_Day_Symptoms() {
        return last_Day_Symptoms;
    }

    public void setLast_Day_Symptoms(boolean last_Day_Symptoms) {
        this.last_Day_Symptoms = last_Day_Symptoms;
    }

    public boolean isFollow_Up_Test() {
        return follow_Up_Test;
    }

    public void setFollow_Up_Test(boolean follow_Up_Test) {
        this.follow_Up_Test = follow_Up_Test;
    }

    @Override
    public String toString() {
        return ID;
    }

}
