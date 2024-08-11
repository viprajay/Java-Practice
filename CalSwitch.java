import java.util.*;

public class CalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First num = ");
        int a = sc.nextInt();
        System.out.print("Enter the Second num = ");
        int b = sc.nextInt();
        System.out.print("\nPress 1 for Add, Press 2 for sub, Press 3 for multiply, Press 4 for divide = ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

}
