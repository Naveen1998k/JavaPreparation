package ClassAndObjects;

public class BLCOfStudent {

    public static void main(String[] args) {
        // Creating objects using new keyword and calling methods
        Student s1 = new Student();
        // Creating objects using new keyword and calling methods
        Student s2 = new Student();

        // Inserting records
        s1.insertRecord(111, "Karan", "B.Tech");
        s2.insertRecord(222, "Aryan", "B.Arch");

        // Displaying records
        s1.displayInformation();
        s2.displayInformation();
    }
}
