import java.io.Serializable;

public class EmployeeData implements Serializable {
    private static final long serialVersionUID = 1l;

    private int id;
    private String name;
    private String department;
    private double salary;

    public EmployeeData() {

    }

    public EmployeeData(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

    public String toString() {
        return id + name + department + salary;
    }
}

public class Employee {
    public static void main(String args[]) {
        EmployeeData imp = new EmployeeData();
        imp.id = 1;
        imp.name = "viprajay";
        imp.department = "Software Engineer";
        imp.salary = 120000;

        System.out.println(imp);
    }
}