package SuperKeyWord;
class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
    void printMessage() {
        display(); // calls Child class display method
        super.display(); // calls Parent class display method
    }
}

public class SuperMethod {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.printMessage();
    }
}
