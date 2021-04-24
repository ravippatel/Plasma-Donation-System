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
public class Donor_Request_Dir {

    private ArrayList<Donor_Req> donor_Req_List;
    
    //getters and setter for donor list
    
    public ArrayList<Donor_Req> getDonor_Req_List() {
        return donor_Req_List;
    }

    public void setDonor_Req_List(ArrayList<Donor_Req> donor_Req_List) {
        this.donor_Req_List = donor_Req_List;
    }

    public Donor_Request_Dir() {
        donor_Req_List = new ArrayList<Donor_Req>();
    }
    
    //create and add donor list
    
    public Donor_Req addDonor_Req() {
        Donor_Req d = new Donor_Req();
        donor_Req_List.add(d);
        return d;
    }

    public Donor_Req removeDonorRequest(Donor_Req donor) {
        donor_Req_List.remove(donor);
        return null;
    }

}
