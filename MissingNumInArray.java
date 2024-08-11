import java.util.*;
import java.util.Arrays;
public class MissingNumInArray {

    public static int getMissingNo(int nums[], int n){
        int sum = (n+1)*(n+2)/2;
        
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9 };     

    }
}

// class GFG {
 
    
//     public static int getMissingNo(int[] nums, int n)
//     {
//         int sum = ((n + 1) * (n + 2)) / 2;
//         for (int i = 0; i < n; i++)
//             sum -= nums[i];
//         return sum;
//     }
 
    
//     public static void main(String[] args)
//     {
//         int[] arr = { 1, 2, 3, 5, 9, 7, 8, 4 };
//         int N = arr.length;
//         System.out.println(getMissingNo(arr, N));
//     }
// }