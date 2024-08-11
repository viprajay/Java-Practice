import java.util.*;

public class Loop {
    public static void main(String[] args) {
        int i = 0;
        
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            i++;
            String line = sc.nextLine();
            System.out.println(i + " " + line);
        }
        // Scanner sc =new Scanner(System.in);
        // for(int i=1;i<=3;i++){
        //     String a = sc.nextLine();
        //     System.out.println(i +" "+a);
        // }

        // for(int i = 5; i>0; i--){
        //     System.out.println(i);
        // }
        // int i = 2;
        // while(i<=20){
        //     System.out.println(i);
        //     i+=2;
        // }
    }
}
