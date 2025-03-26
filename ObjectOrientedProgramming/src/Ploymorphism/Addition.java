package Ploymorphism;

public class Addition {

//    int a;
//    int b;
   public Addition(int a, int b)
    {
        System.out.println("Addition of two numbers: "+(a+b));
    }
    public Addition(int a, int b,int c)
    {
        System.out.println("Addition of Three numbers: "+(a+b+c));
    }
    public Addition(float a, float b)
    {
        System.out.println("Addition of Two float numbers: "+(a+b));
    }

    public static void main(String[] args) {
        Addition add=new Addition(10,10);
        Addition add1=new Addition(10,20,30);

    }

}
