import java.util.ArrayDeque;;

class ArrayDeque1 {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.add(6);
        a.add(7);
        a.add(8);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
        System.out.println(a.getFirst() + a.getLast());
    }
}
