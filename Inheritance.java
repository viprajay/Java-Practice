class First {
    void property() {
       System.out.println("180 cc engine");
    }
}

class Second extends First {
    void wheel() {
        System.out.println("In the bike have two wheel.");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Second sc = new Second();
        sc.wheel();
        sc.property();
    }
}
