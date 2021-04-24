/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;

import Plasma_Role.Doctor;
import Plasma_Role.Plasma_Bank_Coordinator;
import Plasma_Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RST
 */
public class Plasma_Bank_Association extends Association{

    public Plasma_Bank_Association() {
        super(Association.PlasmaBankType.PlasmaBank.getValue());
    }

    //Create and add plasma bank to existing association
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Plasma_Bank_Coordinator());
        return roles;
    }
     
}