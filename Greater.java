import java.util.*;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num A = ");
        int a = sc.nextInt();
        System.out.print("Enter the num B = ");
        int b = sc.nextInt();

        if (a == b){
            System.out.print("A and B are Equal.");
        }else{
            if(a>b){
                System.out.print("A is Greater.");
            }else{
                System.out.print("B is Greater.");
            }
        }
    }
}
