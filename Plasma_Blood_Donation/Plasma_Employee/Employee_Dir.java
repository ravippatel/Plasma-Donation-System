/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_Employee;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class Employee_Dir {

    private ArrayList<Employee> empList;

    public Employee_Dir() {
        empList = new ArrayList();
    }

    //getters and setters
    
    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    //create employee and add to the arraylist
    
    public Employee createEmp(String name) {
        Employee emp = new Employee();
        emp.setName(name);
        empList.add(emp);
        return emp;
    }
}
