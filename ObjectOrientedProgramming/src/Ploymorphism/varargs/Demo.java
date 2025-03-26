package Ploymorphism.varargs;

public class Demo {



    public void accept(long x){
        System.out.println("long");

    }
    public void accept(Integer x){
        System.out.println("Integer");

    }

    public static void main(String[] args) {
        Demo t = new Demo();
        t.accept(10); // This method call will be invoked to the method with long parameter
    }
}
