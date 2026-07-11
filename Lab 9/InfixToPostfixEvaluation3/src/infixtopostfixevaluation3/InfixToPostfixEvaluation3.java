// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package infixtopostfixevaluation3;
import java.util.Stack;
public class InfixToPostfixEvaluation3 {
    static int getPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '|':
                return 3;
        }
        return -1;
    }
    static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); 
            } else {
                while (!stack.isEmpty() && getPrecedence(ch) 
                        <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    public static void main(String[] args) {
        String infixExpression = "A+(B*C-(D/E|F)*G)*H";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("\n Infix Expression: " + infixExpression);
        System.out.println("\n Postfix Expression: " + postfixExpression);
        System.out.println("");
    }
}
