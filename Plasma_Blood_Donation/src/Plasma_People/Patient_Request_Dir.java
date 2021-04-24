/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_People;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class Patient_Request_Dir {

    private ArrayList<Patient_Req> patient_Req_List;

    public ArrayList<Patient_Req> getPatient_Req_List() {
        return patient_Req_List;
    }

    public void setPatient_Req_List(ArrayList<Patient_Req> patient_Req_List) {
        this.patient_Req_List = patient_Req_List;
    }

    public Patient_Request_Dir() {
        patient_Req_List = new ArrayList<Patient_Req>();
    }
    
    //create and add patient request
    
    public Patient_Req addPatientRequest() {
        Patient_Req patientRequest = new Patient_Req();
        patient_Req_List.add(patientRequest);
        return patientRequest;
    }

    //remove patient request
    
    public Donor_Req removePatientRequest(Patient_Req p) {
        patient_Req_List.remove(p);
        return null;
    }

}
