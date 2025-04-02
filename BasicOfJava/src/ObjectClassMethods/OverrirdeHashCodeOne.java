package ObjectClassMethods;

public class OverrirdeHashCodeOne {

    int id=10;

    public OverrirdeHashCodeOne(int id) {
        this.id = id;
    }

    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "OverrirdeHashCodeOne{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        OverrirdeHashCodeOne obj = new OverrirdeHashCodeOne(2001);
        System.out.println(obj.hashCode());

        OverrirdeHashCodeOne obj1 = new OverrirdeHashCodeOne(1999);
        System.out.println(obj1.hashCode());

        System.out.println(obj);
    }
}
