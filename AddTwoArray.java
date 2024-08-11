public class AddTwoArray{
    public static void main(String[] args) {
        int arr1 [] = {1, 2, 3, 4, 5};
        int arr2 [] = {6, 7, 8, 9, 10, 11};
        int arr [] = new int[20];
        int n = arr.length/2;
        for(int i = 0 ; i<arr.length; i++){
            if (i<n){
                arr[i] =  arr1[i];
            }
            else{
                arr [i]= arr2[i-n];
            }
        }
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}