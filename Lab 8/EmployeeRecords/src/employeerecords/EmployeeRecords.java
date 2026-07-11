// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package employeerecords;
import java.util.Scanner;
class Employee {
    String name;
    String designation;
    String department;
    String companyName;
    Employee(String name,String designation, 
            String department,String companyName) {
        this.name=name;
        this.designation=designation;
        this.department=department;
        this.companyName=companyName;
    }
}
class Node {
    Employee data;
    Node next;
    Node(Employee employee) {
        this.data=employee;
        this.next=null;
    }
}
class LinkedList {
    Node head;
    void insertFirst(Employee employee) {
        Node newNode=new Node(employee);
        newNode.next=head;
        head=newNode;
    }
    void insertLast(Employee employee) {
        Node newNode=new Node(employee);
        if (head==null) {
            head=newNode;
            return;
        }
        Node current=head;
        while (current.next!=null) {
            current=current.next;
        }
        current.next=newNode;
    }
    void insertMiddle(Employee employee,int position) {
        if (position<=0) {
            System.out.println("Invalid position");
            return;
        }
        if (position==1) {
            insertFirst(employee);
            return;
        }
        Node newNode=new Node(employee);
        Node current=head;
        for (int i = 1;i<position-1 && current!=null;i++) {
            current=current.next;
        }
        if (current==null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    void print() {
    Node current=head;
    int n=1;
    System.out.println("Employee Linked List");
        while (current!=null) {
            System.out.println("Employee Details "+ n +": " +current.data.name
                    +", "+current.data.designation+", "+current.data.department 
                    +", "+current.data.companyName);
            current=current.next;
            n=n+1;
        }
    }
    void search(String name) {
        Node current=head;
        int position=1;
        while (current!=null) {
            if (current.data.name.equals(name)) {
                System.out.println("Record found at position: " +position);
                System.out.println("Employee Details: " + current.data.name 
                        + ", "+ current.data.designation + ", " + 
                        current.data.department + ", " + 
                        current.data.companyName);
                return;
            }
            current=current.next;
            position++;
        }
        System.out.println("Record not found");
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        Scanner scanner=new Scanner(System.in);
        list.insertFirst(new Employee("Muhammad Ahmer", "Designer", 
                "Product Designer", "Lenaar Digital"));
        list.insertLast(new Employee("Arsal Ali", "Manager", 
                "Sales", "WSD Corporation"));
        list.insertMiddle(new Employee("Zain Khan", "Employee", 
                "IT", "542 Company"), 2);
        list.print();
        System.out.print("Enter the name to search: ");
        String s = scanner.nextLine();
        list.search(s);
    }
}
