package employeemanager;

import java.io.File;

public class Main {
    
    private static EmployeeList employeeList;
     private static String objPath = new File("object.dat").getAbsolutePath();
    
    
    public static void main(String[] args) {
        
        System.out.println(objPath);
        
        employeeList  = EmployeeList.LoadFromFile(objPath);
        
        if (employeeList == null)
            employeeList = new EmployeeList(objPath);
        
        
        MainWindow mainWindow = new MainWindow();
        mainWindow.setEmployeeList(employeeList);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(MainWindow.EXIT_ON_CLOSE);
    }
    
}
