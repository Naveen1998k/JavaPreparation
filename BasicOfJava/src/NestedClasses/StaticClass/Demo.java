package NestedClasses.StaticClass;

public class Demo {
    private static int x = 10;
    private int y = 20;

    static class StaticNestedClass {
        void display() {
            System.out.println("Static nested class: " + x);
            // System.out.println("Static nested class: " + y); // Cannot access non-static variable y
        }
    }

    public static void main(String[] args) {
        StaticNestedClass nested = new StaticNestedClass();
        nested.display();
    }
}
