package leetcode;

/**
 * @program:MyIdeaTest
 * @description:最小路径和
 * @author:JasonYu
 * @date:2019-10-20 17-28
 **/
public class leetcode64 {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid)
    {
        int [][] minGrid = new int[grid.length][grid[0].length];
        int result = 0;
        minGrid[0][0] = grid[0][0];
        int row = 0,cal = 0;
        while(++row<grid.length)
            minGrid[row][0] = minGrid[row-1][0]+grid[row][0];
        while(++cal<grid[0].length)
            minGrid[0][cal] = minGrid[0][cal-1]+grid[0][cal];
        if (grid.length==1)
        {
            for (int i = 0; i < grid[0].length; i++) {
                result+=grid[0][i];
            }
            return result;
        }
        if (grid[0].length==1)
        {
            for (int i = 0; i < grid.length; i++) {
                result+=grid[i][0];
            }
            return result;
        }
        for (int i = 1; i < minGrid.length; i++) {
            for (int j = 1; j < minGrid[0].length; j++) {
                int minValue = Math.min(minGrid[i-1][j],minGrid[i][j-1]);
                minGrid[i][j] = grid[i][j]+minValue;
            }
        }
        result = minGrid[grid.length-1][grid[0].length-1];
        return result;
    }
}
