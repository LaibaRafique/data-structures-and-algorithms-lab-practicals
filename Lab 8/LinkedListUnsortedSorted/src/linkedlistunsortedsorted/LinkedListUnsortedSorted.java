// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package linkedlistunsortedsorted;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        this.next=null;
    }
}
class UnsortedLinkedList {
    Node head;
    public void insertunsorted(int value) {
        Node newNode = new Node(value);
        if (head==null) {
            head=newNode;
        } else {
            Node current=head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void display() {
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
class SortedLinkedList {
    Node head;
    public void insertSorted(int value) {
        Node newNode=new Node(value);
        if (head==null || value<head.data) {
            newNode.next = head;
            head=newNode;
        } else {
            Node current=head;
            while (current.next!=null && current.next.data<value) {
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
    }
    public void display() {
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
public class LinkedListUnsortedSorted {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        UnsortedLinkedList unsortedList=new UnsortedLinkedList();
        SortedLinkedList sortedList=new SortedLinkedList();
        System.out.print("Enter elements "+"(enter -1 to stop):");
        int value;
        while ((value=scanner.nextInt())!=-1) {
            unsortedList.insertunsorted(value);
        }
        System.out.println("Unsorted Linked List:");
        unsortedList.display();
        System.out.print("Enter elements "+"(enter -1 to stop):");
        while ((value=scanner.nextInt())!=-1) {
            sortedList.insertSorted(value);
        }
        System.out.println("Sorted Linked List:");
        sortedList.display();
        scanner.close();
    }
}
