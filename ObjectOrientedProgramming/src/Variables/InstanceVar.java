package Variables;

public class InstanceVar
{
    //diff  between instance and static variable

    int  a = 10; //instance variable
    static int b = 20; //static variable

   public static void main(String[]args){
         InstanceVar obj = new InstanceVar();
       InstanceVar obj1 = new InstanceVar();
            System.out.println(obj.a); //10
            System.out.println(b); //20
       //changing the value of instance variable
       ++obj.a;
       --obj1.a;

         System.out.println(obj.a); //11
       System.out.println(obj1.a); //9
// changing the value of static variable
       ++obj.b;

       ++obj1.b;
         System.out.println(obj.b); //20
       System.out.println(obj1.b);


    }
}
