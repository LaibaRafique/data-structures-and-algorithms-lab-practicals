// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package stackoperations;
import java.util.Stack;
public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        System.out.println("Original Stack: " + stack);
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        stack.push(11);
        System.out.println("After Pushing 11: " + stack);
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);
        int searchElement = 6;
        int position = stack.search(searchElement);
        System.out.println(searchElement + " found at position: " + position);
    }
}
