// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package stackadtarrays;
public class StackADTArrays {
    private static final int SIZE = 5;
    private int top;
    private int[] stackArray;
    public StackADTArrays() {
        top = -1;
        stackArray = new int[SIZE];
    }
    public void push(int value) {
        if (top < SIZE - 1) {
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
    public static void main(String[] args) {
        StackADTArrays stack = new StackADTArrays();
        stack.push(24);
        stack.push(31);
        stack.push(57);
        stack.push(62);
        System.out.println("Top element of the stack: " + stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("Is the stack empty? " + stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
