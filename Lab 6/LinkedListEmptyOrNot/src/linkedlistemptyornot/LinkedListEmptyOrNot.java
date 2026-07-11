// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package linkedlistemptyornot;
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
    public boolean isEmpty() {
        return head == null;
    }
}
public class LinkedListEmptyOrNot {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        if (myList.isEmpty()) {
            System.out.println("Empty Linked-List.");
        } else {
            System.out.println("Not-Empty Linked-List.");
        }
        myList.head = new Node(16);
        if (myList.isEmpty()) {
            System.out.println("Empty Linked-List.");
        } else {
            System.out.println("Not-Empty Linked-List.");
        }
    }
}
