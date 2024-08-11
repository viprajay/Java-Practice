public class JavaBean {
    
}

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
