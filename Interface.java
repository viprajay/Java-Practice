interface I1 {
    void show();
}

class Interface implements I1 {
    public void show() {
        System.out.println("Interface");
    }

    public static void main(String[] args) {
        Interface i = new Interface();
        i.show();
    }
}
 