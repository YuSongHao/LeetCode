package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program:MyIdeaTest
 * @description:四数之和
 * @author:JasonYu
 * @date:2019-09-24 12-28
 **/
public class leetcode18 {
    public static void main(String[] args) {
        int[]  nums = {1,0,-1,0,2,-2};
        int target = 0;
        List<List<Integer>> list = fourSum(nums,target);
        for (int i = 0; i < list.size(); i++) {
            List<Integer> ls = list.get(i);
            for (int j = 0; j < ls.size(); j++) {
                System.out.print(ls.get(j)+" ");
            }
            System.out.println("");
        }
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //针对特殊情况的优化，小于4个元素的数组是不符合题意的
        if (nums == null || nums.length < 4)
            return res;
        //先排序
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 3; i++) {
            //去重
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            //优化，若i的连续四数之和大于target，后面肯定没有符合题意的组合，直接跳出
            if ((nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3]) > target)
                break;
            //若i和前三大的数之和都小于target，那i肯定太小，遍历下一个
            if ((nums[i] + nums[len - 1] + nums[len - 2] + nums[len - 3]) < target)
                continue;
            for (int j = i + 1; j < len - 2; j++) {
                //去重
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                //针对特殊情况优化，同上
                if ((nums[i] + nums[j] + nums[j + 1] + nums[j + 2]) > target)
                    break;
                if ((nums[i] + nums[j] + nums[len - 1] + nums[len - 2]) < target)
                    continue;
                int start = j + 1;
                int end = len - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[++start]) ;
                        while (start < end && nums[end] == nums[--end]) ;
                    }
                    //当前四数之和小于target，则右移左指针
                    else if (sum < target)
                        while (start < end && nums[start] == nums[++start]) ;
                    else
                        while (start < end && nums[end] == nums[--end]) ;
                }
            }
        }
        return res;
    }
}
