/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Employee;
import java.util.Date;
/**
 *
 * @author RST
 */
public class Employee {

    private String name;
    private int id;
    private String mobile;
    private Date dob;
    private String gender;
    private String city;
    private String state;
    private String specialization;
    private String address;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    //getters and setters for variables
    
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name;
    }

}
