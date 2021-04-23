/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Enterprise;

import Plasma_Association.Association;
import Plasma_Association.Association_Dir;

/**
 *
 * @author RST
 */
public abstract class Enterprise extends Association {

    private EnterpriseType enterprise_type;
    private Association_Dir org_Dir;
    private String mobile;
    private String email;
    private int pincode;

    public Association_Dir getAssociationDirectory() {
        return org_Dir;
    }

    public enum EnterpriseType {
        Hospital("Hospital"),
        PlasmaBank("PlasmaBank"),
        Legal("Legal"),
        CovidCentre("CovidCentre"),
        Government("Government");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    //getters and setters for variables
    
    public EnterpriseType getEnterprise_type() {
        return enterprise_type;
    }

    public void setEnterprise_type(EnterpriseType enterprise_type) {
        this.enterprise_type = enterprise_type;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterprise_type = type;
        org_Dir = new Association_Dir();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}
