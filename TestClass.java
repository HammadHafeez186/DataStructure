import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);;
        PriorityQueue priorityQueue = new PriorityQueue();
        while (true) {
            System.out.println("Enter 1 to insert element in priority queue.");
            System.out.println("Enter 2 to delete element from priority queue.");
            System.out.println("Enter 3 to find max element in priority queue.");
            System.out.println("Enter 4 to exit.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert: ");
                    int element1 = sc.nextInt();
                    priorityQueue.insertElement(element1);
                    break;
                case 2:
                    priorityQueue.deleteElement();
                    break;
                case 3:
                    System.out.println("Max element in priority queue is: " + priorityQueue.findMax());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

