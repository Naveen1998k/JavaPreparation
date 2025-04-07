package Enums;

class Hello{
    int x=10;
}
enum Directions /** extends Hello*/
{
    NORTH, SOUTH, EAST, WEST
}
public class Test2 {
    public static void main(String[] args) {
        System.out.println(Directions.NORTH);
    }
}
