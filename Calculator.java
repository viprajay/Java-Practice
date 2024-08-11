import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num = ");
        int a = sc.nextInt();
        System.out.print("Enter the Second num = ");
        int b = sc.nextInt();
        System.out.print("\nPress 1 for Add, Press 2 for sub, Press 3 for multiply, Press 4 for divide = ");
        int c = sc.nextInt();
        if (c==1){
            System.out.println(a+b);
        }else if(c==2){
            System.out.println(a-b);
        }else if(c==3){
            System.out.println(a*b);
        }else if (c==4){
            System.out.println(a/b);
        }else{
            System.out.println("Invalid Value");
        }

    }
}