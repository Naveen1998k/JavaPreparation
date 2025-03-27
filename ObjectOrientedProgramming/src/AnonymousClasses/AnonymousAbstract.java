package AnonymousClasses;
abstract class Shape{
    abstract void draw();
}
public class AnonymousAbstract {

    public static void main(String[] args) {
        Shape rect=new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a Rectangle");
            }
        };

        Shape square=new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing a Square");

            }
        };

        rect.draw();square.draw();
    }
}
