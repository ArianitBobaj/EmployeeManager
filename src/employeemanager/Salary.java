package employeemanager;


public class Salary {
    
    private String ID;
    private double WorkHours;
    private double BasicSalary;
    private double Bonus;

    public Salary(String ID, double WorkHours, double BasicSalary, double Bonus) {
        this.ID = ID;
        this.WorkHours = WorkHours;
        this.BasicSalary = BasicSalary;
        this.Bonus = Bonus;
    }

    public String getID() {
        return ID;
    }


    public double getWorkHours() {
        return WorkHours;
    }

    public void setWorkHours(double WorkHours) {
        this.WorkHours = WorkHours;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(double BasicSalary) {
        this.BasicSalary = BasicSalary;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }
    
    
}
