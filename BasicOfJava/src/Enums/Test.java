package Enums;

public class Test {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        System.out.println("Enum values:"+Day.values());

        System.out.println("Enum name:"+Day.MONDAY);


        Color c1=Color.BLUE;
        Color c2=Color.BLUE;


        if (c1==c2) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are different");
        }

        if (c1.equals(c2)) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are different");
        }
    }
}
