/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;
import Plasma_Blood_Group.Blood_Group;
import Plasma_DB4OUtil.DB4OUtil;
import Plasma_Employee.Employee_Dir;
import Plasma_Role.Role;
import Plasma_User_Account.User_Acc_Dir;
import Plasma_Work_Queue.Work_Queue;
import java.util.ArrayList;

/**
 *
 * @author RST
 */
public abstract class Association {
    private int orgID;
    private String name;
    private String firstName;
    private Work_Queue workQueue;
    private Employee_Dir empDir;
    private User_Acc_Dir userAccDir;
    private static int count = 0;
    private Blood_Group bloodGroup;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public enum Type {
        Admin("Admin Association"),
        SystemCoordinator("System Coorinator Association"),
        Doctor("Doctor Association"),
        Pathologist("Pathologist Association");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    //setting types of Association
    
    public enum PlasmaBankType {

        PlasmaBank("Plasma Bank Coordinator Association");
        private String value;

        private PlasmaBankType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum CovidCentreType {

        CovidCentre("Covid centre coordinaor Association");
        private String value;

        private CovidCentreType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum GovernmentType {

        Government("Government Coordinator Association");
        private String value;

        private GovernmentType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum LegalType {

        LegalOfficer("Legal Officer Association");
        private String value;

        private LegalType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Association(String name) {
        this.name = name;
        workQueue = new Work_Queue();
        System.out.println("initialise queue");
        empDir = new Employee_Dir();
        userAccDir = new User_Acc_Dir();
        bloodGroup = new Blood_Group();
        orgID = count;
        ++count;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    //getters and setters for variables
    
    public User_Acc_Dir getUserAccDir() {
        return userAccDir;
    }

    public int getOrgID() {
        return orgID;
    }

    public Employee_Dir getEmpDir() {
        return empDir;
    }

    public String getName() {
        return name;
    }

    public Work_Queue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(Work_Queue workQueue) {
        this.workQueue = workQueue;
    }

    public Blood_Group getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(Blood_Group bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return name;
    }

}
