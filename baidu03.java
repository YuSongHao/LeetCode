
/**
 * @program:MyIdeaTest
 * @description:百度笔试题03
 * @author:JasonYu
 * @date:2019-09-17 19-49
 **/
import java.util.ArrayList;
import java.util.Scanner;
public class baidu03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int path = sc.nextInt();
        int fa = sc.nextInt();
        int fb = sc.nextInt();
        int[][] arr = new int [path][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findMinK(arr,fa,fb,num));

    }
    public static int findMinK(int[][] arr,int fa,int fb,int num)
    {
        int minPathWithoutRepeated = num-1;//不重复的路径最少需要num-1条
        int k = 0;//先去重复路径，看是否大于minPathWithoutRepeated，若大于则继续去除
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        sortby2cols(arr,0,1);
        int[] temp = {0,0,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length-1)
            {
                if(arr[i][0]==arr[i+1][0]&&arr[i][1]==arr[i+1][1])//重复条件
                {
                    if(fa*arr[i][2]+fb*arr[i][3]>fa*arr[i+1][2]+fb*arr[i+1][3])
                    {
                        arr[i] = temp;
                    }else
                    {
                        arr[i+1] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
            if (arr[i] != temp) {
                ArrayList<Integer> altemp = new ArrayList<>();
                for (int j = 0; j < arr[i].length; j++) {
                    altemp.add(arr[i][j]);
                }
                al.add(altemp);
            }
        }
        int topNumber = al.size()-minPathWithoutRepeated;
        int cols = al.get(0).size();
        int[][] arrs = new int[al.size()][cols];
        for (int i = 0; i < arrs.length; i++) {
            ArrayList<Integer> tempall = al.get(i);
            for (int j = 0; j < tempall.size(); j++) {
                arrs[i][j] = tempall.get(j);
            }
        }
        if (al.size()>minPathWithoutRepeated)
        {
            sortbyK(arrs,fa,fb);
            int maxa = 0;
            int maxb = 0;
            for (int i = topNumber; i < arrs.length; i++) {
                if( arrs[i][2]>maxa)
                    maxa = arrs[i][2];
                if( arrs[i][3]>maxb)
                    maxb = arrs[i][3];
                k = maxa*fa+maxb*fb;
            }
        }
        else if (al.size()<=minPathWithoutRepeated)
        {
            int maxa = 0;
            int maxb = 0;
            for (int i = 0; i < arrs.length; i++) {
                if( arrs[i][2]>maxa)
                    maxa = arrs[i][2];
                if( arrs[i][3]>maxb)
                    maxb = arrs[i][3];
            }
            k = maxa*fa+maxb*fb;
        }
        return k;
    }
    public static void sortby2cols(int[][] arr,int first,int second)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j][first]>arr[j+1][first])
                {
                    int[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
                else if(arr[j][first]==arr[j+1][first])
                {
                    if(arr[j][second]>arr[j+1][second])
                    {
                        int[] temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }
    public static void sortbyK(int[][] arr,int fa, int fb)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j][2]*fa+arr[j][3]*fb<arr[j+1][2]*fa+arr[j+1][3]*fb) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
