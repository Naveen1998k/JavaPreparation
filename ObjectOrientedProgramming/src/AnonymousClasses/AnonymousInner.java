package AnonymousClasses;
interface Vechile{
    void run();
}
public class AnonymousInner {
    public static void main(String[] args) {
        Vechile car=new Vechile() {
            @Override
            public void run() {
                System.out.println("Car is Running");
            }
        };
        car.run();

        Vechile bike=new Vechile() {
            @Override
            public void run() {
                System.out.println("Bike is Starting");
            }
        };bike.run();
    }
}
