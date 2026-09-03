import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String sn = sc.nextLine();
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : sn.toCharArray()){{
            map.put(ch , map.getOrDefault(ch , 0 )+1);
        }
        for(char ch : sn.toCharArray()){
            if(map.containsKey(ch) && map.get(ch) > 1){
                sb.append(ch);
                map.remove(ch);

            }
            System.out.println("String with repeating characters: " + sb.toString());

        }

    }
}
