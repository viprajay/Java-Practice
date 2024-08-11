import java.util.*;

public class FunctionsSum {
    public static int Calculate(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num = ");
        int a = sc.nextInt();
        System.out.print("Enter Second num = ");
        int b = sc.nextInt();

        int sum = Calculate(a, b);
        System.out.println("Sum = "+sum);
    }
}
