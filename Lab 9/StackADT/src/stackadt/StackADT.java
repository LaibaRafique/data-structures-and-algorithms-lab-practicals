// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package stackadt;
public class StackADT {
    private int maxSize;
    private int top;
    private int[] stackArray;
    public StackADT(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to the stack");
        } else {
            System.out.println("Stack overflow");
        }
    }
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack");
            return poppedValue;
        } else {
            System.out.println("Stack underflow");
            return -1; 
        }
    }
    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1; 
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
    public static void main(String[] args) {
        StackADT stack = new StackADT(5);
        stack.push(7);
        stack.push(34);
        stack.push(11);
        stack.push(4);
        System.out.println("Top element of the stack: " + stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Is the stack full? " + stack.isFull());
    }
}
