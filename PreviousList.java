import java.util.*;

public class PreviousList {
    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(100);
        l.add(200);
        l.add("Viprajay");
        l.add(400);
        l.add(500);

        ListIterator itr = l.listIterator();
        while (itr.hasNext()) {
            itr.next();
        }

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
