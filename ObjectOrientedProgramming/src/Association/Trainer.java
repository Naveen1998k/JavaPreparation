package Association;

import java.util.Scanner;

public class Trainer
{

    public void viewStudent(Student student)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Id: ");
        int id=sc.nextInt();
        if(id==student.getRollNo())
        {
            System.out.println("Student Name: "+student.getStudentName());
            System.out.println("Student Roll No: "+student.getRollNo());
            System.out.println("Student Contact No: "+student.getContactNo());
        }
        else
        {
            System.out.println("Student Not Found");
        }

    }

    public static void main(String[] args) {
        Student student=new Student(1,"Rahul",1234567890);
        Student student1=new Student(2,"Ravi",9666666661L);
        Trainer trainer=new Trainer();
        trainer.viewStudent(student);
    }
}
