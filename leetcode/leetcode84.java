package leetcode;

/**
 * @program:MyIdeaTest
 * @description:柱状图中的最大矩形
 * @author:JasonYu
 * @date:2019-10-22 21-32
 **/
public class leetcode84 {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights)
    {
        int result = 0;
        if (heights.length==0)
            return result;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = 1;
            int index = i;
            while(--index>=0&&heights[index]>=height) width++;
            index = i;
            while(++index<heights.length&&heights[index]>=height) width++;
            result = result<(width*height)?(width*height):result;
        }
        return result;
    }
}
