package Constructor;

public class Baby
{
    private String babyName;
    private int babyAge;
    private String milkType;

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public int getBabyAge() {
        return babyAge;
    }

    public void setBabyAge(int babyAge) {
        this.babyAge = babyAge;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public Baby(String babyName, int babyAge, Milk milk) {

        this.babyName = babyName;
        this.babyAge = babyAge;

        if(milk.getMilkPrice()<=60){
            this.milkType = "Toned Milk";
        }else {
            this.milkType = "Full Cream Milk";
        }
    }

    @Override
    public String toString() {
        return "Baby{" +
                "babyName='" + babyName + '\'' +
                ", babyAge=" + babyAge +
                ", milkType='" + milkType + '\'' +
                '}';
    }
}
