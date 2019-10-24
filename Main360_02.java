import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:360笔试第二题
 * @author:JasonYu
 * @date:2019-08-31 17-24
 **/
public class Main360_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int value = findFinal(length,arr);
        System.out.println(value);
    }
    public static int findFinal(int length,int[] arr)
    {
        int result = length;
//        while(arr.length==0)
//            return result;
        int[] arr1 = new int[length];
        for (int i = 0; i < length; i++) {
            arr1[i] = i+1;
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            int temp = arr[i];
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j]-temp<=0&&arr1[j]+temp>10)
                    result--;
            }
        }
        return result;
    }
}
