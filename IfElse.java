import java.util.*;

class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        
        if (age>=18){
            System.out.println("\nYour are Adult");
        }
        else{
            System.out.println("\nYour are not Adult");
        }
    }
}