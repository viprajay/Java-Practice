public class ArmstrongNum {
    public static void main(String[] args) {
        int number = 153;
        int num = number;
        int temp = 0;
        int rem = 0;
        while (num != 0) {
            temp = num % 10;
            rem = rem + (temp * temp * temp);
            num = num / 10;
        }
        if (number == rem) {
            System.out.println(number + " is armstrong num");
        } else {
            System.out.println(number + "is not armstrong num");
        }
    }
}
