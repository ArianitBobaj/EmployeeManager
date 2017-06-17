package employeemanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;



public class EmployeeList  implements Serializable{
    
    private ArrayList<Employee>list = new ArrayList<>();
    private String objectPath;
    
        public static EmployeeList LoadFromFile(String filePath) {
    
        File objectFile = new File(filePath);
        
        try{
            FileInputStream fileInputStream = new FileInputStream(objectFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        
            return (EmployeeList)objectInputStream.readObject();
        }
        catch(IOException | ClassNotFoundException e) {
        
            return null;
        }
    }
    
        public EmployeeList(String objectPath){
            
            this.objectPath = objectPath;
        }
        
    public void addEmployee(Employee employee){
        
        list.add(employee);  
        saveObject();
    }
    
   public Employee getEmployee(int index) {
    
        return list.get(index);
    }
    
    public void deleteEmployee(Employee employee){
        
        list.remove(employee);
        saveObject();
    }
    
        public void deleteEmployee(int i) {
    
        list.remove(i);
        saveObject();
    }

    public ArrayList<Employee> getList() {
        return list;
    }
    
    public ArrayList<Employee> search(String query) {
    
        ArrayList<Employee> results = new ArrayList<>();
        
        String preparedQuery = query.toLowerCase().trim();
        
        for(Employee currentEmployee : list) {
        
            String fullName = currentEmployee.getFirstName() + " " +
                              currentEmployee.getLastName();
            
            if(fullName.toLowerCase().contains(preparedQuery)) {
            
                results.add(currentEmployee);
            }
        }
          return results;
    }
        
  
    public void saveObject() {
     
            saveObject(objectPath);
    }
        public void saveObject(String filePath) {
    
        File objectFile = new File(filePath);
        
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(objectFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            objectOutputStream.writeObject(this);
        }
        catch(IOException ex) {
        
        }
    }
    
}
