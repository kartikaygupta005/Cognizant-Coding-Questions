import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        // Move the boundary of the unsorted subarray one by one
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the remaining unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {29, 10, 14, 37, 13};
        
        System.out.println("Original array: " + Arrays.toString(data));
        selectionSort(data);
        System.out.println("Sorted array:   " + Arrays.toString(data));
    }
}
