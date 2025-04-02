package ObjectClassMethods;

public class ToString {

    public static void main(String[] args) {

        ToString obj = new ToString();
        System.out.println(obj.toString());

        //ObjectClassMethods.ToString@6acbcfc0
        //getClass().getName() + "@" + Integer.toHexString(hashCode())
        ToString obj1 = new ToString();
        System.out.println(obj1.toString());
    }
}
