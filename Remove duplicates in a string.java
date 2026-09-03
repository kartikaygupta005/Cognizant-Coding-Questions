import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String sn = sc.nextLine();
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : sn.toCharArray()){{
            map.put(ch , map.getOrDefault(ch , 0 )+1);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : sn.toCharArray()){
            if(map.containsKey(ch)){
                sb.append(ch);
                map.remove(ch);

            }
            System.out.println("String after removing duplicates: " + sb.toString());

        }

    }
}
