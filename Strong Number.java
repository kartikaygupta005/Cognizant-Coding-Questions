import java.util.*;
public class StrongNumber{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n ; 
        int sum = 0 ;
        while(temp > 0 ){
            int rem = temp %10 ;
            temp = temp / 10  ; 
            sum = sum + factorial(rem) ;
        }
        if(sum == n){
            System.out.println(n + " is a Strong Number");
        }
        else{
            System.out.println(n + " is not a Strong Number");
        }
    }
    public static int factorial(int n){
        if(n == 0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
