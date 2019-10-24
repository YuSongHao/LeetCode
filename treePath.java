/**
 * @program:MyIdeaTest
 * @description:输出二叉树的全部路径
 * @author:JasonYu
 * @date:2019-09-01 00-01
 **/
import com.sun.source.tree.Tree;

import java.util.*;

public class treePath {
    private static List<String> binTreePath3(TreeNode root) {
        List<String> l = new ArrayList<String>();//结果列表
        Queue<TreeNode> queueNode = new LinkedList<TreeNode>();//存储节点队列
        Queue<String> queueStrPath = new LinkedList<String>();//存储路径队列
        if(root==null)return l;
        queueNode.add(root);
        queueStrPath.add("");
        while(!queueNode.isEmpty()) {
            TreeNode curNode = queueNode.poll();
            String curPath = queueStrPath.poll();
            if(curNode.left==null && curNode.right==null) {
                l.add(curPath+curNode.val);
            }
            if(curNode.left!=null) {
                queueNode.add(curNode.left);
                queueStrPath.add(curPath+curNode.val+"");
            }
            if(curNode.right!=null) {
                queueNode.add(curNode.right);
                queueStrPath.add(curPath+curNode.val+"->");
            }
        }
        return l;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode( 5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode( 7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        List<String> sb = binTreePath3(root);
        for (int i = 0; i < sb.size(); i++) {
            System.out.println(sb.get(i));
        }
    }
}
class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){val = x;};
}