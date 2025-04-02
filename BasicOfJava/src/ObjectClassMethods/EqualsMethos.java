package ObjectClassMethods;

public class EqualsMethos {

    private int id;
    private String name;

    public EqualsMethos(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static void main(String[] args) {

        EqualsMethos obj1 = new EqualsMethos(1, "Naveen");
        EqualsMethos obj2 = new EqualsMethos(2, "Vinay");
        EqualsMethos obj3 = new EqualsMethos(1, "Naveen");
        EqualsMethos obj4 = obj1;


        System.out.println(obj1.hashCode()); // false
        System.out.println(obj2.hashCode()); // false
        System.out.println(obj3.hashCode()); // true
        System.out.println(obj4.hashCode()); // true
        System.out.println(obj1.equals(obj2)); // false
        System.out.println(obj1.equals(obj3)); // false
        System.out.println(obj1.equals(obj4)); // true

        System.out.println(obj1==obj2); // true
        System.out.println(obj1==obj3); // false
        System.out.println(obj1==obj4); // true




//        System.out.println(obj1.equals(obj2)); // false
//
//        EqualsMethos obj3 = obj1;
//        System.out.println(obj1.equals(obj3)); // true
//
//        EqualsMethos obj4 = obj1;
//        System.out.println(obj1.equals(obj4)); // true
//
//        EqualsMethos obj5 = new EqualsMethos(1, "A");
//        System.out.println(obj1.equals(obj5)); // false
//
//        EqualsMethos obj6 = new EqualsMethos(1, "B");
//        System.out.println(obj1.equals(obj6)); // false
//
//        EqualsMethos obj7 = new EqualsMethos(2, "A");
//        System.out.println(obj1.equals(obj7)); // false
//
//        EqualsMethos obj8 = new EqualsMethos(2, "B");
//        System.out.println(obj1.equals(obj8)); // false
//
//
    }
}
