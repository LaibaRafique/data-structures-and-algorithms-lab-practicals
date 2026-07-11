// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package queueusinglinkedlist;
import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(11);
        queue.offer(7);
        queue.offer(1);
        System.out.println("Queue elements: " + queue);
        int frontElement = queue.poll();
        System.out.println("Removed front element: " + frontElement);
        System.out.println("Updated queue elements: " + queue);
        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Size of the queue: " + queue.size());
        int peekedElement = queue.peek();
        System.out.println("Front element (peeked): " + peekedElement);
        System.out.println("Final queue elements: " + queue);
    }
}
