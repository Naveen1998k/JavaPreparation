package FinalKeyword;
class Foo {
    final int x = 10;
     void show() {
        System.out.println("Parent's show()");
    }
    public void setData(int a){
        //
        // x=a;
    }
}
public class FinalVar {
    public static void main(String[] args) {
        Foo obj = new Foo();
        obj.show();
        obj.setData(20);
        System.out.println(obj.x);
    }
}
