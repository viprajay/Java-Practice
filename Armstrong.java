import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        int number, temp, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Three digit number = ");
        int num = sc.nextInt();
        number = num;
        for (; number != 0; number = number / 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }
        if (total == num) {
            System.out.println("Number is armstrong.");
        } else {
            System.out.println("Number in not armstrong.");
        }
    }
}
