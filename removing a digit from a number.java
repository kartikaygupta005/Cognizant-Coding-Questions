import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int digit = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< n  ; i++){
            if(str.charAt(i) - '0' != digit){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}   
