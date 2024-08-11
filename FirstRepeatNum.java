public class FirstRepeatNum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 4, 5, 6, 7, 8, };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    System.exit(0);
                }
            }
        }
    }
}
