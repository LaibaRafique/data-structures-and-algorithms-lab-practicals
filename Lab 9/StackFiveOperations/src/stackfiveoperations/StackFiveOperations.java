// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package stackfiveoperations;
import java.util.Stack;
public class StackFiveOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(54);
        stack.push(32);
        stack.push(11);
        stack.push(43);
        stack.push(7);
        stack.push(21);
        stack.push(9);
        stack.push(27);
        stack.push(10);
        stack.push(1);
        System.out.println("Original Stack: " + stack);
        Integer poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);
        Integer topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        Integer searchElement = 7;
        int position = stack.search(searchElement);
        System.out.println(searchElement + " is at position: " + position);
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);
    }
}
