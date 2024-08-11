class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("Arithmetic Operators = " + (a + b));
        System.out.println("Unary Operators = " + (a++));
        System.out.println("Assignment Operators = " + (a += 3));
        System.out.println("Relational Operators = " + (a > b));
        System.out.println("Logical Operators = " + (a<b && b>a));
        System.out.println("Ternary operator = " + ((a > b) ? (a > c) ? a : c : (b > c) ? b : c));
        System.out.println("Bitwise Operators = " + (a & b));
        System.out.println("Shift Operators = " + (a << 1));
    }
}