import java.util.Stack;

public class EvaluatePostfix {

    public static void main(String[] args) {
        String postfix = "5 6 48 * +";
        String noSpace = postfix.replaceAll(" ","");
        int result = evaluatePostfix(noSpace);
        System.out.println("Postfix expression: " + postfix);
        System.out.println("Result: " + result);
    }
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        if (operand2 == 0) {
                        }
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
