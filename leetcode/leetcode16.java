package leetcode;

import java.util.Arrays;

/**
 * @program:MyIdeaTest
 * @description:最接近的三数之和
 * @author:JasonYu
 * @date:2019-09-24 10-44
 **/
public class leetcode16 {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr,target));
    }
    public static int threeSumClosest(int[] nums,int target)
    {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++) {
            int start = i+1, end = nums.length - 1;
            while(start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if(sum > target)
                    end--;
                else if(sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
    }
}
