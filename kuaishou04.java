
/**
 * @program:MyIdeaTest
 * @description:快手笔试题04
 * @author:JasonYu
 * @date:2019-09-16 20-57
 **/
import java.util.Arrays;
import java.util.Scanner;
public class kuaishou04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lengthOfDIff(arr));
    }
    public static int lengthOfDIff(int[] arr)
    {
        Arrays.sort(arr);
        int length = 0;
        int[] diff = new int[arr.length-1];
        for (int i = 0; i < diff.length; i++) {
            diff[i] = arr[i+1]-arr[i];
        }
        for (int i = 0; i < diff.length; i++) {
            int startDiff = diff[i];
            int index = i;
            int temp = 1;
            while(index+1<diff.length&&startDiff==diff[index+1])
            {
                temp++;
                index++;
            }
            if (temp>length)
                length=temp;
        }
        return length+1;
    }

}
