package leetcode;

/**
 * @program:MyIdeaTest
 * @description:删除链表的倒数第n个节点
 * @author:JasonYu
 * @date:2019-09-24 12-40
 **/
public class leetcode19 {
    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ListNode head = ln;
        for (int i = 2; i <=5; i++) {
            ln.next = new ListNode(i);
            ln = ln.next;
        }
        ListNode rhead = removeNthFromEnd(head,2);
//        ListNode rhead = removeNthFromEnd(new ListNode(1),1);
        while(rhead!=null)
        {
            System.out.println(rhead.val);
            rhead = rhead.next;
        }

    }
    public static ListNode removeNthFromEnd(ListNode head,int n)
    {
        ListNode ln = head;
        ListNode res =null;
        int len = 0;
        while(head!=null)
        {
            len++;
            head = head.next;
        }
        if(n>len)
            return ln;
        else if (n==len&&n==1)
        {
            return res;
        }
        else {
            int num = len-n-1;
            ListNode rhead = ln;
            while(num>0)
            {
                ln = ln.next;
                num--;
            }
            if (num==-1)
            {
                ListNode remove = ln.next;
                return remove;
            }
            ln.next = ln.next.next;
            return rhead;
        }
    }
}
