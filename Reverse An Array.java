import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int first = 0 ; 
        int last = n -1 ;
        for(int i = 0 ; i < n/2 ;i++){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp ;
            first++;
            last--;
            if(first == last){
                break;
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
