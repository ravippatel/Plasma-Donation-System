/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;
import Plasma_Role.COVID_Coordinator;
import Plasma_Role.Role;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class COVID_Association extends Association {

    public COVID_Association() {
        super(Association.CovidCentreType.CovidCentre.getValue());
    }

    //Create and add covid coordinator to existing association
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> r = new ArrayList();
        r.add(new COVID_Coordinator());
        return r;
    }

}
