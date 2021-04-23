/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Role;
import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Association;
import Plasma_Association.System_Coordinator_Association;
import Plasma_User_Account.User_Acc;
import javax.swing.JPanel;
import UI_System_Coordinator.System_Coordinator_WorkArea_JPanel;
/**
 *
 * @author RSTs
 */
public class System_Coordinator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Acc account, Association organization, Enterprise enterprise, EcoSystem business, Network_Cities network) {
        return new System_Coordinator_WorkArea_JPanel(account, (System_Coordinator_Association)organization, enterprise, business, network);
    }
    
}
