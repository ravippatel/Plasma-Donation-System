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
public class Patient_Dir {

    private ArrayList<Patient> patient_List;

    //getters and setters for patient list
    
    public ArrayList<Patient> getPatient_List() {
        return patient_List;
    }

    public void setPatient_List(ArrayList<Patient> patient_List) {
        this.patient_List = patient_List;
    }

    public Patient_Dir() {
        patient_List = new ArrayList<Patient>();

    }

    //create and add patient to the list
    
    public Patient addPatient() {
        Patient patient = new Patient();
        patient_List.add(patient);
        return patient;

    }

}
