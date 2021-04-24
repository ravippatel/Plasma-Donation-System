/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;

import Plasma_Role.Doctor;
import Plasma_Role.Legal_Officer;
import Plasma_Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Legal_Officer_Association extends Association{

    public Legal_Officer_Association() {
        super(Association.LegalType.LegalOfficer.getValue());
    }
    
    //Create and add legal officer to existing association
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Legal_Officer());
        return roles;
    }
     
}