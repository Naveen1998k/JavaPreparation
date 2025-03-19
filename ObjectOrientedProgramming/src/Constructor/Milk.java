package Constructor;

public class Milk
{

    private String milkBrand;
    private double milkPrice;

    public String getMilkBrand() {
        return milkBrand;
    }

    public double getMilkPrice() {
        return milkPrice;
    }

    public Milk(String milkBrand, double milkPrice) {
        this.milkBrand = milkBrand;
        this.milkPrice = milkPrice;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "milkBrand='" + milkBrand + '\'' +
                ", milkPrice=" + milkPrice +
                '}';
    }
}
