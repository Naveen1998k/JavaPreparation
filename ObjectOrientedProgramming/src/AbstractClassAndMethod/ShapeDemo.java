package AbstractClassAndMethod;

import java.util.Scanner;

abstract class ShapeOne {
    Scanner sc = new Scanner(System.in);
    abstract void input();
    abstract void area();
}

class RectangleOne extends ShapeOne {
    private int length, breadth;

    @Override
    void input() {
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
    }

    void area() {
       double area = length * breadth;
         System.out.println("Area of Rectangle: " + area);
    }
}

class SquareOne extends ShapeOne {
    private int side;

    @Override
    void input() {
        System.out.print("Enter side: ");
        int side = sc.nextInt();
    }

    void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
class CircleOne extends ShapeOne {
    private int radius;

    @Override
    void input() {
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeDemo {

    public static void main(String[] args) {
        ShapeOne s;
        s = new RectangleOne();
        s.input();s.area();
        s= new SquareOne();
        s.input();s.area();
        s= new CircleOne();
        s.input();s.area();
    }
}
