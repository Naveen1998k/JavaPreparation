package Exception.Overriding;

import java.io.FileNotFoundException;

class Parent{

    void show() {
        System.out.println("Parent class");
    }
}
class Child extends Parent{

    void show() /**throws InterruptedException */ {
        System.out.println("Child class");
    }
}
public class Demo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show(); // Output: Parent class

        Child c = new Child();
        c.show(); // Output: Child class

        Parent p1 = new Child();
        p1.show(); // Output: Child class

        // Uncommenting the following line will cause a compile-time error
        // because the method in the child class throws a checked exception
        // p1.show(); // Compile-time error: unreported exception InterruptedException; must be caught or declared to be thrown
    }
}
