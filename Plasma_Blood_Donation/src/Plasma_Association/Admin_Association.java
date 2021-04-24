/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;

import Plasma_Role.Admin;
import Plasma_Role.Role;
import java.util.ArrayList;

/**
 *
 * @author RST
 */
public class Admin_Association extends Association {

    public Admin_Association() {
        super(Type.Admin.getValue());
    }

    // add new role
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> r = new ArrayList();
        r.add(new Admin());
        return r;
    }

}
