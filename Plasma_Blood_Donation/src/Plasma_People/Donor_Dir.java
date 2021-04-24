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
public class Donor_Dir {

    private ArrayList<Donor> donor_List;

    public ArrayList<Donor> getDonor_List() {
        return donor_List;
    }

    public void setDonor_List(ArrayList<Donor> donor_List) {
        this.donor_List = donor_List;
    }

    public Donor_Dir() {
        donor_List = new ArrayList<Donor>();
    }

    //create and add donor
    
    public Donor addDonor() {
        Donor donor = new Donor();
        donor_List.add(donor);
        return donor;
    }

}
