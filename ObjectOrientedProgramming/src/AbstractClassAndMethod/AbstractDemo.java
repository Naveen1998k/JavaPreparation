package AbstractClassAndMethod;


abstract class AbstractClass {
    abstract void display();
    abstract void show();
}
abstract class AbstractClass1 extends AbstractClass {
    void display() {
        System.out.println("Display method");
    }
}
class AbstractClass2 extends AbstractClass1 {
    void show() {
        System.out.println("Show method");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        AbstractClass2 obj = new AbstractClass2();
        obj.display();
        obj.show();
    }
}
