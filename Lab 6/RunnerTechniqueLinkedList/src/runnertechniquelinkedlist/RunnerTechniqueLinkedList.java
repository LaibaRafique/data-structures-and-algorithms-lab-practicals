// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package runnertechniquelinkedlist;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class RunnerTechniqueLinkedList {
    static Node mergeLists(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            System.out.println("Error: Both lists should be non-empty");
            return null;
        }
        Node mergedHead = new Node(0); 
        Node current = mergedHead;
        Node runner1 = head1;
        Node runner2 = head2;
        while (runner1 != null && runner2 != null) {
            current.next = runner1;
            runner1 = runner1.next;
            current = current.next;
            current.next = runner2;
            runner2 = runner2.next;
            current = current.next;
        }
        if (runner1 != null) {
            current.next = runner1;
        } else if (runner2 != null) {
            current.next = runner2;
        }
        return mergedHead.next; 
    }
    static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node list1 = new Node(17);
        list1.next = new Node(19);
        list1.next.next = new Node(21);
        Node list2 = new Node(18);
        list2.next = new Node(20);
        list2.next.next = new Node(22);
        System.out.println("List 1:");
        display(list1);
        System.out.println("List 2:");
        display(list2);
        Node mergedList = mergeLists(list1, list2);
        System.out.println("Updated List (Merged):");
        display(mergedList);
    }
}
