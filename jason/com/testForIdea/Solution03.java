package jason.com.testForIdea;

import javax.management.MBeanServerDelegate;

public class Solution03 {
    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        t1.next = new ListNode(1);
        t1.next.next = new ListNode(2);
        ListNode res = deleteDuplicates(t1);
        while(res!=null)
        {
            System.out.print(res.val+" ");
            res = res.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
