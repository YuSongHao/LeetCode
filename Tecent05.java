import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:腾讯笔试题05
 * @author:JasonYu
 * @date:2019-09-01 20-24
 **/
public class Tecent05 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int combo = sc.nextInt();
//        int[][] arr = new int[row][2];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < 2; j++) {
//                arr[i][j] = sc.nextInt();
//            }
        //}
        int row = 3;
        int combo = 2;
        int[][] arr = {{1,3},{2,3},{4,4}};
        for (int i = 0; i < row; i++) {
            int[] arrEach = arr[i];
            System.out.println(flower(arrEach,combo));
        }
    }
    public static int flower(int[] arr,int k)
    {
        if(arr[0]>arr[1])
            return 0;
        int kindPureWhite = 0;
        int kindMix = 0;
        int start = arr[0];
        int end = arr[1];
        int kindPureRed = end-start+1;
        int n = 1;
        for (int i = start; i <= end; i++) {
            if(i<k)
                continue;
            if (i==(n*k)&&n==1)
            {
                kindPureWhite++;
            }
            if(i>n*k&&i<=(n+1)*k)
            {
                kindMix+=i-(n*k)+1;
                n++;
            }
            if(i==(n*k)&&n!=1)
            {
                kindPureWhite++;
                int temp = n;
                for (int j = temp-1;j>1;j--) {
                    kindMix+=i-(j*k)+1;
                }
            }

        }
        return kindPureRed+kindPureWhite+kindMix;
    }

}
