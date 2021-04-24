/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Role;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Association;
import Plasma_Association.Plasma_Bank_Association;
import Plasma_User_Account.User_Acc;
import javax.swing.JPanel;
import UI_Plasma_Bank_Coordinator.Plasma_Bank_Coordinator_WorkArea_JPanel;
/**
 *
 * @author RST
 */
public class Plasma_Bank_Coordinator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Acc acc, Association association, Enterprise enterprise, EcoSystem business, Network_Cities n) {
        return new Plasma_Bank_Coordinator_WorkArea_JPanel(acc, (Plasma_Bank_Association)association, enterprise, business, n);
    }
    
}
