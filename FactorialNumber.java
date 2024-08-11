import java.util.*;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num = ");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println(n);
        } else {
            for (int i = 1; i <= a; i++) {
                n = n * i;
            }
            System.out.println("Factorial of " + a + " is = " + n);
        }
    }
}
