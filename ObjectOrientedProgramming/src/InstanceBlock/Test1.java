package InstanceBlock;
class Test{

    public Test() {
        System.out.println("Constructor Test");
    }

    {
        System.out.println("Instance Block Test 1");
    }


    {
        System.out.println("Instance Block Test 2");
    }
}
public class Test1 extends Test
{
    public Test1() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block 1");
    }
    
    {
        System.out.println("Instance Block 2");
    }
    
    public void m1() {
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
       // Test1 test1 = new Test1();
        new Test1().m1();
    }
}
