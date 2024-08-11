public class ArrayLargeNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 23, 72, 62, 42, 88, 99 };
        int a = arr[0];
        int b = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                b = a;
                a = arr[i];
            }
            if(arr[i]>b && arr[i]<a){
                b = arr[i];
            }
        }
        System.out.println("Largest = "+a);
        System.out.println("Second Largest= "+b);
    }
}
