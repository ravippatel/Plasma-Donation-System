package Plasma;

import Plasma_Employee.Employee;
import Plasma_Role.System_Admin;
import Plasma_User_Account.User_Acc;

/**
 *
 * @author RST
 */
public class Configure_System {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getEmpDir().createEmp("sysadmin");

        User_Acc userAccount = system.getUserAccDir().create_User_Account("sysadmin", "sysadmin", employee, new System_Admin());

        return system;
    }

}
