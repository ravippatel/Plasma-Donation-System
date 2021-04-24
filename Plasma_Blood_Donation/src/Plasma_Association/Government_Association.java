/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;
import Plasma_Role.Govt_Coordinator;
import Plasma_Role.Role;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class Government_Association extends Association{

    public Government_Association() {
        super(Association.GovernmentType.Government.getValue());
    }
    
    //Create and add govt. to existing association
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Govt_Coordinator());
        return roles;
    }
     
}