import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int maxcount = 0;

        for(int i = 0; i < len; i++) {

            if(arr[i] == 1) {
                count += 1;
            }

            maxcount = Math.max(maxcount, count);

            if(arr[i] == 0) {
                count = 0;
            }
        }

        System.out.print(maxcount);
    }
}
