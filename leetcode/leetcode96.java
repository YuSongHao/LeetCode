package leetcode;

/**
 * @program:MyIdeaTest
 * @description:不同的二叉搜索树
 * @author:JasonYu
 * @date:2019-10-23 19-39
 **/
public class leetcode96 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(numTrees(n));
    }
    public static int numTrees(int n)
    {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
