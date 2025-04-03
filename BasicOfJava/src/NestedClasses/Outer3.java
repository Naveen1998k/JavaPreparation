package NestedClasses;

public class Outer3 {

    public class A{
        public void display() {
            System.out.println("Inside A");
        }
    }

    private class B{
        public void display() {
            System.out.println("Inside B");
        }
    }

    protected class C{
        public void display() {
            System.out.println("Inside C");
        }
    }

    abstract class D{
        public abstract void display();
    }
    final class E{
        public void display() {
            System.out.println("Inside E");
        }
    }

    public static void main(String[] args) {
        Outer3 outer=new Outer3();
        Outer3.A a=outer.new A();
        a.display();
        Outer3.B b=outer.new B();
        b.display();
        Outer3.C c=outer.new C();
        c.display();
        Outer3.D d=outer.new D() {
            @Override
            public void display() {
                System.out.println("Inside D");
            }
        };

        d.display();
        Outer3.E e=outer.new E();
        e.display();
    }
}
