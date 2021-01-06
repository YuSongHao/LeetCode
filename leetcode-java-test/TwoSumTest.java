import org.junit.Assert;
import org.junit.Test;
/**
 * @program:LeetCode
 * @description:
 * @author:JasonYu
 * @date:2021-01-06 23-16
 **/
public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] nums = {2, 7, 9, 11};
        Assert.assertArrayEquals(array.TwoSum.twoSum(nums, 9),new int[]{0,1});
        int[] nums2 = {3,3};
        Assert.assertArrayEquals(array.TwoSum.twoSum(nums2, 6),new int[]{0,1});
    }
}