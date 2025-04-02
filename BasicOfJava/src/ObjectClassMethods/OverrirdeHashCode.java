package ObjectClassMethods;

public class OverrirdeHashCode {

    @Override
    public int hashCode() {
        return 10;
    }

    public static void main(String[] args) {


        OverrirdeHashCode obj = new OverrirdeHashCode();
        System.out.println(obj.hashCode());

        OverrirdeHashCode obj1 = new OverrirdeHashCode();
        System.out.println(obj1.hashCode());
    }
}
