package leetcode;

/**
 * @program:MyIdeaTest
 * @description:合并两个有序链表
 * @author:JasonYu
 * @date:2019-10-16 21-19
 **/
public class leetcode21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode ans = mergeTwoLists(l1,l2);
        while(ans!=null)
        {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null||l2==null)
        {
            return l1==null?l2:l1;
        }
        ListNode result = new ListNode(0);
        ListNode head = result;
        while(l1!=null&&l2!=null)
        {
            result.next = new ListNode(l1.val>l2.val?l2.val:l1.val);
            result = result.next;
            if(l1.val>l2.val)
            {
                l2 = l2.next;
            }else
            {
                l1 = l1.next;
            }
        }
        if(l1==null)
        {
            result.next = l2;
        }
        if(l2==null)
        {
            result.next = l1;
        }
        return head.next;
    }
}
