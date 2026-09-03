import java.uti;.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] merged = merge(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0 ;
        for(int i = 0 ; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] < arr2[j]) {
                    merged[index++] = arr1[i];
                } else {
                    merged[index++] = arr2[j];
                }
            }
        }
        return merged;
    }
}
