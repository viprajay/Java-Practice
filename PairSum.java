public class PairSum {
    public static void main(String[] args) {
        int pair_sum = 1;
        int temp = 0;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == pair_sum) {
                    temp++;
                }
            }
        }
        if (temp == 0) {
            System.out.println("No pair for " + pair_sum);
        } else {
            System.out.println(temp);
        }
    }
}
