/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Enterprise;
import Plasma_Role.Role;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class Hospital_Enterprise extends Enterprise {
    
    public Hospital_Enterprise(String name){
        super(name,EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
