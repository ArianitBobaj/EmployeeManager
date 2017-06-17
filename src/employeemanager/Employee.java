package employeemanager;
import java.io.Serializable;

public class Employee implements Serializable {
    
    private String ID;
    private String FirstName;
    private String LastName;
    private String Salary;
    private String Department;
    private String Position;
    private String email;
    private String phoneNumber;
    private String birthDate;
    private String HiredDate;
 
       public Employee() {
    
    }
     
    public Employee(String firstName, String lastName) {
        
        this.FirstName = firstName;
        this.LastName = lastName;
    }
    
      public Employee(String id, String firstName, String lastName, String salary, String department, String position, String email, String phonenumber, String birthdate, String hiredate) {
        
        this.ID = id;
          this.FirstName = firstName;
        this.LastName = lastName;
        this.Salary = salary;
       this.Department = department;
         this.Position = position;
       this.email = email;
       this.phoneNumber = phonenumber;
       this.birthDate = birthdate;
       this.HiredDate = hiredate;
    }

    public String getID() {
        return ID;
    }
      public void setID(String id) {
        this.ID = id;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }


    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHiredDate() {
        return HiredDate;
    }

    public void setHiredDate(String HiredDate) {
        this.HiredDate = HiredDate;
    } 
       @Override
    public String toString() {
        
        return FirstName + " " + LastName;
    }
    
}
