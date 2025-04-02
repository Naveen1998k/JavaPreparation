package StaticBlock;
class Test {

    static int x;
    static {
        x=100;
        System.out.println("Value of x: "+x);
    }
    static {
        x=200;
        System.out.println("Value of x: "+x);
    }
    static {
        x=300;
        System.out.println("Value of x: "+x);
    }
    static {
        x=400;
        System.out.println("Value of x: "+x);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Main method start");

        System.out.println("Value of x: "+Test.x);
        System.out.println("Main method end");
    }
}
