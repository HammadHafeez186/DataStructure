public class HammadQueues {

    private static final int SIZE = 3;
    private int[] queue = new int[SIZE];
    private int back = -1;
    private int front = -1;

    public boolean isEmpty() {
        if (back == -1 && front == -1) {

            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        int compare = 0;
        if (back > front) {
            compare = back - front;
            if ((back + 1) % SIZE == front || compare == queue.length - 1) {
                return true;
            }
        } else if (front > back) {
            compare = front - back;
            if ((back + 1) % SIZE == front || compare == queue.length - 1) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public void enqueue(int number) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            back = (back + 1) % SIZE;
            queue[back] = number;
        }
    }


    public int dequeue() {
        int output = 0;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            front = (front + 1) % SIZE;
            output = queue[front];
        }
        return output;
    }
}

