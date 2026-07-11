// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package employeesrecords;
import java.util.Scanner;
class Person {
    String name;
    int age;
    double salary;
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}
class Node {
    Person data;
    Node next;
    public Node(Person person) {
        this.data = person;
        this.next = null;
    }
}
class PersonLinkedList {
    Node head;
    public void add(Person person) {
        Node newNode = new Node(person);
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
    public void insert(Person person, int position) {
        Node newNode = new Node(person);
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
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 1) {
            head = head.next;
            System.out.println("Person deleted at position " + position);
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
            System.out.println("Person deleted at position " + position);
        } else {
            System.out.println("Invalid position");
        }
    }
}
public class EmployeesRecords {
    public static void main(String[] args) {
        PersonLinkedList personList = new PersonLinkedList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Person " + i);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 
            Person person = new Person(name, age, salary);
            personList.add(person);
        }
        char choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("a. Insert elements at different locations "
                    + "and view the list");
            System.out.println("b. Delete a record and view the list");
            System.out.println("c. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    System.out.print("Enter position to insert (1-10): ");
                    int insertPosition = scanner.nextInt();
                    System.out.println("Enter details for the new person");
                    System.out.print("Name: ");
                    scanner.nextLine(); 
                    String insertName = scanner.nextLine();
                    System.out.print("Age: ");
                    int insertAge = scanner.nextInt();
                    System.out.print("Salary: ");
                    double insertSalary = scanner.nextDouble();
                    scanner.nextLine(); 

                    Person newPerson = new Person(insertName, insertAge, 
                            insertSalary);
                    personList.insert(newPerson, insertPosition);
                    System.out.println("Person inserted at position " + 
                            insertPosition);
                    System.out.println("Updated Person List:");
                    personList.display();
                    break;
                case 'b':
                    System.out.print("Enter position to delete (1-10): ");
                    int deletePosition = scanner.nextInt();
                    personList.delete(deletePosition);
                    System.out.println("Updated Person List:");
                    personList.display();
                    break;
                case 'c':
                    System.out.println("Program End!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a "
                            + "valid option.");
            }
        } while (choice != 'c');
        scanner.close();
    }
}
