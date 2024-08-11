public class ParametrizedConstructor {
    String name;

    public ParametrizedConstructor(String n) {
        name = n;
    }

    public void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        ParametrizedConstructor pc = new ParametrizedConstructor("viprajay");
        pc.display();
    }
}
