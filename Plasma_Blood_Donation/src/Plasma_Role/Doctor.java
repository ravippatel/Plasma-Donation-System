/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Role;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Doctor_Association;
import Plasma_Association.Association;
import Plasma_User_Account.User_Acc;
import UI_Doctor.Doctor_WorkArea_JPanel;
import javax.swing.JPanel;
/**
 *
 * @author RST
 */
public class Doctor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Acc acc, Association association, Enterprise ent, EcoSystem business, Network_Cities n) {
        return new Doctor_WorkArea_JPanel(acc, (Doctor_Association) association, ent, business, n);
    }

}
