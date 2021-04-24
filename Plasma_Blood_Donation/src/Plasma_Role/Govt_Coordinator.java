/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Role;

import Plasma.EcoSystem;
import Plasma_Enterprise.Enterprise;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Government_Association;
import Plasma_Association.Association;
import Plasma_User_Account.User_Acc;

import javax.swing.JPanel;
import UI_Govt_Coordinator.Govt_Coordinator_WorkArea_JPanel;

/**
 *
 * @author RST
 */
public class Govt_Coordinator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Acc account, Association organization, Enterprise enterprise, EcoSystem business, Network_Cities network) {
        return new Govt_Coordinator_WorkArea_JPanel(account, (Government_Association) organization, enterprise, business, network);
    }
    
}
