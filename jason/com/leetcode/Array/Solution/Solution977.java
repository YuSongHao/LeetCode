package jason.com.leetcode.Array.Solution;
import java.lang.Math;
import java.util.Arrays;

public class Solution977 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] res = sortedSquares(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)Math.pow(A[i],2);
        }
        Arrays.sort(A);
        return A;
    }
}
