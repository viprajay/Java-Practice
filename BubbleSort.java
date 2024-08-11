public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 23, 42, 53, 63, 56 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            // for (int j = 0; j < arr.length - 1-1; j++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
