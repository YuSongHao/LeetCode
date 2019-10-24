package leetcode;

import java.math.BigInteger;

/**
 * @program:MyIdeaTest
 * @description:可被K整除的最小整数
 * 给定正整数 K，你需要找出可以被 K 整除的、仅包含数字 1 的最小正整数 N。
 *
 * 返回 N 的长度。如果不存在这样的 N，就返回 -1。
 * @author:JasonYu
 * @date:2019-09-22 20-28
 **/
public class leetcode1015 {
    public static void main(String[] args) {
        int k = 10000;
        System.out.println(Integer.MAX_VALUE%7);
        System.out.println(mod("100000000001123",7));
        BigInteger num1 = new BigInteger("100000000001123");
        BigInteger num2 = new BigInteger("7");
        System.out.println(num1.mod(num2));
    }

    public static int mod(String str,int num)
    {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]<'0'||ch[i]>'9')
                return -1;
        }
        int result = 0;
        for (int i = 0; i < ch.length; i++) {
            int temp = (ch[i]-'0')%num;
            result = (result*10+temp)%num;
        }
        return result;
    }
}
