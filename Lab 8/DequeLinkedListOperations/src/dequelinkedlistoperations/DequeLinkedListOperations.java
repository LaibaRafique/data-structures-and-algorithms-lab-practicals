// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package dequelinkedlistoperations;
import java.util.Scanner;
class Node {
    int data;
    Node prev;
    Node next;
    public Node(int data) {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class DequeOperations {
    Node front;
    Node rear;
    public void addFirst(int value) {
        Node newNode=new Node(value);
        if (front==null) {
            front=rear=newNode;
        } else {
            newNode.next=front;
            front.prev=newNode;
            front=newNode;
        }
    }
    public void addLast(int value) {
        Node newNode=new Node(value);
        if (rear==null) {
            front=rear=newNode;
        } else {
            newNode.prev=rear;
            rear.next=newNode;
            rear=newNode;
        }
    }
    public void removeFirst() {
        if (front==null) {
            System.out.println("Deque is empty");
            return;
        }
        front=front.next;
        if (front!=null) {
            front.prev=null;
        } else {
            rear=null; 
        }
    }
    public void removeLast() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return;
        }
        rear=rear.prev;
        if (rear!=null) {
            rear.next=null;
        } else {
            front=null; 
        }
    }
    public boolean search(int value) {
        Node current=front;
        while (current!=null) {
            if (current.data==value) {
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public void display() {
        Node current=front;
        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
public class DequeLinkedListOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DequeOperations deque=new DequeOperations();
        System.out.print("Adding two elements to the front of the deque: ");
        for (int i=0;i<2;i++) {
            int element=scanner.nextInt();
            deque.addFirst(element);
        }
        System.out.print("Deque: ");
        deque.display();
        System.out.print("Adding four elements to the end of the deque: ");
        for (int i=0;i<4;i++) {
            int element=scanner.nextInt();
            deque.addLast(element);
        }
        System.out.print("Deque: ");
        deque.display();
        System.out.println("Removing two elements from the front of the deque:");
        deque.removeFirst();
        deque.removeFirst();
        System.out.print("Deque after changes: ");
        deque.display();
        System.out.println("Removing two elements from the end of the deque:");
        deque.removeLast();
        deque.removeLast();
        System.out.print("Deque after changes: ");
        deque.display();
        System.out.print("Enter an element to search: ");
        int check=scanner.nextInt();
        System.out.print("Deque has the element "+check+": " 
                +deque.search(check));
        System.out.println("");
        scanner.close();
    }
}
