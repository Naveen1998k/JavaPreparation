package Ploymorphism.MethodOverriding;

class  SuperClass {
    public static void display() {
        System.out.println("Static method from SuperClass");
    }
}
class SubClass extends SuperClass {
    public static void display() {
        System.out.println("Static method from SubClass");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.display();
    }
}
