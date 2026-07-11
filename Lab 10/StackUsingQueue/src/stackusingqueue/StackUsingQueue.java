// Name: Laiba Rafiq, Roll Number: 2022F-BSE-064
package stackusingqueue;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public StackUsingQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int value) {
        if (queue1.isEmpty()) {
            queue1.offer(value);
        } else {
            while (!queue1.isEmpty()) {
                queue2.offer(queue1.poll());
            }
            queue1.offer(value);
            while (!queue2.isEmpty()) {
                queue1.offer(queue2.poll());
            }
        }
        System.out.println("Pushed: " + value);
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int poppedValue = queue1.poll();
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        }
    }
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(7);
        stack.push(13);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.push(22);
        stack.push(6);
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
