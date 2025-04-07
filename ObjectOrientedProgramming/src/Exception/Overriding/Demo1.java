package Exception.Overriding;


class Parent1 {
    void show() {
        System.out.println("Parent class method");
    }
}
class Child1 extends Parent1 {
    void show() throws ArithmeticException { // overriding method
        System.out.println("Child class method");
    }
}
public class Demo1 {


    public static void main(String[] args) {
        Parent1 p = new Child1(); // Parent reference and child object
        p.show(); // It will call the child class method
        // Child1 c = new Parent1(); // Compile time error: incompatible types
        // c.show(); // It will call the parent class method
    }
}
