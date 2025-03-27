package Interface;
interface A{
    void show();
}
interface B{
    void show();
}
class C implements One,B{
    public void show(){
        System.out.println("Hello");
    }
}
public class MultipleInhertaince {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
