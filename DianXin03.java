

/**
 * @program:MyIdeaTest
 * @description:电信云计算笔试题03
 * @author:JasonYu
 * @date:2019-09-18 21-18
 **/
import java.util.Scanner;
public class DianXin03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(",");
        if (arr.length==1) {
            arr[0] = arr[0].replace("[", "");
            arr[0] = arr[0].replace("]", "");
            if (arr[0].equals(""))
                System.out.println(0);
            else
                System.out.println(Integer.parseInt(arr[0]));
        }
        else{
            int[] b = new int[arr.length];
            for (int i = 0; i < b.length ; i++) {
                if (i==0)
                    arr[i]=arr[i].replace("[","");
                if (i==b.length-1)
                    arr[i]=arr[i].replace("]","");
                b[i]=Integer.parseInt(arr[i]);
            }
            System.out.println(maxSubArray(b));
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//    }
    private static int maxSubArray(int[] nums)
    {
        int res = nums[0];
        int sum = 0;
        for (int num:nums)
        {
            if(sum>0)
                sum+=num;
            else
                sum=num;
            res=Math.max(res,sum);
        }
        return res;
    }
}
