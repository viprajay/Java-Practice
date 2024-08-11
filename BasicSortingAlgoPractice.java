public class BasicSortingAlgoPractice {

    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 5, 7, 8, 3, 9, 6, 1, -2 };
        insertionSort(arr);
        printArr(arr);
    }
}
