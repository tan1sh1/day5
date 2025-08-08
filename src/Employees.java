public class Employees {

    String Name;
    //String Role;
    double Salary;

    public Employees(String Name,double Salary){
        this.Name=Name;
        this.Salary=Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;


    }

    @Override
    public String toString() {
        return "Employees{" +
                "Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
