package employeemanager;

import java.util.ArrayList;

public class EmployeeList {
    
    private ArrayList<Employee>list = new ArrayList<>();
    
    public void addEmployee(Employee employee){
        
        list.add(employee);    
    }
    public void deleteEmployee(Employee employee){
        
        list.remove(employee);
    }

    public ArrayList<Employee> getList() {
        return list;
    }
    
}
