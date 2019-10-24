
/**
 * @program:MyIdeaTest
 * @description:猿辅导02
 * @author:JasonYu
 * @date:2019-09-16 17-38
 **/
import java.util.Scanner;
public class YuanFuDao {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int classes = sc.nextInt();
//        int target = sc.nextInt();
//        int[] arr = new int[classes];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        int classes = 7;
        int target = 5;
        int[] arr = {5,3,1,1,1,1,1};
        System.out.println(longestNormal(arr,target));
    }
    public static int longestNormal(int[] arr,int target){
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int temp = 0;
            int index = i;
            while(start<=target&&index<arr.length)
            {
                start+=arr[index];
                temp++;
                index++;
            }
            if (temp>res)
                res = temp;
        }
        return res;
    }
}
