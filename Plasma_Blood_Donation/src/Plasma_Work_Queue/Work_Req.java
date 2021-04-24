/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Work_Queue;
import Plasma_DB4OUtil.DB4OUtil;
import Plasma_Enterprise.Enterprise;
import Plasma_People.Donor;
import Plasma_People.Patient;
import Plasma_User_Account.User_Acc;
import java.util.Date;
/**
 *
 * @author RST
 */
public abstract class Work_Req {
    
    private String msg;
    private User_Acc sender;
    private User_Acc receiver;
    private String status;
    private Date request_Date;
    private Date resolve_Date;    
    private Date action_Date;
    private String summary;
    private String notes;
    private String request_num;
    private String assigned;
    private User_Acc pathologist;
    private User_Acc user_Acc;
    private String overall_Status;
    private Donor donor;
    private Enterprise enterprise;
    private String type;
    private Patient patient;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private static int count = 1;

    public Donor getDonor() {        return donor;    }

    public void setDonor(Donor donor) {this.donor = donor;    }

    public Enterprise getEnterprise() {return enterprise;    }

    public void setEnterprise(Enterprise enterprise) {        this.enterprise = enterprise;    }
    
    public User_Acc getPathologist() {        return pathologist;    }

    public void setPathologist(User_Acc pathologist) {        this.pathologist = pathologist;
    }

    public User_Acc getUser_Acc() {        return user_Acc;
    }

    public void setUser_Acc(User_Acc user_Acc) {        this.user_Acc = user_Acc;
    }

    public String getOverall_Status() {        return overall_Status;
    }

    public void setOverall_Status(String overall_Status) {
        this.overall_Status = overall_Status;
    }
    
    public String getMsg() {return msg;
    }

    public void setMsg(String msg) {this.msg = msg;
    }

    public User_Acc getSender() {
        return sender;
    }

    public void setSender(User_Acc sender) {
        this.sender = sender;
    }

    public User_Acc getReceiver() {
        return receiver;
    }

    public void setReceiver(User_Acc receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequest_Date() {
        return request_Date;
    }

    public void setRequest_Date(Date request_Date) {
        this.request_Date = request_Date;
    }

    public Date getResolve_Date() {
        return resolve_Date;
    }

    public void setResolve_Date(Date resolve_Date) {
        this.resolve_Date = resolve_Date;
    }

    public Date getAction_Date() {
        return action_Date;
    }

    public void setAction_Date(Date action_Date) {
        this.action_Date = action_Date;
    }

    public String getRequest_num() {
        return request_num;
    }

    public void setRequest_num(String request_num) {
        this.request_num = request_num;
    }

    public String getAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned) {
        this.assigned = assigned;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Work_Req.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    //get request number
    public Work_Req(){        
        System.out.println(dB4OUtil.retrieveSystem().getWorkQueue().getWork_Req_List().size()+"count");
        request_num = "REQEST Number:00000"+ String.valueOf(count);
        count++;        
        request_Date = new Date();
    }
    
     @Override
    public String toString() {
        return request_num.toString() ;
    }
    
}
