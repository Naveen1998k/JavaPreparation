package Inheritance;
class ParentClass {

    int sum=90;
    // Method of the parent class
    public void parentMethod() {
        System.out.println("This is the parent class method");
    }
}
class  ChildClass extends ParentClass {
    int sum=100;
    // Method of the child class
    public void childMethod() {
        System.out.println("This is the child class method");
    }
}
public class SingleLevelInheritance {


    public static void main(String[] args) {
        // Creating an object of the child class
        ChildClass childClass = new ChildClass();
        // Calling the method of the parent class using the object of the child class
        childClass.parentMethod();
        // Calling the method of the child class using the object of the child class
        childClass.childMethod();

        System.out.println("Sum of parent class: "+childClass.sum);

        ParentClass p=new ChildClass();
        System.out.println("Sum of child class: "+p.sum);
    }
}
