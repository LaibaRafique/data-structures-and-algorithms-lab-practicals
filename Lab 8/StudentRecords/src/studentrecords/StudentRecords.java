// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package studentrecords;
import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    public Student(String name,int rollNumber) {
        this.name=name;
        this.rollNumber=rollNumber;
    }
}
class Node {
    Student data;
    Node prev;
    Node next;
    public Node(Student data) {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class LinkedList {
    Node head;
    Node tail;
    public void insertFirst(Student student) {
        Node newNode=new Node(student);
        if (head==null) {
            head=tail=newNode;
        } else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void insertLast(Student student) {
        Node newNode = new Node(student);
        if (tail==null) {
            head=tail=newNode;
        } else {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void print() {
        Node current=head;
        while (current!=null) {
            System.out.println("Name: "+current.data.name + 
                    ", Roll Number: "+current.data.rollNumber);
            current=current.next;
        }
    }
}
public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedList studentList=new LinkedList();
        System.out.print("Enter name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int firstRollNumber = scanner.nextInt();
        scanner.nextLine(); 
        studentList.insertFirst(new Student(firstName, firstRollNumber));
        System.out.print("Enter name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int lastRollNumber = scanner.nextInt();
        scanner.nextLine(); 
        studentList.insertLast(new Student(lastName, lastRollNumber));
        System.out.println("\nStudent List:");
        studentList.print();
        scanner.close();
    }
}
