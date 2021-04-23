/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Network_Cities;

import Plasma_Enterprise.Enterprise_Dir;

/**
 *
 * @author RST
 */
public class Network_Cities {

    private String city_name;
    private String state;
    private String country;
    private Enterprise_Dir enterprise_Dir;

    // getters and setters for all variables
    
    public Network_Cities() {
        enterprise_Dir = new Enterprise_Dir();
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public Enterprise_Dir getEnterprise_Dir() {
        return enterprise_Dir;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return city_name;
    }

}
