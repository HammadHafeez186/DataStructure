public class Stack {
    public static int max_size = 100;
    public int top = -1;
    public int[] array = new int[max_size];


    public void push(int element){
        if (top == max_size - 1){
            System.out.println("Stack is full");
        }
        else{
            array[++top] = element;
        }
    }
    public int pop(){
        int element = 0;
        if (top == -1){
            System.out.println("Stack is empty");
        }
        else{
            element = array[top];
            top--;
        }
        return element;
    }

}
