class Abc1{
        public void add(){
            int a = 20 , b = 10;
            int c = a+b;
            System.out.println(c);
        }
    }
    
    class Abc2 extends Abc1{
        public void sub(){
            int a = 20 , b = 10;
            int c = a-b;
            System.out.println(c);
        }
    }

    class Abc3 extends Abc2{
        public void mul(){
            int a = 20 , b = 10;
            int c = a*b;
            System.out.println(c);
        }
    }

public class MultiLevel {
    public static void main(String[] args) {
        Abc3 ab = new Abc3();
        ab.add();
        ab.sub();
        ab.mul();
        
    }
}
