// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package doubleendedqueue;
import java.util.ArrayDeque;
import java.util.Deque;
public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(13);
        deque.offerFirst(6);
        deque.offerFirst(9);
        deque.offerLast(21);
        deque.offerLast(3);
        deque.offerLast(0);
        System.out.println("Double-ended queue elements: " + deque);
        int removedFromFront = deque.pollFirst();
        int removedFromRear = deque.pollLast();
        System.out.println("Removed from front: " + removedFromFront);
        System.out.println("Removed from rear: " + removedFromRear);
        System.out.println("Updated double-ended queue elements: " + deque);
    }
}
