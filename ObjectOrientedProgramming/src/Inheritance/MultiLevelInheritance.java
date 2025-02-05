package Inheritance;

class GrandParentClass {
    // Method of the grandparent class
    public void grandParentMethod() {
        System.out.println("This is the grandparent class method");
    }
}
class ParentClass1 extends GrandParentClass {
    // Method of the parent class
    public void parentMethod() {
        System.out.println("This is the parent class method");
    }
}
class ChildClass1 extends ParentClass1 {
    // Method of the child class
    public void childMethod() {
        System.out.println("This is the child class method");
    }
}

public class MultiLevelInheritance {


    public static void main(String[] args) {
        // Creating an object of the child class
        ChildClass1 childClass = new ChildClass1();
        // Calling the method of the grandparent class using the object of the child class
        childClass.grandParentMethod();
        childClass.parentMethod();
        childClass.childMethod();
    }
}