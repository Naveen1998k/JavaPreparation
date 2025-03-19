package Constructor;

public class MilkMain {

    public static void main(String[] args) {
        Milk milk = new Milk("Amul", 50);
        Baby baby = new Baby("Rohan", 2, milk);
        System.out.println(baby);
    }
}
