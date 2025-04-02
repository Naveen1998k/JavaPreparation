package StaticBlock;
class AAA{


    static {
        System.out.println("Static block of AAA");
    }

}
class BBB extends AAA{


    static {
        System.out.println("Static block of BBB");
    }

}
public class ClassLoadUsingInheritance {
    public static void main(String[] args) {
        BBB obj = new BBB();
    }

}


