import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers to generate: ");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        System.out.println("The first " + n + " prime numbers are: ");
        while(count < n){
            if(isPrime(num)){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    private static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
