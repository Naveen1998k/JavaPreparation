package Ploymorphism.varargs;

public class Test1 {


//    public void m1(int... x,int ...y) {
//        System.out.println("Var-arg method");
//    }

//
//   public void m1(int... x,int y) {
//
//    }

    // Above Example is invalid because var-arg parameter should be last parameter and
    // Only one var-arg parameter is allowed in the method.
    public void m1(int x,int... y) {
        System.out.println("General method");
    }
    public static void main(String[] args) {

    }
}
