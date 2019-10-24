

/**
 * @program:MyIdeaTest
 * @description:字节笔试题01
 * @author:JasonYu
 * @date:2019-09-29 20-03
 **/
import java.util.Scanner;
public class ByteDance01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] nums = str.split(" ");
            int[] numsArr = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                numsArr[i] = Integer.parseInt(nums[i]);
            }
            if (canBe(numsArr[0], numsArr[1], numsArr[2]))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
    private static boolean canBe(int Wei,int Shu,int Wu){
        boolean answer = false;
        int diff1 = Math.abs(Wei-Shu);
        int diff2 = Math.abs(Shu-Wu);
        int diff3 = Math.abs(Wu-Wei);
        if(diff1%3==0||diff2%3==0||diff3%3==0)
            return true;
        else
            return answer;
    }
}
