/**
 * @program:MyIdeaTest
 * @description:统计整数二进制中1的个数
 * @author:JasonYu
 * @date:2019-09-02 10-44
 **/
public class bitmap01 {
    public static int hammingWeight(int n) {
        int result = 0;
        int bit = 1;
        for(int i = 0;i<32;i++)
        {
            if((n & bit)==bit)
                result++;
            bit*=2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(Integer.MAX_VALUE));
    }
}
