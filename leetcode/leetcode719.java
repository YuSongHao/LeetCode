package leetcode;

import java.util.Arrays;

/**
 * @program:MyIdeaTest
 * @description:第k小的距离对
 * @author:JasonYu
 * @date:2019-10-20 09-21
 **/
public class leetcode719 {
    public static void main(String[] args) {
        int [] nums = {1,3,1};
        System.out.println(smallestDistancePair(nums,1));
    }
    public static int smallestDistancePair(int[] nums, int k)
    {
        Arrays.sort(nums);

        int lo = 0;
        int hi = nums[nums.length - 1] - nums[0];
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            int count = 0, left = 0;
            for (int right = 0; right < nums.length; ++right) {
                while (nums[right] - nums[left] > mi) left++;
                count += right - left;
            }
            //count = number of pairs with distance <= mi
            if (count >= k) hi = mi;
            else lo = mi + 1;
        }
        return lo;
    }
}
