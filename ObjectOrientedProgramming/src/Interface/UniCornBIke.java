package Interface;

public class UniCornBIke implements Vechile{

    @Override
    public void run() {
        System.out.println("Unicorn is running");
    }

    @Override
    public void horn() {
        System.out.println("Unicorn is horning");

    }

    @Override
    public void stop() {
        System.out.println("Unicorn is stopped");
    }

    @Override
    public void digitalMeter() {
        System.out.println("Unicorn has digital meter");
    }
}
