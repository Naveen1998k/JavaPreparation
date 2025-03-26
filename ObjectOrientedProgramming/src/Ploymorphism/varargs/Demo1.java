package Ploymorphism.varargs;

public class Demo1 {


    public void show(Integer a)
    {
        System.out.println("Integer Method Called");
    }

    public void show(int ...a)
    {
        System.out.println("Var args Method Called");
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.show(10);
        demo1.show(10,20);
    }
}
