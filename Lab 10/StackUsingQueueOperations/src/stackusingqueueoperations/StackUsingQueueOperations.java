// Name: Muhammad Ahmer, Roll No.: 2022F-BSE-165
package stackusingqueueoperations;
import java.util.LinkedList;
import java.util.Queue;
class StackUsingQueueOperations {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public StackUsingQueueOperations() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        queue1.offer(x);
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return queue1.poll();
    }
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return queue1.peek();
    }
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
    public static void main(String[] args) {
        StackUsingQueueOperations stack = new StackUsingQueueOperations();
        stack.push(43);
        stack.push(18);
        stack.push(7);
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.top());
    }
}
