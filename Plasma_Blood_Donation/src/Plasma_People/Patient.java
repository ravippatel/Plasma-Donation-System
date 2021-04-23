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
public class Patient {

    //patient detail variables
    private String receiverID;
    private String name;
    private Date dob;
    private int age;
    private String gender;
    private String blood_Group;
    private Date COVID_Infected_Date;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String mobile;
    private String emailID;
    private String status;
    private boolean labConfirmation;
    private boolean legal_Approval;
    private boolean emergency_Status;
    private Date treatment_Date; // Date of plasma treatment 
    private String img;
    private byte[] dP;

    // Getter Setter Functions
    
    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


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

    public String getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public boolean isLabConfirmation() {
        return labConfirmation;
    }

    public void setLabConfirmation(boolean labConfirmation) {
        this.labConfirmation = labConfirmation;
    }

    public boolean isLegal_Approval() {
        return legal_Approval;
    }

    public void setLegal_Approval(boolean legal_Approval) {
        this.legal_Approval = legal_Approval;
    }

    public boolean isEmergency_Status() {
        return emergency_Status;
    }

    public void setEmergency_Status(boolean emergency_Status) {
        this.emergency_Status = emergency_Status;
    }

    public Date getTreatment_Date() {
        return treatment_Date;
    }

    public void setTreatment_Date(Date treatment_Date) {
        this.treatment_Date = treatment_Date;
    }

    @Override
    public String toString() {
        return receiverID;
    }

}
