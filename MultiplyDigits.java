import java.util.Scanner;

class MultiplyDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = "  + N * i);
        }
    }
}