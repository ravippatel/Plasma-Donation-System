/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Enterprise;

import java.util.ArrayList;

/**
 *
 * @author RST
 */
public class Enterprise_Dir {

    private ArrayList<Enterprise> ent_List;

    //getters and setters for enterprise list
    
    public ArrayList<Enterprise> getEnt_List() {
        return ent_List;
    }

    public void setEnt_List(ArrayList<Enterprise> ent_List) {
        this.ent_List = ent_List;
    }

    public Enterprise_Dir() {
        ent_List = new ArrayList<Enterprise>();
    }

    //Create new enterprise
    public Enterprise create_And_Add_Enterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise e = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            e = new Hospital_Enterprise(name);
            ent_List.add(e);
        } else if (type == Enterprise.EnterpriseType.Legal) {
            e = new Legal_Enterprise(name);
            ent_List.add(e);
        } else if (type == Enterprise.EnterpriseType.Government) {
            e = new Govt_Enterprise(name);
            ent_List.add(e);
        } else if (type == Enterprise.EnterpriseType.PlasmaBank) {
            e = new Plasma_Bank_Enterprise(name);
            ent_List.add(e);
        } else if (type == Enterprise.EnterpriseType.CovidCentre) {
            e = new COVID_Enterprise(name);
            ent_List.add(e);
        }

        return e;
    }
}
