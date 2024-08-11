public class FibonacciNum {
    public static void main(String[] args) {
        // 0,1,1,2,3,4
        int a = 0;
        int b = 1;
        int num = 10;
        int c = 0;
        System.out.print(a + ", " + b);
        for (int i = 1; i <= num; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }

    }
}
