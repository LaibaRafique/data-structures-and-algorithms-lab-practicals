// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package linkedlistreverse;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void add(int element) {
        Node newNode = new Node(element);
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
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class ReverseLinkedList{
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements in the list(enter -1 to stop): ");
        int element;
        while ((element = scanner.nextInt()) != -1) {
            myList.add(element);
        }
        System.out.println("Original List:");
        myList.display();
        myList.reverse();
        System.out.println("Reversed List:");
        myList.display();
        scanner.close();
    }
}
