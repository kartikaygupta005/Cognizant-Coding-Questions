import java.util.*;
// find second largest word in a string
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String largest = "";
        String secondLargest = "";
        for (String word : words) {
            if (word.length() > largest.length()) {
                secondLargest = largest;
                largest = word;
            } else if (word.length() > secondLargest.length() && !word.equals(largest)) {
                secondLargest = word;
            }
        }
        System.out.println("Second largest word: " + secondLargest);
    }
}
