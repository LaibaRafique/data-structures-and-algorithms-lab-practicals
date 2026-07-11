// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package queueusingstacks;
import java.util.Stack;
class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enqueue(int x) {
        s1.push(x);
    }
    Integer dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(4);
        queue.enqueue(11);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        queue.enqueue(2);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 

    }
}
