package AbstractClassAndMethod;
abstract class Car{

    int speed=100;
    public Car(){
        System.out.println("Car is created");
    }
    public void getDisplay(){
        System.out.println("Speed is "+speed);
    }
    public abstract void run();
}
class Audi extends Car{
    public Audi(){
        System.out.println("Audi is created");
    }
    public void run(){
        System.out.println("Audi is running");
    }
}

public class IQ {
    public static void main(String[] args) {
        Car c = new Audi();
        c.run();
        c.getDisplay();
        System.out.println(c.speed);
    }


}
