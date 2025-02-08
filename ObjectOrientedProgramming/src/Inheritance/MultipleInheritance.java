package Inheritance;

 class ParentClass11 {
    void display() {
        System.out.println("Parent Class 1");
    }
}
class ParentClass2 {
    void display() {
        System.out.println("Parent Class 2");
    }
}
class ChildClass11 extends ParentClass11 //, ParentClass2 //Error: Multiple inheritance is not supported in Java
{  void display() {
        System.out.println("Child Class");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();

    }
}
