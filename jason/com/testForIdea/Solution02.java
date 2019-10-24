package jason.com.testForIdea;

import java.lang.Math;
import java.util.List;

public class Solution02 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0,num2 = 0;
        int i = 0,j = 0;
        while(l1!=null)
        {
            num1 = num1+l1.val*(int)Math.pow(10,i);
            l1 = l1.next;
            i++;
        }
        while(l2!=null)
        {
            num2 = num2+l2.val*(int)Math.pow(10,j);
            l2 = l2.next;
            j++;
        }
        int sum = num1+num2;
        String str = sum+"";
        char[] ch = str.toCharArray();
        ListNode result = new ListNode(ch[0]-'0'),pig = new ListNode(ch[0]-'0');
        if(ch.length>1)
        {
            for (int k = 1; k < ch.length; k++) {
                pig = new ListNode(ch[k]-'0');
                pig.next= result;
                result = pig;
            }
        }
        return pig;
    }

    public static void main(String[] args) {
        ListNode t1 = new ListNode(2);
        t1.next = new ListNode(4);
        t1.next.next = new ListNode(3);
        ListNode t2 = new ListNode(5);
        t2.next = new ListNode(6);
        t2.next.next = new ListNode(4);
        ListNode t3 = new ListNode(0);
        ListNode t4 = new ListNode(1);
        ListNode res = addTwoNumbers(t3,t4);
        while(res!=null)
        {
            System.out.println(res.val);
            res = res.next;
        }

    }
}
