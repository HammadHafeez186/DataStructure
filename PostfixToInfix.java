import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {
        String postfix = "abc*+de*f+*";
        String infix = postfixToInfix(postfix);
        System.out.println("Postfix expression: " + postfix);
        System.out.println("Infix expression: " + infix);
    }
    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String result = "(" + operand1 + ch + operand2 + ")";
                stack.push(result);
            }
        }

        return stack.pop();
    }

}
