package NestedClasses;

public class Test {
    private int x = 10;

    class Demo{
        private int y = 20;
        public void show(){
            System.out.println("x: "+x);
            System.out.println("y: "+y);
        }

    }

    public static void main(String[] args) {

        Test t=new Test();
        Test.Demo d=t.new Demo();
        d.show();

    }
}
