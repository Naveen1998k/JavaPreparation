package Enums;
enum  City {
    DELHI("Taj Mahal"), MUMBAI("Taj Hotel"), KOLKATA("Temples"), CHENNAI("Sambar");

        String s;
    City(String s) {
        this.s = s;
    }

    City() {
       this.s = "No message";
    }
    public String getS() {
        return s;
    }
}
public class ConstructorWithMsg {

    public static void main(String[] args) {
       City city[]=City.values();

        for (City c : City.values()) {
            System.out.println(c + " " + c.getS());
        }

        System.out.println("City: " + City.DELHI);

    }
}
