package Association;

public class Student
{
    private  int rollNo;
    private String studentName;
    private long contactNo;

    public Student(int rollNo, String studentName, long contactNo)
    {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.contactNo = contactNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", contactNo=" + contactNo +
                '}';
    }
}
