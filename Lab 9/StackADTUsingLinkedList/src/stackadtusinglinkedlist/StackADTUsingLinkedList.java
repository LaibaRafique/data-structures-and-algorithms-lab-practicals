// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package stackadtusinglinkedlist;
import java.util.LinkedList;
class Stack<T> {
    private LinkedList<T> list;
    public Stack() {
        list = new LinkedList<>();
    }
    public void push(T item) {
        list.addFirst(item);
    }
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
}
public class StackADTUsingLinkedList {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Muhammad");
        stringStack.push("Ahmer");
        stringStack.push("Zubair");
        System.out.println("Stack size: " + stringStack.size());
        System.out.println("Top element: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Stack size: " + stringStack.size());
        System.out.println("Is stack empty? " + stringStack.isEmpty());
    }
}
