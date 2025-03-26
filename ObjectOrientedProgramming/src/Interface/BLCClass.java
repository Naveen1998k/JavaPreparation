package Interface;

public class BLCClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
        System.out.println("Speed: " + Moveable.SPEED);
    }


}
