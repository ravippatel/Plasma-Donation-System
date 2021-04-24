/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Role;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Legal_Officer_Association;
import Plasma_Association.Association;
import Plasma_User_Account.User_Acc;
import javax.swing.JPanel;
import UI_Legal_Officer.Legal_Officer_WorkArea_JPanel;
/**
 *
 * @author RST
 */
public class Legal_Officer extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Acc acc, Association association, Enterprise ent, EcoSystem business, Network_Cities n) {
        return new Legal_Officer_WorkArea_JPanel(acc, (Legal_Officer_Association) association, ent, business, n);
    }

}
