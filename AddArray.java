public class AddArray {
    public static void main(String args[]){
        
        int arr1[]={1,2, 3, 4, 5,7,98,9,7};
        int arr2[]={6, 7, 8, 9, 10};
        // int arr1l = arr1.length;
        // int arr2l = arr2.length;
        // int arrl= arr1l+arr2l;
        
        int arr3[] = new int[arr1.length+arr2.length];

        for(int i=0 ; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        
        for(int j=0 ; j<arr2.length; j++){
            arr3[j+arr1.length] = arr2[j];
        }

        for(int i = 0 ; i<arr3.length ; i++){
            System.out.print(arr3[i]);
        }
        
    }
}
