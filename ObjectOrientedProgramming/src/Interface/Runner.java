package Interface;

public class Runner implements DefaultMethodEx{
    @Override
    public void show() {
        System.out.println("Show method inside Runner Class");
    }

    @Override
    public void run() {
        System.out.println("Default Method inside Runner");
    }
}
