package Day1;

import java.util.Scanner;

public class Student
{



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String gender= sc.next();

        if(gender.equalsIgnoreCase("Male")){
            System.out.println("Left");
        }else{
            System.out.println("Right");
        }
    }
}
