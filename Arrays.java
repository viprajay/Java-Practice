import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0]=34;
        // marks[1]=43;
        // marks[2]=84;
        // System.out.println(marks[1]);
        // for(int i=0; i<3; i++){
        // System.out.println(marks[i]);
        // }
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int [] numbers = new int[size];

        // for(int i=0; i<size; i++){
        // numbers[i]=sc.nextInt();
        // }

        // for(int i=0; i<size; i++){
        // System.out.println(numbers[i]);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Total size you want = ");
        int size = sc.nextInt();
        int[] num = new int[size];
        // System.out.println(size);

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print("Type you want to search = ");
        int x = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                System.out.println("index num = "+i);
            }
        }

    }

}
