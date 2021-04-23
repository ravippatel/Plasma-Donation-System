/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_User_Account;
import Plasma_Employee.Employee;
import Plasma_Role.Role;
import Plasma_Work_Queue.Work_Queue;
/**
 *
 * @author RST
 */
public class User_Acc {
    
    private String username;
    private String pass;
    private Employee employee;
    private Role role;
    private Work_Queue workQueue;
    private String name;
    
    public User_Acc() {
        workQueue = new Work_Queue();
    }    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Work_Queue getWorkQueue() {
        return workQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}