package JVM.RuntimeDataArea;

class Student {
    int id;
    String name;
}
class Employee {
    int id;
    String name;
}

class Player {
    int id;
    String name;
}
public class ClassAsRunTime {

    public static void main(String[] args) {
        Class cls=Student.class;

        System.out.println(cls.getName());

        cls=Employee.class;
        System.out.println(cls.getName());

        cls=Player.class;
        System.out.println(cls.getName());
    }
}
