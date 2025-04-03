package NestedClasses.StaticClass;


class Outer{

    static class Inner{
        void display(){
            System.out.println("Hello from static inner class");
        }
    }

    public static void main(String[] args) {
        Inner in=new Inner();
        in.display();
    }
}
public class Test {

    public static void main(String[] args) {
        Outer.Inner in=new Outer.Inner();
        in.display();
    }
}
