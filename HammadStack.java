public class HammadStack {
    private static final int SIZE = 100;
    private int[] stack = new int[SIZE];
    private int top = -1;
    private int element = 0;

   public boolean isEmpty(){
       if (top == -1){
           return true;
       }
       else {
           return false;
       }
   }
    public boolean isFull(){
        if (top == stack.length - 1){
            return true;
        }
        else {
            return false;
        }
    }
    public void push(int number){
       if (isFull()){
           System.out.println("Stack is full");
       }
       else {
           stack[++top] = number;
       }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Nothing to pop.");
        } else {
            element = stack[top];
            top--;
        }
        return element;
    }
}
