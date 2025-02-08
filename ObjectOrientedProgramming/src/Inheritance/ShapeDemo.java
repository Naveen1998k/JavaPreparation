package Inheritance;

import java.text.DecimalFormat;

class Shape {
    protected int x;

    Shape(int x){
        this.x=x;
    }
}
class Square extends Shape{
    Square(int x){
        super(x);
    }
    public int areaOfSquare(){
        return x*x;
    }
}


class Circle extends Shape{

     final double PI = 3.14;
    Circle(int radius){
        super(radius);
    }
    public double areaOfCircle(){
        return PI*x*x;
    }
}

class Rectangle extends Shape{
    protected int breadth;
    Rectangle(int x, int breadth){
        super(x);
        this.breadth=breadth;
    }
    public int areaOfRectangle(){
        return x*breadth;
    }
}
public class ShapeDemo{

    public static void main(String[] args) {
        Square s = new Square(4);
        System.out.println("Area of Square: "+s.areaOfSquare());

        System.out.println("-------------------------------------------------------------------");
        Circle c = new Circle(4);
        System.out.println("Area of Circle: "+c.areaOfCircle());

        DecimalFormat df = new DecimalFormat("000.000");
        System.out.println("Area of Circle: "+df.format(c.areaOfCircle()));
        System.out.println("-------------------------------------------------------------------");
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area of Rectangle: "+r.areaOfRectangle());
    }
}
