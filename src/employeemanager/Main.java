package employeemanager;

public class Main {
    
    private static Admin admin = null;
    public static void main(String[] args) {
        LogInWindow loginWindow = new LogInWindow();
        loginWindow.setVisible(true);
        
        loginWindow.setLoginCallback((Admin adminParam) -> {
            
            Main.admin = adminParam;
            
            MainWindow jFrameEmployeeList = new MainWindow();
            jFrameEmployeeList.setVisible(true);
            jFrameEmployeeList.setDefaultCloseOperation(MainWindow.EXIT_ON_CLOSE);
        });
    }
    
}
