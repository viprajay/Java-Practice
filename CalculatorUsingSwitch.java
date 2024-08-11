import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        System.out.print("Enter first number : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();
        System.out.print("Choice one +,-,*,/,%: ");
        String sym = sc.next();
        int res;
        switch (sym) {
            case "+":
                res = num1 + num2;
                System.out.println("Addition : " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Subtraction : " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Multiplication : " + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println("Divide : " + res);
                break;
            case "%":
                res = num1 % num2;
                System.out.println("Modulo : " + res);
                break;

            default:
                System.out.println("wrong input!");
                break;
        }
    }
}
