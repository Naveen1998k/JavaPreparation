package Interface;

public class Kitchen {
    public static void main(String[] args) {
        Restarant restarant = new Restarant();
        restarant.createHotDrink(new Horlicks());
        restarant.createHotDrink(new Coffee());
        restarant.createHotDrink(new Tea());
    }
}
