/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Blood_Group;
/**
 *
 * @author RST
 */
public class Blood_Group {
    
    private static int aP = 30;
    private static int aN = 25;
    private static int bP = 65;
    private static int bN = 35;
    private static int oP = 75;
    private static int oN = 27;
    private static int abP = 35;
    private static int abN = 28;
    
    // count availability of blood group
    
    public Blood_Group(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aP++;
        }
        else if(bloodGroup.equals("A-")){
            aN++;
        }
        else if(bloodGroup.equals("B+")){
            bP++;
        }
        else if(bloodGroup.equals("B-")){
            bN++;
        }
        else if(bloodGroup.equals("AB+")){
            abP++;
        }
        else if(bloodGroup.equals("AB-")){
            abN++;
        }
        else if(bloodGroup.equals("O+")){
            oP++;
        }
        else if(bloodGroup.equals("O-")){
            oN++;
        }
            
        //print invalid blood group
        
        else{
            System.out.println("Invalid Blood Group ");
        }    
    }
    
    //getters and setters for blood groups
    
    public static int getaP() {
        return aP;
    }

    public static void setaP(int aP) {
        Blood_Group.aP = aP;
    }

    public static int getaN() {
        return aN;
    }

    public static void setaN(int aN) {
        Blood_Group.aN = aN;
    }

    public static int getbP() {
        return bP;
    }

    public static void setbP(int bP) {
        Blood_Group.bP = bP;
    }

    public static int getbN() {
        return bN;
    }

    public static void setbN(int bN) {
        Blood_Group.bN = bN;
    }

    public static int getoP() {
        return oP;
    }

    public static void setoP(int oP) {
        Blood_Group.oP = oP;
    }

    public static int getoN() {
        return oN;
    }

    public static void setoN(int oN) {
        Blood_Group.oN = oN;
    }

    public static int getAbP() {
        return abP;
    }

    public static void setAbP(int abP) {
        Blood_Group.abP = abP;
    }

    public static int getAbN() {
        return abN;
    }

    public static void setAbN(int abN) {
        Blood_Group.abN = abN;
    }

    public Blood_Group() { 
    }
    
    //update blood Group after useage
    
    public void subtractBloodGroup(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aP--;
        }
        else if(bloodGroup.equals("A-")){
            aN--;
        }
        else if(bloodGroup.equals("B+")){
            bP--;
        }
        else if(bloodGroup.equals("B-")){
            bN--;
        }
        else if(bloodGroup.equals("AB+")){
            abP--;
        }
        else if(bloodGroup.equals("AB-")){
            abN--;
        }
        else if(bloodGroup.equals("O+")){
            oP--;
        }
        else if(bloodGroup.equals("O-")){
            oN--;
        }
        
        //print invalid blood group
        
        else{
            System.out.println("Blood Group invalid");
        }
        
    }

    //add 
    
    public void addBloodG(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aP++;
        }
        else if(bloodGroup.equals("A-")){
            aN++;
        }
        else if(bloodGroup.equals("B+")){
            bP++;
        }
        else if(bloodGroup.equals("B-")){
            bN++;
        }
        else if(bloodGroup.equals("AB+")){
            abP++;
        }
        else if(bloodGroup.equals("AB-")){
            abN++;
        }
        else if(bloodGroup.equals("O+")){
            oP++;
        }
        else if(bloodGroup.equals("O-")){
            oN++;
        }
        else{
            System.out.println("Blood Group invalid");
        }       
    }    
}
