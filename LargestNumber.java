import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num First : ");
        int a = sc.nextInt();
        System.out.print("Enter num Second : ");
        int b = sc.nextInt();
        System.out.print("Enter num Third : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Largest num is : " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest num is " + b);
        } else {
            System.out.println("Largest num is :" + c);
        }
    }
}
