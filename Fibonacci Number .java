import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println(result);
    }
    private static int fibonacci(int n){
        if(n == 0 || n ==1){
            return 1 ;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
