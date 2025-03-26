package Ploymorphism.varargs;

public class Demo2 {

    public void show(String x)
    {
        System.out.println("String Method Called");
    }


    public void show(Integer x)
    {
        System.out.println("Integer Method Called");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.show("null");// Error :if null is Not a String The method show(String) is ambiguous for the type Demo2 because both methods have same priority

    }
}
