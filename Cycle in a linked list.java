import java.util.*;
public class main{
    public static ListNode FindMiddle(ListNode head){
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ; 
            fast = fast.next.next ; 
            if(fast == slow){
                System.out.println("Cycle detected in the linked list.");
                return null; // Return null or handle cycle detection as needed
            }
        }
        System.out.println("No cycle detected in the linked list.");
        return null;
    }
}
