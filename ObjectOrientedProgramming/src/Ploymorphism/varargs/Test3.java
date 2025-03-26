package Ploymorphism.varargs;

public class Test3 {

    public void accept(byte b){
        System.out.println("byte version");

    }

    public void accept(short s){
        System.out.println("short version");

    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        //t.accept(10);// Error : The method accept(byte) is ambiguous for the type Test3
        t.accept((byte) 10);
        t.accept((short) 10);
    }
}
