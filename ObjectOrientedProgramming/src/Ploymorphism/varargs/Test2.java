package Ploymorphism.varargs;
// Program On  var-args to show that we can accept Heterogeneous elements using Object type var-arg parameter
public class Test2
{
    public void m1(Object... x) {
        System.out.println("Object var-arg method");
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.m1();
        t.m1(10);
        t.m1(10,20);
        t.m1(10,20,30,40,50,60,70,80,90,100,10.5f,"durga",true,'a',null,t,"Naveen");
    }

}
