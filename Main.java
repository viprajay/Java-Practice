import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    // Properties of the Employee class
    public int id;
    public String name;
    public String department;
    public double salary;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // toString method to display employee information
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Employee object using the no-argument constructor
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "John Doe";
        emp1.department = "Engineering";
        emp1.salary = 75000;

        // Create an Employee object using the parameterized constructor
        Employee emp2 = new Employee(2, "Jane Smith", "Marketing", 68000);

        // Display employee information
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
