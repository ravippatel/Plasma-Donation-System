/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Association;
import Plasma_Association.Association.Type;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class Association_Dir {

    private ArrayList<Association> AssociationList;

    public Association_Dir() {
        AssociationList = new ArrayList();
    }

    public ArrayList<Association> getAssociationList() {
        return AssociationList;
    }

    public Association createAssociation(Type t, String realName) {
        Association association = null;
        if (t.getValue().equals(Type.Doctor.getValue())) {
            association = new Doctor_Association();
            association.setFirstName(realName);
            AssociationList.add(association);
        } else if (t.getValue().equals(Type.SystemCoordinator.getValue())) {
            association = new System_Coordinator_Association();
            association.setFirstName(realName);
            AssociationList.add(association);
        } else if (t.getValue().equals(Type.Pathologist.getValue())) {
            association = new Pathologist_Association();
            association.setFirstName(realName);
            AssociationList.add(association);
        }
        return association;
    }
    
    // create legal officer Association
    
    public Association createLegalAssociation(Association.LegalType legalType, String realName) {
        Association association = null;
        if (legalType.getValue().equals(Association.LegalType.LegalOfficer.getValue())) {
            association = new Legal_Officer_Association();
            association.setFirstName(realName);
            AssociationList.add(association);
        }
        return association;
    }

    //create plasma bank association
    
    public Association createPlasmaAssociation(Association.PlasmaBankType plasmaType, String realName) {
        Association association = null;
        if (plasmaType.getValue().equals(Association.PlasmaBankType.PlasmaBank.getValue())) {
            association = new Plasma_Bank_Association();
            association.setFirstName(realName);
            AssociationList.add(association);
        }
        return association;
    }

    //create covid Association
    
    public Association createCOVIDAssociation(Association.CovidCentreType covidType, String realName) {
        Association association = null;
        if (covidType.getValue().equals(Association.CovidCentreType.CovidCentre.getValue())) {
            association = new COVID_Association();
            association.setFirstName(realName);
            AssociationList.add(association);
        }
        return association;
    }

    //create government Association
    
    public Association createGovernmentAssociation(Association.GovernmentType govtType, String realName) {
        Association association = null;
        if (govtType.getValue().equals(Association.GovernmentType.Government.getValue())) {
            association = new Government_Association();
            association.setFirstName(realName);
            AssociationList.add(association);
        }
        return association;
    }

}
