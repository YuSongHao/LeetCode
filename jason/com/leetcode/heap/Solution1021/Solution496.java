package jason.com.leetcode.heap.Solution1021;

public class Solution496 {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        int[] result = nextGreaterElement(nums1,nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int value = nums1[i];
            int k = 0;
            while(value != nums2[k])
                k++;
            for (int j = k; j < nums2.length; j++) {
                if(nums2[j]>value)
                {
                    result[i] = nums2[j];
                    break;
                }
                else
                    result[i] = -1;
            }
        }
        return result;
    }
}
