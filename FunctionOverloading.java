public class FunctionOverloading {

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        FunctionOverloading fo = new FunctionOverloading();
        fo.sum(5, 7, 6);
    }
}
