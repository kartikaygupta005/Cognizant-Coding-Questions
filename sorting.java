import java.util.*;
public class Sorting{
    public static void main(String[] x){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextLine();
        char[] arr = new char[n];
        Arrays.sort(arr);
        String sorted = new String(arr);
        System.out.println("Sorted string: " + sorted);
    }

}
