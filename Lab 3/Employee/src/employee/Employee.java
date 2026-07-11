// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package employee;
public class Employee implements Comparable<Employee> {

    private int empId;
    private String empName;
    private String empGender;
    private int yearOfJoining;

    // Constructor
    public Employee(int empId, String empName, 
            String empGender, int yearOfJoining) {
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.yearOfJoining = yearOfJoining;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpGender() {
        return empGender;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.yearOfJoining, 
                otherEmployee.yearOfJoining);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId= " + empId +
                ", empName= " + empName +
                ", empGender= " + empGender +
                ", yearOfJoining= " + yearOfJoining +
                '}';
    }
}
