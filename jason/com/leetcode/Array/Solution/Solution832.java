package jason.com.leetcode.Array.Solution;
import java.lang.Math;
public class Solution832 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0},{0,0,0,0},{0,1,1,1},{1,0,1,0}};
//        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = flipAndInvertImage(arr);
//        for (int i = 0; i < res.length; i++) {
//            for (int j = 0; j < res[i].length; j++) {
//                System.out.print(res[i][j]+" ");
//            }
//        }
//        System.out.println();
    }
    public static int[][] flipAndInvertImage(int[][] A) {
        int len = (int) Math.round((double)A[0].length/2.0);
        for (int i = 0; i < len; i++) {
            swap(A,i,A[i].length-1-i);
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+" ");
            }
        }
        return A;
    }
    public static void swap(int[][] arr,int i,int j)
    {
        for (int k = 0; k < arr.length; k++) {
            int temp = arr[k][i];
            arr[k][i] = (arr[k][j]-1)*-1;
            arr[k][j] = (temp-1)*-1;
        }

    }
}
