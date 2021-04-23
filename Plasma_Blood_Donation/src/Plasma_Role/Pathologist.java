/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Role;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Association;
import Plasma_Association.Pathologist_Association;
import Plasma_User_Account.User_Acc;
import javax.swing.JPanel;
import UI_Pathologist.Pathologist_WorkArea_JPanel;
/**
 *
 * @author RST
 */
public class Pathologist extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Acc acc, Association association, Enterprise enterprise, EcoSystem business, Network_Cities n) {
        return new Pathologist_WorkArea_JPanel(acc, (Pathologist_Association) association, enterprise, business, n);
    }

}
