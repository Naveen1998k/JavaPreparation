package Ploymorphism.varargs;

class SuperClass {
    public void display(int ...a) {
        System.out.println("Non-static method from SuperClass"+a[0]);
    }
}
class SubClass extends SuperClass {

    public void display(int a) {
        System.out.println("Non-static method from SubClass"+a);
    }
}

public class OverLoading {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.display(1);
    }
}
