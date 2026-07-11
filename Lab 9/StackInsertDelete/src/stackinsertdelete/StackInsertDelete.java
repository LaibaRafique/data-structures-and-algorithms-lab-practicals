// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package stackinsertdelete;
class Stack {
    private static final int SIZE = 3;
    private int top;
    private int[] array;
    public Stack() {
        top = -1;
        array = new int[SIZE];
    }
    public void push(int value) {
        if (top >= SIZE - 1) {
            System.out.println("Stack overflow");
        } else {
            array[++top] = value;
            System.out.println(value + " pushed to the stack");
        }
    }
    public void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
        } else {
            int poppedValue = array[top--];
            System.out.println(poppedValue + " popped from the stack");
        }
    }
    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Elements in the stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
public class StackInsertDelete {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(7);
        stack.push(3);
        stack.push(5);
        stack.push(0);
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
    }
}
