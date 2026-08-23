import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Invalid Input");
            return;
        }
        int temp = num;
        int reversedNum = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            reversedNum = reversedNum * 10 + remainder;
            temp = temp/10;
        }
        if (num == reversedNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
