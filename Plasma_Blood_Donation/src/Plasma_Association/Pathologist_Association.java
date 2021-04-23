/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;
import Plasma_Role.Pathologist;
import Plasma_Role.Role;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class Pathologist_Association extends Association {

    public Pathologist_Association() {
        super(Association.Type.Pathologist.getValue());
    }
    
    //Create and add Pathologist to existing association
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Pathologist());
        return roles;
    }

}
