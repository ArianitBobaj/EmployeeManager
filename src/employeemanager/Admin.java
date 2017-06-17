package employeemanager;

public class Admin {

    private int id;
    private String username;
    private String password;

    public Admin(){
        id = 1;
        username = "Arianit";
        password = "ari123";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
