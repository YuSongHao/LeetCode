package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @program:leetcode-java
 * @description:
 * 在数组中找到 2 个数之和等于给定值的数字，结果返回 2 个数字在数组中的下标。
 * https://leetcode.com/problems/two-sum/
 * @author:JasonYu
 * @date:2021-01-02 17-13
 **/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> resultMap = new HashMap<>();
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (resultMap.containsKey(target - nums[i])) {
                result[0] = resultMap.get(target - nums[i]);
                result[1] = i;
            }
            resultMap.put(nums[i], i);
        }
        return result;
    }
}
