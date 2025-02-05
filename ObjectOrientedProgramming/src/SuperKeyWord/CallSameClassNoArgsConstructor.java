package SuperKeyWord;


public class CallSameClassNoArgsConstructor
{

    public CallSameClassNoArgsConstructor() {
        System.out.println("SuperClass no-arg constructor");
    }
    public CallSameClassNoArgsConstructor(int i) {
        this();
        System.out.println("SuperClass param constructor "+i);
    }
    public static void main(String[] args) {
        CallSameClassNoArgsConstructor obj = new CallSameClassNoArgsConstructor(10);
    }
}
