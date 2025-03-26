package Ploymorphism.varargs;

public class Test5 {

    public void accept(Object x){
        System.out.println("Object");
    }


    public void accept(String x){
        System.out.println("String");

    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.accept(null); // This method call will be invoked to the method with Integer parameter
        t.accept("NIT");
    }
}
