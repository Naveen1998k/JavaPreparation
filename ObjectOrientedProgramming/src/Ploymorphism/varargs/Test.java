package Ploymorphism.varargs;

public class Test {

    public void input(int... a) {
        System.out.println("Length of a: " + a.length);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("*******************************************");
        t.input(1, 2, 3, 4, 5);
        System.out.println("*******************************************");
        t.input(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("*******************************************");
        t.input(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
    }
}
