public class PriorityQueue {

    private static final int size = 4;
    private int back = -1;

    private int[] priorityQueue = new int[size];

    public boolean isEmpty() {
        return back == -1;
    }

    public void insertElement(int number) {
        if (back == -1) {
            back = 0;
            priorityQueue[back] = number;
        } else if (back == priorityQueue.length - 1) {
            System.out.println("Queue is full. Cannot insert.");
        } else {
            back++;
            priorityQueue[back] = number;
        }
    }

    public void deleteElement(){
        if (isEmpty()){
            System.out.println("Queue is empty, nothing to delete.");
        }
        else {
            int max = priorityQueue[0];
            int maxIndex = 0;
            for (int i = 1; i <= back; i++) {
                if (priorityQueue[i] > max) {
                    max = priorityQueue[i];
                    maxIndex = i;
                }
            }
            for (int i = maxIndex; i < back; i++) {
                priorityQueue[i] = priorityQueue[i + 1];
            }
            back--;
        }
    }
    public int findMax(){
        if (isEmpty()){
            System.out.println("Queue is empty, nothing to find.");
            return -1;
        }
        else {
            int max = priorityQueue[0];
            for (int i = 1; i <= back; i++) {
                if (priorityQueue[i] > max) {
                    max = priorityQueue[i];
                }
            }
            return max;
        }
    }


}
