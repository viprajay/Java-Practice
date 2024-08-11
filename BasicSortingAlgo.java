import java.util.Arrays;
import java.util.Collections;

public class BasicSortingAlgo {

    // public static void bubbleSort(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // if (arr[j] < arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    // public static void selectionSort(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // int minPosition = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[minPosition] > arr[j]) {
    // minPosition = j;
    // }
    // }
    // int temp = arr[minPosition];
    // arr[minPosition] = arr[i];
    // arr[i] = temp;
    // }
    // }

    // public static void insertionSort(int arr[]) {
    // for (int i = 1; i < arr.length - 1; i++) {
    // int current = arr[i];
    // int previous = i - 1;
    // while (previous >= 0 && arr[previous] > current) {
    // arr[previous + 1] = arr[previous];
    // previous--;
    // }
    // arr[previous + 1] = current;
    // }
    // }

    // public static void printArr(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    public static void main(String[] args) {
        // int[] arr = { 2, 3, 1, 5, 8, 4, 9 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // printArr(arr);
        // Arrays.sort(arr, 3, 6);

        Integer arr[] = { 2, 3, 1, 5, 8, 4, 9 };
        Arrays.sort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        // System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // System.out.println(Arrays.toString(arr));
    }
}
