package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program:MyIdeaTest
 * @description:镜像二叉树
 * @author:JasonYu
 * @date:2019-09-25 16-01
 **/
public class lcRace01 {
    public static void main(String[] args) {

    }
    public static boolean isSymmetric(TreeNode root) {
        String str = midOrder(root);
        String[] ch = str.split(",");
        int index = -1;
        for (int i = 0; i < ch.length; i++) {
            if (root.val==Integer.parseInt(ch[i]))
                index = i;
        }
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (i<index)
                al.add(Integer.parseInt(ch[i]));
            else if(i>index)
                stack.push(Integer.parseInt(ch[i]));
        }
        if (stack.size()!=al.size())
            return false;
        for (int i = 0; i < index; i++) {
            if (al.get(i)!=stack.pop())
                return false;
        }
        return true;
    }
    public static String midOrder(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();
        String str = "";
        TreeNode node = root;
        while(node!=null || stack.size()>0)
        {
            if(node!=null)
            {
                stack.push(node);
                node = node.left;
            }else
            {
                node=stack.pop();
                str=str+node.val+",";
                node = node.right;
            }
        }
        return str;
    }
}
