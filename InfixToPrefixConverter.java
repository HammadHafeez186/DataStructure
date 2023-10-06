import java.util.Stack;

public class InfixToPrefixConverter {

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return 0; // Default for parentheses
    }

    public static String infixToPrefix(String infixExpression) {
        StringBuilder prefixExpression = new StringBuilder();
        Stack<Character> operators = new Stack<>();
        Stack<Character> parentheses = new Stack<>(); // Stack to check for balanced parentheses

        for (int i = 0; i < infixExpression.length(); i++) {
            char c = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                prefixExpression.append(c);
            } else if (c == '(') {
                operators.push(c);
                parentheses.push(c); // Push '(' onto the stack for balanced parentheses check
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char op = operators.pop();
                    prefixExpression.append(op);
                }
                if (!operators.isEmpty() && operators.peek() == '(') {
                    operators.pop(); // Pop and discard '('
                    parentheses.pop(); // Pop '(' from the parentheses stack
                } else {
                    // Mismatched closing parenthesis
                    throw new IllegalArgumentException("Mismatched parentheses in the input expression.");
                }
            } else {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    char op = operators.pop();
                    prefixExpression.append(op);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            char op = operators.pop();
            prefixExpression.append(op);
        }

        if (!parentheses.isEmpty()) {
            // Mismatched opening parenthesis
            throw new IllegalArgumentException("Mismatched parentheses in the input expression.");
        }

        return prefixExpression.reverse().toString();
    }

    public static void main(String[] args) {
        String infixExpression = "3+(4*2)/(1-5)";
        try {
            String prefixExpression = infixToPrefix(infixExpression);
            System.out.println("Infix Expression: " + infixExpression);
            System.out.println("Prefix Expression: " + prefixExpression);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}