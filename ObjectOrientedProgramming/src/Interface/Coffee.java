package Interface;

public class Coffee implements HotDrink {
    @Override
    public void prepareHotDrink() {
        System.out.println("Coffee is being prepared.");
    }
}
