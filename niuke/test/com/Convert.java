package niuke.test.com;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class Convert {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(7);
        t1.left.left = new TreeNode(2);
        t1.left.right = new TreeNode(4);
        t1.right.left = new TreeNode(6);
        t1.right.right = new TreeNode(8);
//        PrintFromTopToBottom(t1);
        t1 = ConvertBSTToBiList(t1);
        while(t1.right!=null){
            System.out.println(t1.val);
            t1 = t1.right;
        }
    }
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode tmp = q.remove();
            result.add(tmp.val);
            if(tmp.left != null){
                q.add(tmp.left);
            }
            if(tmp.right != null){
                q.add(tmp.right);
            }
        }
        return result;
    }
    public static TreeNode ConvertBSTToBiList(TreeNode root) {
        if (root == null)
            return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        TreeNode pre = null;// 用于保存中序遍历序列的上一节点
        boolean isFirst = true;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (isFirst) {
                root = p;// 将中序遍历序列中的第一个节点记为root
                pre = root;
                isFirst = false;
            } else {
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return root;
    }
}