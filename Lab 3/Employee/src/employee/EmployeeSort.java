// Name: Muhammad Ahmer, Roll No: 2022F-BSE-165
package employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSort {
    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1011, "Arsal", "Male", 2011));
        employeeList.add(new Employee(1012, "Mirza", "Male", 2022));
        employeeList.add(new Employee(1013, "Junaid", "Male", 2018));

        //Sort employees based on joining year using Comparable
        Collections.sort(employeeList);

        //Print the sorted list
        System.out.println("Employees sorted by Joining Year (using Comparable):");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        //Sort employees based on joining year using Comparator
        Collections.sort(employeeList, Comparator.comparingInt(Employee::getYearOfJoining));

        //Print the sorted list
        System.out.println("\nEmployees sorted by Joining Year (using Comparator):");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

