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
public class Plasma_Bank_Enterprise extends Enterprise {
    
    public Plasma_Bank_Enterprise(String name){
        super(name,EnterpriseType.PlasmaBank);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
