package FunctionalInterFace;
@FunctionalInterface
interface Length{
    int getLength(String str);
}
public class Lambda2 {
    public static void main(String[] args) {
        Length res= str -> str.length();


        System.out.println( res.getLength("Naveen"));

        //Method ref

        Length response = String::length;
        System.out.println(response.getLength("Krishna Kumar reddy"));
    }
}
