package Interface;

public class AudiCar implements Vechile {

    @Override
    public void run() {
        System.out.println("Audi is running");
    }

    @Override
    public void horn() {
        System.out.println("Audi is horning");
    }

    @Override
    public void stop() {
        System.out.println("Audi is stopped");
    }

    @Override
    public void digitalMeter() {
        System.out.println("Audi has digital meter");
    }

}
