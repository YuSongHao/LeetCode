package jason.com.leetcode.Array.Solution;
import java.util.ArrayList;
public class Solution905 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        A = sortArrayByParity(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }
    public static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> alodd = new ArrayList<>();
        ArrayList<Integer> aleven = new ArrayList<>();
        for(int i = 0;i<A.length;i++)
        {
            if(A[i]%2 == 1)
            {
                alodd.add(A[i]);
            }else
            {
                aleven.add(A[i]);
            }
        }
        for(Integer a:alodd)
        {
            aleven.add(a);
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = aleven.get(i);
        }
        return A;
    }
}
