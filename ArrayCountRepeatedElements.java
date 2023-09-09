public class ArrayCountRepeatedElements {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 2, 11, 2, 3, 50};

        for (int i = 0; i < array.length; i++) {
            int count = 0; // Initialize count for the current element

            // Check if this element has already been counted
            boolean istrue = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    istrue = true;
                    break;
                }
            }

            if (istrue) {
                continue; // Skip if it's already counted
            }

            // Count the occurrences of the current element
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            // Output the count for the current element
            System.out.println(array[i] + " is repeated " + count + " times");
        }
    }
}
