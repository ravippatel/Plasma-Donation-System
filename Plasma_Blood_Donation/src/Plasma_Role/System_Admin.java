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
import UI_System_Admin_Work_Area.System_Admin_WorkArea_JPanel;
import javax.swing.JPanel;
/**
 *
 * @author RST
 */
public class System_Admin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Acc acc, Association association, Enterprise enterprise, EcoSystem system, Network_Cities network) {
        return new System_Admin_WorkArea_JPanel(system);
    }
    
}
