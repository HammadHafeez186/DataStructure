import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String infix = "a+b*c";
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    postfix.append(s.pop());
                }
                s.pop();
            } else {
                while (!s.isEmpty() && precedence(ch) <= precedence(s.peek())) {
                    postfix.append(s.pop());
                }
                s.push(ch);
            }
        }

        while (!s.isEmpty()) {
            postfix.append(s.pop());
        }

        System.out.println("Postfix expression: " + postfix.toString());
    }
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
