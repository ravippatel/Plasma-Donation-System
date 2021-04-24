/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Plasma_User_Account;
import Plasma_Employee.Employee;
import Plasma_Role.Role;
import java.util.ArrayList;
/**
 *
 * @author RST
 */
public class User_Acc_Dir {
    
    private ArrayList<User_Acc> user_Account_List;

    public User_Acc_Dir() {
        user_Account_List = new ArrayList();
    }

    public ArrayList<User_Acc> getUser_Account_List() {
        return user_Account_List;
    }
    
    //validate credentials
    public User_Acc validate_User(String username, String password){
        for (User_Acc ua : user_Account_List)
            if (ua.getUsername().equals(username) && ua.getPass().equals(password)){
                return ua;
            }
        return null;
    }
    
    //create user account
    public User_Acc create_User_Account(String username, String password, Employee employee, Role role){
        User_Acc userAccount = new User_Acc();
        userAccount.setUsername(username);
        userAccount.setPass(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        user_Account_List.add(userAccount);
        return userAccount;
    }
    
    //check for unique username
    public boolean check_If_Username_Is_Unique(String username){
        for (User_Acc ua : user_Account_List){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
