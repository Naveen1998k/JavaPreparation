package Ploymorphism.varargs;

public class Test4 {

    public void accept(int x){
        System.out.println("int");
    }

    public void accept(long x){
        System.out.println("long");

    }
    public void accept(Integer x){
        System.out.println("Integer");

    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.accept(10); // This method call will be invoked to the method with int parameter
    }
}
