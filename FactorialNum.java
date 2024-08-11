import java.util.*;

public class FactorialNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = i * res;
        }
        System.out.println(res);
    }
}
