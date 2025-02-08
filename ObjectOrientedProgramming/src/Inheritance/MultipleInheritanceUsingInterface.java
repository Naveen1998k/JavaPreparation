package Inheritance;

interface ParentInterface1 {
   default void display(){
        System.out.println("Parent Interface 1");
    }
}
interface ParentInterface2 {
    default void display(){
        System.out.println("Parent Interface 2");
    }
}
class ChildClass12 implements ParentInterface1, ParentInterface2 {
    public void display() {
        System.out.println("Child Class");
        ParentInterface1.super.display();
        ParentInterface2.super.display();
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        ChildClass12 obj = new ChildClass12();
        obj.display();
    }
}
