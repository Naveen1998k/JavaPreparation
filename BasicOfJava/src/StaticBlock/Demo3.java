package StaticBlock;
class A {

    static final int x ;
    static {
        x = 10; // initialization is Compulsory  bcoz final blank static variable can be initialized only once
    }

    static {
        System.out.println("Static Block 1");
    }
}
public class Demo3 {

    public static void main(String[] args) {
        System.out.println(A.x);
    }
}
