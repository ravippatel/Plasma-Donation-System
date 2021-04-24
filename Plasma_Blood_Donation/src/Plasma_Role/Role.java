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
import javax.swing.JPanel;
/**
 *
 * @author RST
 */
public abstract class Role {
    
    //assign roles 
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        GovernmentCoordinator("Government Coordinator"),
        LegalOfficer("Legal Officer"),
        Pathologist("Pathologist"),
        PlasmaBankCoordinator("Plasma Bank Coordinator"),
        SystemCoordinator("System Coordinator");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User_Acc account, 
            Association organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network_Cities network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}