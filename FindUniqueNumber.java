public class FindUniqueNumber {

    public static int findUniqueNumber(int[] arr) {
        int uniqueNumber = 0;

        for (int num : arr) {
            uniqueNumber ^= num;
        }

        return uniqueNumber;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 4, 2, 6, 9, 3, 3, 5 };
        int result = findUniqueNumber(arr);

        System.out.println("The unique number in the array is: " + result);
    }
}
