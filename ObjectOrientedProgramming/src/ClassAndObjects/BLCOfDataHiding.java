package ClassAndObjects;

public class BLCOfDataHiding
{


    public static void main(String[] args)
    {
        DataHiding obj = new DataHiding();
       // Here we are trying to access the private variable of the other class
        // this is not possible in other classes private variables
//        obj.a = 30;
//        obj.b = 40;
        // But we can access the private variable of the other class using the getter and setter methods
        //This is called data Hiding
        System.out.println(obj.getA()); //10
        System.out.println(obj.getB()); //20
            obj.setA(-100);
            obj.setB(200);
            //after setting the values
        System.out.println(obj.getA()); //30
        System.out.println(obj.getB()); //40

    }
}
