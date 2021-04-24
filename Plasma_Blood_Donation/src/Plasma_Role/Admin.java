/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Role;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Association;
import Plasma_User_Account.User_Acc;
import UI_Admin.Admin_Work_JPanel;
import javax.swing.JPanel;
/**
 *
 * @author RST
 */
public class Admin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Acc acc, Association association, Enterprise ent, EcoSystem business, Network_Cities network) {
        return new Admin_Work_JPanel(ent, business, network);
    }

}
