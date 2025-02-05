package InstanceBlock;

public class Test2
{
    int x;
    public Test2() {
        System.out.println("Constructor Test2 "+x);
    }

    {
        x=100;
        System.out.println("Instance Block Test2 1");
    }

    {
        x=200;
        System.out.println("Instance Block Test2 2");
    }

    {
        x=300;
        System.out.println("Instance Block Test2 3");
    }

    public static void main(String[] args) {
        new Test2();
    }
}
