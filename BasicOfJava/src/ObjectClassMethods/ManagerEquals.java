package ObjectClassMethods;

public class ManagerEquals {

    public static void main(String[] args) {
        Manager m1 = new Manager(1, "John");
        Manager m2 = new Manager(1, "John");
        Manager m3=new Manager(2,"Naveen");

        System.out.println(m1.equals(m2)); // true
        System.out.println(m1.equals(m3)); // false
    }
}
