package StaticBlock;
class Test1{

    static int x;  // x is a static variable and it is initialized to 0 by default

    static {

        System.out.println("Value of x: "+x);
    }

}
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Main method start");

        System.out.println("Value of x: "+Test1.x);
        System.out.println("Main method end");
    }
}
