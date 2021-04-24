/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;
import Plasma_Role.Role;
import Plasma_Role.System_Coordinator;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class System_Coordinator_Association extends Association{

    public System_Coordinator_Association() {
        super(Association.Type.SystemCoordinator.getValue());
    }
    
    //Create and add system coordinator to existing association
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new System_Coordinator());
        return roles;
    }
     
}