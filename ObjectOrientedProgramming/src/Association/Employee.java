package Association;

public class Employee {

    private String name;
    private int empId;
    // Association - Address has a relationship with Employee
    private Address address;

    public Employee(String name, int empId, Address address) {
        this.name = name;
        this.empId = empId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", address=" + address +
                '}';
    }
}
