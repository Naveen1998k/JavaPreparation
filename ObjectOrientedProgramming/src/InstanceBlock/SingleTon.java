package InstanceBlock;

public class SingleTon
{
    private static SingleTon singleTon = new SingleTon();
    private SingleTon() {
        System.out.println("Constructor SingleTon");
    }

    {
        System.out.println("Instance Block SingleTon 1");
    }

    {
        System.out.println("Instance Block SingleTon 2");
    }

    public static SingleTon getInstance() {
        return singleTon;
    }

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
    }
}
