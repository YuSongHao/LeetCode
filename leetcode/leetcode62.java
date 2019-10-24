package leetcode;

/**
 * @program:MyIdeaTest
 * @description:dp问题，不同路径和
 * @author:JasonYu
 * @date:2019-10-19 15-13
 **/
public class leetcode62 {
    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m,int n)
    {
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==0||j==0)
                    arr[i][j]=1;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[m-1][n-1];
    }

}
