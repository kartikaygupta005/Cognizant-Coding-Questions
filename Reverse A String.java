import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = n-1 ; i>= 0 ;i--){
            sb.append(str.charAt(i));
        }
        System.out.println("Reversed string: " + sb.toString());
    }
}
