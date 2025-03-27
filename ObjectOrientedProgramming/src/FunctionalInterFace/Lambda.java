package FunctionalInterFace;

@FunctionalInterface
interface Move{

    void run();
}
public class Lambda {


    public static void main(String[] args) {
        Move car= ()-> System.out.println("Car IS Started");

        car.run();

        Move bike= ()-> System.out.println("Bike Is Started");bike.run();

    }

}
