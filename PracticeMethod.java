public class PracticeMethod {

    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }

    // static int logic(int x, int y){
    //     int logic(int x, int y){
    //     int z;
    //     z = x+y;
    //     return z;
    // }
    public static void main(String[] args) {

        System.out.println("all sum = "+sum(3 , 4 , 5 ));

        // int a = 4;
        // int b = 3;
        // int c = logic(a, b) ;
        //  System.out.println(c);
        // PracticeMethod obj = new PracticeMethod();
        // int c = obj.logic(a, b);
        // System.out.println(c);
       
   
        
    }
}
