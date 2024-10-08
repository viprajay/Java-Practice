import java.util.*;

public class Matrix2DArray {

    public static boolean findKey(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.print("index : " + "[" + i + "," + j + "]");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        findKey(arr, 1);
    }

}
