package Interface;

public class Tea implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Tea is being prepared.");
    }
}
