import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

/**
 * @program:MyIdeaTest
 * @description:2048小游戏实现
 * @author:JasonYu
 * @date:2019-09-11 20-32
 **/
public class ByteDance2048 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,2,4},{0,2,2,2},{0,4,2,2},{8,8,2,2}};
        print2Darr(arr);
        print2Darr(left(arr));
    }
    public static int[][] left(int[][] arr)
    {
        int[][] result = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            int starter = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]!=0) {
                    starter = j;
                    break;
                }else
                    continue;
            }
        }
        return result;
    }
    public static void print2Darr(int [][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
