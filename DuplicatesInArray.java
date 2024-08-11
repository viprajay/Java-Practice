import java.util.*;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int a[] = { 8, 7, 9, 1, 2, 5, 4 };

        // Type 1
        // for (int i = 0; i < a.length; i++) {

        // }
        // Arrays.sort(a);
        // System.out.println(Arrays.toString(a));

        // Type 2
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }

    }
}
