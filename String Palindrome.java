import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String copy = str;
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = n-1 ; i>= 0 ; i--){
            sb.append(str.charAt(i));
        }
        if(copy.equals(sb.toString())){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}
