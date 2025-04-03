package NestedClasses;

public class Outer {


    private int x ;
    private String name;

    public Outer(int x, String name) {
        this.x = x;
        this.name = name;
    }

    class Inner{
        private int y;
        private int x;
        private String name;

        public Inner(int y, String name, int x) {
            this.y = y;
            this.name = name;
            this.x = x;
        }

        public void show(){
            System.out.println("Outer x: "+Outer.this.x);
            System.out.println("Outer name: "+Outer.this.name);
            System.out.println("Inner y: "+y);
            System.out.println("Inner name: "+name);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer(10, "Outer");
        Outer.Inner inner = outer.new Inner(11, "Inner", 12);
        inner.show();
    }
}
