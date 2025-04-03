package StaticBlock;


class StaticBlock {

    int val=10000;
    public StaticBlock() {
        System.out.println("Constructor Of StaticBlock class" );
    }

    {
        System.out.println("Instance Block");
    }
    static {
        x=100;
        System.out.println("Static Block");
    }
    static int x;
    // Static Block will execute only once when class is loaded
    // Static field will be initialized first then static block will execute


    static {
        System.out.println("Static Block 2  "+x);
    }
    {
        System.out.println("Instance Block 2"+x);
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Main Method Start");

        StaticBlock obj1 = new StaticBlock();
    }
}
