package leetcode;

/**
 * @program:MyIdeaTest
 * @description:最大矩形
 * @author:JasonYu
 * @date:2019-10-22 09-57
 **/
public class leetcode85 {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        System.out.println(maxMat(matrix));
    }
    public static int maxMat(int[][] matrix)
    {
        if (matrix.length==0)
            return 0;
        int[] heights = new int[matrix[0].length];
        int maxArea = 0;
        for (int row = 0; row < matrix.length; row++) {
            //遍历每一列，更新高度
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 1) {
                    heights[col] += 1;
                } else {
                    heights[col] = 0;
                }
            }
            //调用上一题的解法，更新函数
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
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
