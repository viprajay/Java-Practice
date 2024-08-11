import java.util.*;

import java.util.List;

public class EnumerationJava {
    public static void main(String[] args) {
        Vector l = new Vector();

        l.add(100);
        l.add(200);
        l.add("Viprajay");
        l.add(400);
        l.add(500);

        Enumeration e = l.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
