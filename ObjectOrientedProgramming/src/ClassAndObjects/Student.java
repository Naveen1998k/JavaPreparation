package ClassAndObjects;

public class Student
{

    // instance variables
    int rollNo;
    String name;
    String course;
    static String college = "ABC College";

    public void insertRecord(int r, String n, String c) {
        rollNo = r;
        name = n;
        course = c;

    }

    public void displayInformation() {
        System.out.println(rollNo + " " + name + " " + course + " " + college);
    }
}
