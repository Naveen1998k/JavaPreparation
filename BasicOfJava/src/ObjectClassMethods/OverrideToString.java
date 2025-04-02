package ObjectClassMethods;

public class OverrideToString {

    @Override
    public String toString() {
        return "This is the overridden toString method";
    }

    public static void main(String[] args) {


        OverrideToString obj = new OverrideToString();
        System.out.println(obj.toString());
    }
}
