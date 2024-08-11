public class Functions {

    int a = 10, b = 20;

    void add() {
        System.out.println(a + b);
    }

    void avg() {
        System.out.println((a + b) / 2);
    }

    void shift() {
        System.out.println(a << b);
    }

    void logic() {
        System.out.println(a < b && a > b);
    }

    public static void main(String[] args) {
        Functions asl = new Functions();
        asl.add();
        asl.avg();
        asl.shift();
        asl.logic();

        System.out.println("hiii");

    }
}
