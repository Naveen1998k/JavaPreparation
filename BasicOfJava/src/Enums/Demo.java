package Enums;
enum Season {
    WINTER{
        @Override
        public String toString() {
            return "Winter is cold";
        }
    }, SPRING, SUMMER, FALL;

    Season() {
        System.out.println("Constructor called for: " + this.toString());
    }
}
public class Demo {

    public static void main(String[] args) {
        System.out.println(Season.WINTER);
    }
}
