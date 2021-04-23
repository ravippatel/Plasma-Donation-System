/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Work_Queue;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class Work_Queue {
    
    private ArrayList<Work_Req> work_Req_List;

    public Work_Queue() {
        work_Req_List = new ArrayList<Work_Req>();
    }

    public ArrayList<Work_Req> getWork_Req_List() {
        return work_Req_List;
    }
}