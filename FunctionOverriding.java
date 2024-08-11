class Parent {

    void show() {
        System.out.println("I am Parent Class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("I am Child Class");
    }

}

public class FunctionOverriding {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        Parent c = new Child();
        c.show();

    }
}
