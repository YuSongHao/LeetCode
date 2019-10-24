import java.util.ArrayList;
import java.util.Arrays;


/**
 * @program:MyIdeaTest
 * @description:逆时针打印矩阵
 * @author:JasonYu
 * @date:2019-09-29 20-44
 **/
import java.util.Scanner;
public class ByteDance03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            int row = sc.nextInt();
            int cal = sc.nextInt();
            int[][] mat= createMat(row,cal);
            int[] res = reversePrint(mat,cal,row);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]+" ");
            }

        }
    }
    public static int[] reversePrint(int[][] mat,int n,int m)
    {
        int startX = 0;
        int startY = 0;
        int endX = m-1;
        int endY = n-1;
        int index = 0;
        int[] res = new int[n*m];
        while(startX<=endX&&startY<=endY)
        {
            if(startY<=endY)
            {
                for (int i = startY; i <=endY ; i++) {
                    res[index++]=mat[i][startX];
                }
            }
            if (startX<endX)
            {
                for (int i = startX+1; i <=endX ; i++) {
                    res[index++] = mat[endY][i];
                }
            }
            if(startX<endX&&startY<endY) {
                for (int i = endY - 1; i >= startY; i--) {
                    res[index++] = mat[i][endX];
                }
            }
            if(startX<endX-1&&startY<endY)
            {
                for (int i = endX-1; i >=startX+1 ; i--) {
                    res[index++] = mat[startY][i];
                }
            }
            startX++;
            startY++;
            endX--;
            endY--;
        }
        return res;
    }
    public static int[][] createMat(int row,int cal)
    {
        int[][] mat = new int[cal][row];
        int maxValue = row*cal;
        int initalValue = 1;
        int j = 0;
        for (int i = 0; i < row; i++) {
            for (int k = cal-1; k >=0; k--) {
                mat[k][i]=initalValue;
                initalValue++;
            }
        }
        return mat;
    }
}
