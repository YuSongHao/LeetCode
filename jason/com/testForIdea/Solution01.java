package jason.com.testForIdea;

public class Solution01 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBinaryTree(pre,0,pre.length,in,0,in.length);
    }
    private TreeNode reConstructBinaryTree(int[] pre,int phead,int pend,int[] in,int inhead,int inend)
    {
        if(phead>pend||inhead>inend)
            return null;
        TreeNode root = new TreeNode(pre[phead]);
        for(int i = phead;i<=pend;i++){
            if(in[i]==pre[phead])
            {
                root.left = reConstructBinaryTree(pre,phead+1,i,in,inhead,i-1);
                root.right = reConstructBinaryTree(pre,i+1,pend,in,i+1,inend);
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,4,6,5,3};
//        VerifySquenceOfBST(arr);
//        System.out.println(VerifySquenceOfBST(arr));
    }
}