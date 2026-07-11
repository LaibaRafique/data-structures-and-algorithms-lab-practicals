// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package dlloperations;
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
class DoublyLinkedList {
    Node head;
    Node tail;
    public void insertAtBeginning(int value) {
        Node newNode=new Node(value);
        if (head==null) {
            head=tail=newNode;
        } else {
            newNode.next = head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (tail==null) {
            head=tail=newNode;
        } else {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void deleteFromBeginning() {
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        if (head!=null) {
            head.prev=null;
        } else {
            tail=null;
        }
    }
    public void deleteFromEnd() {
        if (tail==null) {
            System.out.println("List is empty");
            return;
        }
        tail=tail.prev;
        if (tail!=null) {
            tail.next=null;
        } else {
            head=null; 
        }
    }
    public void display() {
        System.out.print("Displaying List: ");
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
public class DLLOperations {
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertAtBeginning(165);
        list.display();
        list.insertAtBeginning(77);
        list.display();
        list.insertAtEnd(55);
        list.display();
        list.deleteFromBeginning();
        list.display();
        list.deleteFromEnd();
        list.display();
    }
}
