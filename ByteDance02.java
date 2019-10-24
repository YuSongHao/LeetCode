

/**
 * @program:MyIdeaTest
 * @description:字节跳动笔试题03
 * @author:JasonYu
 * @date:2019-09-29 20-23
 **/
import java.rmi.server.ExportException;
import java.util.Scanner;
public class ByteDance02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong())
        {
//            String str = sc.nextLine();
//            String[] numsArr = str.split(" ");
            long[] nums = new long[3];
//            for (int i = 0; i < numsArr.length; i++) {
//                nums[i]=Long.parseLong(numsArr[i]);
//            }
            nums[0]=sc.nextLong();
            nums[1]=sc.nextLong();
            nums[2]=sc.nextLong();
            System.out.println(check(nums));
        }

    }
    private static boolean check(long[] nums)
    {
        boolean res = false;
        if (nums.length!=3)
            return res;
        long a = nums[0];
        long b = nums[1];
        long c = nums[2];
        Long zero = new Long(0);
        try{
            long temp = a+b;
            if (temp>c)
                res = true;
        }catch (Exception e)
        {
            if(a>zero&&b>zero)
                res =  true;
            else
                res = false;
        }
        return res;
    }
}
