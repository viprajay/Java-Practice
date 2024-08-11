public class CerateObjectByUsingMethod {
    String name;
    int age;

    void initObj(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + "  " + age);
    }

    public static void main(String[] args) {
        CerateObjectByUsingMethod rv = new CerateObjectByUsingMethod();
        rv.initObj("viprajay", 23);
        rv.display();
    }
}
