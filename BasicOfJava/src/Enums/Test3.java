package Enums;

import ObjectClassMethods.Manager;

public class Test3
{
    enum Season{
        SPRING,WINTER,SUMMER,FALL;




    }

    public static void main(String[] args) {
        Season s[]= Season.values();

        for(Season s1:s)
        {
            System.out.println(s1);
        }
    }


}
