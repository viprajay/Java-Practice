public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int fib = 0;
        for(int i=0; i<=n; i++){
            fib = fib+i;
            System.out.println(i);
            System.out.println(fib);
        }
        System.out.println(fib);
    }
}
