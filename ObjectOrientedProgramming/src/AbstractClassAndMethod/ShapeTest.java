package AbstractClassAndMethod;

 abstract class Shape {
     abstract void draw();
 }

 class Circle extends Shape {

     @Override
     void draw() {
            System.out.println("Drawing Circle");
     }
 }
 class Rectangle extends Shape {
     void draw() {
         System.out.println("Drawing Rectangle");
     }
 }
 class Triangle extends Shape {
     void draw() {
         System.out.println("Drawing Triangle");
     }
 }
 public class ShapeTest {
     public static void main(String[] args) {
         Shape s = new Circle();
         s.draw();
         s = new Rectangle();
         s.draw();
         s = new Triangle();
         s.draw();
     }
 }
