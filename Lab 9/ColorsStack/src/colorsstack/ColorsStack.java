// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package colorsstack;
import java.util.Scanner;
import java.util.Stack;
public class ColorsStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> colorStack = new Stack<>();
        System.out.print("Enter colors: ");
        String input = scanner.nextLine();
        String[] colors = input.split(",");
        for (int i = colors.length - 1; i >= 0; i--) {
            colorStack.push(colors[i].trim().toLowerCase());
        }
        System.out.print("Original stack: ");   
        printStack(colorStack);
        System.out.println("");
        System.out.print("Enter the color to pop: ");
        String chosenColor = scanner.next().trim().toLowerCase();
        Stack<String> tempStack = new Stack<>();
        while (!colorStack.isEmpty()) {
            String currentColor = colorStack.pop();
            if (!currentColor.equals(chosenColor)) {
                tempStack.push(currentColor);
            }
        }
        while (!tempStack.isEmpty()) {
            colorStack.push(tempStack.pop());
        }
        System.out.print("Updated stack: ");
        printStack(colorStack);
    }
    private static void printStack(Stack<String> stack) {
        for (String color : stack) {
            System.out.print(color + "->");
        }
        System.out.println();
    }
}
