package leetcode;

/**
 * @program:MyIdeaTest
 * @description:编辑距离
 * @author:JasonYu
 * @date:2019-10-20 17-52
 **/
public class leetcode72 {
    public static void main(String[] args) {
        String word1 = "pneumonoultramicroscopicsilicovolcanoconiosis";
        String word2 = "ultramicroscopically";
        System.out.println(minDistance(word1,word2));
    }
    public static int minDistance(String word1,String word2)
    {
        int m = word1.length();
        int n = word2.length();
        if(m*n==0)
            return m+n;
        int[][] mat = new int[m+1][n+1];
        mat[0][0] = 0;
        for (int i = 0; i < m+1; ++i) {
            mat[i][0] = i;
        }
        for (int i = 0; i < n+1; ++i) {
            mat[0][i] = i;
        }
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(word1.charAt(i-1)==word2.charAt(j-1))
                {
                    mat[i][j] = 1 + Math.min(mat[i-1][j],Math.min(mat[i][j-1],mat[i-1][j-1]-1));
                }else{
                    mat[i][j] = 1 + Math.min(mat[i-1][j],Math.min(mat[i][j-1],mat[i-1][j-1]));
                }
            }
        }
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        return mat[m][n];
    }
}
