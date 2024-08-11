import java.util.*;
import java.util.List;

class ArrayListFirst {
    public static void main(String[] args) {

        List a = new ArrayList();
        a.add(100);
        a.add(200);
        a.add(300);
        a.add("Viprajay");
        System.out.println(a);

        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}