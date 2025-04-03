package NestedClasses;

public class Outer1 {

    private int x = 10;

    public void makeInner() {
        Inner1 inner = new Inner1();
        System.out.println("Value of y: " + inner.y);
        inner.display();
    }

    class Inner1 {
        private int y = 20;
        public void display() {
            System.out.println("Value of x: " + x);
        }
    }

    public static void main(String[] args) {
        Outer1 outer = new Outer1();
       // Outer1.Inner1 inner = outer.new Inner1();
        outer.makeInner();
    }
}
