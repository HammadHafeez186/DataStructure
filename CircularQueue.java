public class CircularQueue {

    private static final int size = 4;
    private int[] queue = new int[size];

    private int backPointer = -1;
    private int frontPointer = -1;


    public void insertElement(int number) {
        if (isEmpty()) {
            frontPointer = backPointer = 0;
            queue[backPointer] = number;
        } else if ((backPointer + 1) % queue.length == frontPointer) {
            System.out.println("Queue is full. Cannot insert.");
        } else {
            backPointer = (backPointer + 1) % queue.length;
            queue[backPointer] = number;
        }
    }

    public boolean isEmpty() {
        return frontPointer == -1 && backPointer == -1;
    }


    public void deleteElement() {
        if (isEmpty()) {
            System.out.println("Queue is empty, nothing to delete.");
        } else {
            queue[frontPointer] = -1;

            if (frontPointer == backPointer) {
                frontPointer = backPointer = -1;
            } else {
                frontPointer = (frontPointer + 1) % queue.length;
            }
        }
    }

    public void display() {
        if (frontPointer == -1 && backPointer == -1) {
            System.out.println("Queue is empty, nothing to display.");
        } else {
            int currentPointer = frontPointer;
            do {
                System.out.print(queue[currentPointer] + " ");
                currentPointer = (currentPointer + 1) % queue.length;
            } while (currentPointer != (backPointer + 1) % queue.length);
            System.out.println();
        }
    }

}
