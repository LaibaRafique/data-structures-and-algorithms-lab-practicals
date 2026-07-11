// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package studentsrecords;
import java.util.Scanner;
class Student {
    int rollNumber;
    String name;
    float marks;
    public Student(int rollNumber, String name, float marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name 
                + ", Marks: " + marks;
    }
}
class Node {
    Student data;
    Node next;
    public Node(Student student) {
        this.data = student;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void add(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void insert(Student student, int position) {
        Node newNode = new Node(student);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("Invalid position");
            }
        }
    }
    public void search(int rollNumber) {
        Node current = head;
        while (current != null) {
            if (current.data.rollNumber == rollNumber) {
                System.out.println("Student found: " + current.data);
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found with Roll Number: " + rollNumber);
    }
    public void delete(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNumber 
                    + " deleted");
            return;
        }
        Node current = head;
        while (current.next != null && 
                current.next.data.rollNumber != rollNumber) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Student with Roll Number " 
                    + rollNumber + " deleted");
        } else {
            System.out.println("Student not found with Roll Number: " 
                    + rollNumber);
        }
    }
}
public class StudentsRecords {
    public static void main(String[] args) {
        LinkedList studentList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Student " + i);
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Marks: ");
            float marks = scanner.nextFloat();
            scanner.nextLine();

            Student student = new Student(rollNumber, name, marks);
            studentList.add(student);
        }
        char choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("a. View the list");
            System.out.println("b. Insert elements at different "
                    + "locations and view the list");
            System.out.println("c. Search for a student");
            System.out.println("d. Delete a record and view the list");
            System.out.println("e. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            switch(choice) {
                case 'a':
                    System.out.println("Student List:");
                    studentList.display();
                    break;
                case 'b':
                    System.out.print("Enter position to insert (1-10): ");
                    int position = scanner.nextInt();
                    System.out.println("Enter details for the new student");
                    System.out.print("Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Marks: ");
                    float marks = scanner.nextFloat();
                    scanner.nextLine(); 

                    Student newStudent = new Student(rollNumber, name, marks);
                    studentList.insert(newStudent, position);
                    System.out.println("Student inserted at position " 
                            + position);
                    System.out.println("Updated Student List:");
                    studentList.display();
                    break;
                case 'c':
                    System.out.print("Enter Roll Number to search: ");
                    int searchRollNumber = scanner.nextInt();
                    studentList.search(searchRollNumber);
                    break;
                case 'd':
                    System.out.print("Enter Roll Number to delete: ");
                    int deleteRollNumber = scanner.nextInt();
                    studentList.delete(deleteRollNumber);
                    System.out.println("Updated Student List:");
                    studentList.display();
                    break;
                case 'e':
                    System.out.println("Program End!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a "
                            + "valid option.");
            }
        } while (choice != 'e');
        scanner.close();
    }
}
