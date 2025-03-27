package FunctionalInterFace;

@FunctionalInterface
interface Calculate{
    int  add(int a,int b);
}
public class Lambda1 {
    public static void main(String[] args) {
        Calculate add= (a, b) ->  a+b;
            System.out.println(  add.add(10,10));

            Calculate substrasction= (a,b)-> a-b;

            System.out.println(substrasction.add(20,10));

    }
}
