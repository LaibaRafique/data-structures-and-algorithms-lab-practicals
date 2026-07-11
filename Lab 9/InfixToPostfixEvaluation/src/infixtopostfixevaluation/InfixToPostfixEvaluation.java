// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package infixtopostfixevaluation;
import java.util.Stack;
class StackADT {
    private Stack<Character> stack;
    public StackADT() {
        stack = new Stack<>();
    }
    public void push(char c) {
        stack.push(c);
    }
    public char pop() {
        return stack.pop();
    }
    public char peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
public class InfixToPostfixEvaluation {
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        StackADT stack = new StackADT();
        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); 
            } else {
                while (!stack.isEmpty() && precedence(c) <= 
                        precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        String infixExpression = "(A+B)*(C-D)";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("\n Infix Expression: " + infixExpression);
        System.out.println("\n Postfix Expression: " + postfixExpression);
        System.out.println("");
    }
}
