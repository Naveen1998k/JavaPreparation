package Interface;
class BB{
    public void m1(){
        System.out.println("Method Of BB Class");
    }

}

class CC extends BB implements One{

}
public class DefaultMethodEx1 {

    public static void main(String[] args) {
   CC c=  new CC();
   c.m1();
    }
}
