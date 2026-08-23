import java.util.*;

public class main {

    private static int maxsum(int[] arr, int len) {
        int CurrSum = arr[0];
        int MaxSum = arr[0];

        for (int left = 1; left < len; left++) {
            CurrSum += arr[left];

            if (arr[left] > CurrSum) {
                CurrSum = arr[left];
            }

            MaxSum = Math.max(MaxSum, CurrSum);
        }

        return MaxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(maxsum(arr, len));
    }
}
