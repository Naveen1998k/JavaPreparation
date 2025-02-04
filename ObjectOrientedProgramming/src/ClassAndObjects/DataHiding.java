package ClassAndObjects;

public class DataHiding {
    private int a = 10;
    private int b = 20;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        DataHiding obj = new DataHiding();
        System.out.println(obj.a); //10
        System.out.println(obj.b); //20
        //here accessing the private variable of the class
        // this is not possible in other classes

        obj.a = 30;
        obj.b = 40;
        System.out.println(obj.a); //30
        System.out.println(obj.b); //40
    }
}
