/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma;
import Plasma_Network_Cities.Network_Cities;
import Plasma_Association.Association;
import Plasma_People.Donor_Dir;
import Plasma_People.Donor_Request_Dir;
import Plasma_People.Patient_Dir;
import Plasma_People.Patient_Request_Dir;
import Plasma_Role.Role;
import Plasma_Role.System_Admin;
import Plasma_User_Account.User_Acc_Dir;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class EcoSystem extends Association{
    
    private static EcoSystem plasma;
    private Donor_Dir donorDir;
    private Patient_Dir patientDir;
    private Donor_Request_Dir donorRequestDir;
    private Patient_Request_Dir patientRequestDir;
    private  User_Acc_Dir userAccDir;
    private ArrayList<Network_Cities> cityList;
    //getters and setters for variables
    
    public User_Acc_Dir getUserAccDir() {return userAccDir; }
    public void setUserAccDir(User_Acc_Dir userAccDir) { this.userAccDir = userAccDir;  }
    public Donor_Request_Dir getDonorRequestDir() {   return donorRequestDir;    }
    public void setDonorRequestDir(Donor_Request_Dir donorRequestDir) {        this.donorRequestDir = donorRequestDir;    }
    public Patient_Request_Dir getPatientRequestDir() {        return patientRequestDir;    }
    public void setPatientRequestDir(Patient_Request_Dir patientRequestDir) {        this.patientRequestDir = patientRequestDir;    }
    public Patient_Dir getPatientDir() {return patientDir;}
    public void setPatientDir(Patient_Dir patientDir) {this.patientDir = patientDir;}
    public Donor_Dir getDonorDir() {return donorDir;}
    public void setDonorDir(Donor_Dir donorDir) {this.donorDir = donorDir;}
    public ArrayList<Network_Cities> getCityList() {return cityList;}
    public void setCityList(ArrayList<Network_Cities> cityList) {this.cityList = cityList;}
    
    //check if ecosystem is not created
    public static EcoSystem getInstance(){
        if(plasma==null){
            plasma=new EcoSystem();
        }
        return plasma;
    }
    // Add new network to Existing network
    public Network_Cities createAndAddNetworkCity(){
        Network_Cities n=new Network_Cities();
        cityList.add(n);
        return n;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new System_Admin());
        return roleList;
    }
    //Constructor to Initialize Directory
    private EcoSystem(){
        super(null);
        cityList=new ArrayList<Network_Cities>();
        this.donorDir = new Donor_Dir();
        this.patientDir = new Patient_Dir();
        this.donorRequestDir = new Donor_Request_Dir();
        this.patientRequestDir = new Patient_Request_Dir();
        this.userAccDir  = new User_Acc_Dir();
    }
    // Check for unique user
    public boolean check_Unique_User(String userName){
        if(!this.getUserAccDir().check_If_Username_Is_Unique(userName)){
            return false;
        }
        for(Network_Cities network:cityList){            
        }
        return true;
    }
}
