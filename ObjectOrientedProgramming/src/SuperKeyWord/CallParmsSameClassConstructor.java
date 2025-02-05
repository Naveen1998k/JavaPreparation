package SuperKeyWord;

public class CallParmsSameClassConstructor {
    public CallParmsSameClassConstructor() {
        this(10);
        System.out.println("SuperClass no-arg constructor");
    }
    public CallParmsSameClassConstructor(int i) {
        System.out.println("SuperClass param constructor "+i);
    }
    public static void main(String[] args) {
        CallParmsSameClassConstructor obj = new CallParmsSameClassConstructor();
    }
}
