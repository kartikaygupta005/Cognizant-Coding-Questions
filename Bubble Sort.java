import java.util.Arrays;

public class BubbleSort {
    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        // Outer loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop performs adjacent comparisons
            // The last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap adjacent elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                    // Mark that a swap occurred
                    swapped = true;
                }
            }
            
            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array: " + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("Sorted array:   " + Arrays.toString(data));
    }
}
