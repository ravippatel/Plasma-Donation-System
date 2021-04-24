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
public class Donor_Req {

    // Donor Attributes
    private String donor_ID;
    private String name;
    private Date dateOfBirth;
    private int age;
    private String gender;
    private String blood_Group;
    private Date COVID_Infected_Date;
    private Date COVID_Cured_Date;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String contact;
    private String emailID;
    private String status;
    private Date previous_Donation_Date;
    private boolean lab_Confirmation;
    private boolean symptoms;
    private boolean last_Day_Symptoms;
    private boolean followUpTest;
    private String imgPath;
    private byte[] dP;

    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    // Getter Setter for all variables
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDonor_ID() {
        return donor_ID;
    }

    public void setDonor_ID(String donor_ID) {
        this.donor_ID = donor_ID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public boolean isFollowUpTest() {
        return followUpTest;
    }

    public void setFollowUpTest(boolean followUpTest) {
        this.followUpTest = followUpTest;
    }

    @Override
    public String toString() {
        return donor_ID;
    }

}
