package Inheritance;

class A {
    void display() {
        System.out.println("Class A");
    }

    void msg(){
        System.out.println("Hello I am A Class");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B");
    }
}

class C extends A {
    void display() {
        System.out.println("Class C");
    }
}


public class HierarchicalInheritance {

    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.display();
        obj1.msg();
        obj2.display();
        obj2.msg();
    }
}
