public class TestCaseHammadQueue {

    public static void main(String[] args) {
        int[] numbers = {67,88,23,60,31,79,45,68,120,34,56,75,89,95,38,50,64,39,34,78,105,109,90,70,60,
                45,67,90,28,40,53,85,56,56,60,40,50,45,65,56,76,73,80,45,50,115,100,35,70,50,75
                ,90,40,60,39,90,38,60,56,78,58,90,40,30,56,88,77,66,92,40,70,80,67,90,40,66,30,
                60,70,66,38,90,30,70,65,55,77,50,55,66,78,100, 110,99,59,96};


        //sort and print sorted values
        System.out.println("Sorted Values:");
        int[] sortedNumbers = sort(numbers);
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " ");
        }

    }
    public static int[] sort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }



}
