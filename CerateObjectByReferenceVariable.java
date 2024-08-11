public class CerateObjectByReferenceVariable {
    String color;
    int age;

    public static void main(String[] args) {
        CerateObjectByReferenceVariable rv = new CerateObjectByReferenceVariable();
        rv.color = "black";
        rv.age = 23;
        System.out.println(rv.color + "  " + rv.age);
    }
}
