package Ploymorphism.MethodOverriding;
class  A{
    A foo(){
        System.out.println("A");
        return this;
    }
}
class B extends A{
    B foo(){
        System.out.println("B");
        return this;
    }
}
class C extends B{
    C foo(){
        System.out.println("C");
        return this;
    }
}
public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.foo();
        A a = new A();
        a.foo();
        B b = new B();
        b.foo();
    }
}
