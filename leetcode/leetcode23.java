package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @program:MyIdeaTest
 * @description:合并k个排序链表——hard
 * @author:JasonYu
 * @date:2019-09-20 00-11
 **/
public class leetcode23 {
    public static void main(String[] args) {
        System.out.println();
    }
    public static ListNode mergeKLists(ListNode[] lists)
    {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode result = null;
        for (int i = 0; i < lists.length; i++) {
            ListNode ls = lists[i];
            while(ls!=null)
            {
                al.add(ls.val);
                ls = ls.next;
            }
        }
        Collections.sort(al);
        if (!al.isEmpty()) {
            result = new ListNode(al.get(0));
            ListNode head = result;
            for (int i = 1; i < al.size(); i++) {
                ListNode temp = new ListNode(al.get(i));
                head.next = temp;
                head = head.next;
            }
        }
        return result;
    }
}
