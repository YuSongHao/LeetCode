package leetcode;

import java.util.List;

/**
 * @program:MyIdeaTest
 * @description:两两交换链表中的节点
 * @author:JasonYu
 * @date:2019-10-02 13-31
 **/
public class leetcode24 {
    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        ListNode head = input;
        for (int i = 0; i < 3; i++) {
            int value = input.val;
            ListNode next = new ListNode(++value);
            input.next = next;
            input = next;
        }
        head = swapPairs(head);
        while (head!=null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
