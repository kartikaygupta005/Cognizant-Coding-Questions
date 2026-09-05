import java.util.*;
public class main{
    public static ListNode FindMiddle(ListNode head){
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ; 
            fast = fast.next.next ; 
        }
        System.out.println("Middle Element is : " + slow.val);
        return slow ;
    }
}
