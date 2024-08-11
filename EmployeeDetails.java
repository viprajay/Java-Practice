
class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println(id);
        System.out.println(name);
    }

}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee Emp = new Employee();

        Emp.id = 1;
        Emp.name = "Viprajay";

        Emp.printDetails();

    }
}
