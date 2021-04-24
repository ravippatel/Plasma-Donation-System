/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;

import Plasma_Role.Doctor;
import Plasma_Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RST
 */
public class Doctor_Association extends Association {

    public Doctor_Association() {
        super(Association.Type.Doctor.getValue());
    }
    
    //Create and add doctor to existing association
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> r = new ArrayList();
        r.add(new Doctor());
        return r;
    }

}
