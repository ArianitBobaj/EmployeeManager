package employeemanager;

import java.io.File;

public class Main {
    
  
    private static Admin admin = null;
    public static void main(String[] args) {
        
   

        
        LogInWindow loginWindow = new LogInWindow();
        loginWindow.setVisible(true);
        
        loginWindow.setLoginCallback((Admin adminParam) -> {
            
            Main.admin = adminParam;

   
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(MainWindow.EXIT_ON_CLOSE);
        });
   

                }             
}
