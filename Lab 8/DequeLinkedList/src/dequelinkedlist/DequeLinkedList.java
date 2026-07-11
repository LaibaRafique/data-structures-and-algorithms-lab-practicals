// Name:Laiba Rafiq, Roll No:2022F-BSE-064
package dequelinkedlist;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class DequeLinkedList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Deque<Integer> dequeLinkedList=new ArrayDeque<>();
        System.out.print("Adding four elements(front of the deque): ");
        for (int i=1;i<=4;i++) {
            int ele=scanner.nextInt();
            dequeLinkedList.addFirst(ele);
        }
        System.out.println("Deque: " + dequeLinkedList);
        System.out.print("Adding three elements(end of the deque): ");
        for (int i=1;i<=3;i++) {
            int ele=scanner.nextInt();
            dequeLinkedList.addLast(ele);
        }
        System.out.println("Deque: " + dequeLinkedList);
        System.out.println("Removing two elements(front of the deque): ");
        dequeLinkedList.removeFirst();
        dequeLinkedList.removeFirst();
        System.out.println("Deque: " + dequeLinkedList);
        System.out.println("Removing two elements(end of the deque):");
        dequeLinkedList.removeLast();
        dequeLinkedList.removeLast();
        System.out.println("Deque: " + dequeLinkedList);
        System.out.print("Enter an element to search: ");
        int search=scanner.nextInt();
        System.out.println("Deque contains "+search+": " 
                +dequeLinkedList.contains(search));
        scanner.close();
    }
}
