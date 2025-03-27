package Interface;

public interface DefaultMethodEx {

    void show();

    default void run(){
        System.out.println("Default Method inside Interface");
    }

    static void getSpeed(){
        System.out.println("Speed is calculated using distance and time");
    }
}
