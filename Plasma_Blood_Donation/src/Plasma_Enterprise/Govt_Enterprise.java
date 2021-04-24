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
public class Govt_Enterprise extends Enterprise {
    
    public Govt_Enterprise(String name){
        super(name,EnterpriseType.Government);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
