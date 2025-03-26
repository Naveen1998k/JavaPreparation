package FinalKeyword;
final class A {
    private int x=10;
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}// This class cannot be inherited
//class B extends A {
//    // This class cannot be inherited
//}
public class FinalClass {

    public static void main(String[] args) {
        A obj = new A();
        obj.setX(20);
        System.out.println(obj.getX());
    }
}
