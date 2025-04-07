package Enums;

public class Test1 {

    static enum Season { //private public protected static
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        System.out.println("All seasons:"+Season.SPRING);
    }
}
