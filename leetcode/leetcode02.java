package leetcode;

import java.util.List;

/**
 * @program:MyIdeaTest
 * @description:链表题——两数相加
 * @author:JasonYu
 * @date:2019-10-16 20-58
 **/
public class leetcode02 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode ans = addTwoNumbers(l1,l2);
        while(ans!=null)
        {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null||l2==null)
        {
            return l1==null?l2:l1;
        }
        int count = 0;//进位标志
        ListNode result = new ListNode(0);
        ListNode head = result;
        while(l1!=null&&l2!=null)
        {
            int n = (l1.val + l2.val+count) % 10;
            count = (l1.val+l2.val+count)/10;
            result.next = new ListNode(n);
            result = result.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
                int n = (l1.val+count) % 10;
                count = (l1.val+count)/10;
                result.next = new ListNode(n);
                result = result.next;
                l1=l1.next;
        }

        while(l2!=null)
        {
            int n = (l2.val+count) % 10;
            count = (l2.val+count)/10;
            result.next = new ListNode(n);
            result = result.next;
            l2=l2.next;
        }
        if (count==1)
        {
            result.next = new ListNode(1);
        }
        return head.next;
    }
}
