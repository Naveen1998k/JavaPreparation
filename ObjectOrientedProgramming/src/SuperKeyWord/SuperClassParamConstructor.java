package SuperKeyWord;

class SuperClassParamConstructor1 {
    public SuperClassParamConstructor1(int i) {
        System.out.println("SuperClass param constructor "+i);
    }
}
class SubClassParamConstructor1 extends SuperClassParamConstructor1 {
    public SubClassParamConstructor1() {
        super(10);
        System.out.println("SubClass no-arg constructor");
    }
}
public class SuperClassParamConstructor {

    public static void main(String[] args) {
        SubClassParamConstructor1 obj = new SubClassParamConstructor1();
    }
}
