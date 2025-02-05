package SuperKeyWord;

class SuperClassConstructor {
    public SuperClassConstructor() {
        System.out.println("SuperClass no-arg constructor");
    }
}
class SubClassConstructor extends SuperClassConstructor {
    public SubClassConstructor() {
        System.out.println("SubClass no-arg constructor");
    }
}


public class SuperClassNoArgsConstructor {

    public static void main(String[] args) {
        SubClassConstructor obj = new SubClassConstructor();
    }
}
