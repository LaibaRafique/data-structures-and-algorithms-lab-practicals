// Name: Muhammad Ahmer, Roll Number: 2022F-BSE-165

package infixtopostfixevaluation2;
import java.util.LinkedList;
class Node {
    char data;
    Node next;
    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}
class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }
    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        char data = top.data;
        top = top.next;
        return data;
    }
    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }
    public boolean isEmpty() {
        return top == null;
    }
}
public class InfixToPostfixEvaluation2 {
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
        Stack stack = new Stack();
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
                while (!stack.isEmpty() && getPrecedence(ch) <= 
                        getPrecedence(stack.peek())) {
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
