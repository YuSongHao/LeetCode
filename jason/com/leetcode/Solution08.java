package jason.com.leetcode;
import java.lang.Math;

public class Solution08 {
    public static void main(String[] args) {
        String str = "    +42";
        System.out.println(myAtoi(str));
    }
    public static int myAtoi(String str) {
        str = str.trim();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        char[] ch = str.toCharArray();
        int start = 0 ,end = 0, flag = 0;//默认是正数
        for (int i = 0; i < ch.length; i++) {
            if(i==0 && ch[i] == '-')
            {
                start += 1;
                flag = 1;
                end++;
                continue;
            }else if (i==0 && ch[i] == '+')
            {
                start += 1;
                end++;
                continue;
            }else if (i<=1 && !(ch[i]>='0'&&ch[i]<='9'))
                return 0;
            if(ch[i]>='0'&&ch[i]<='9')
            {
                end++;
            }
            else
                break;
        }
        char[] num = new char[end-start];
        for (int i = 0; i < end-start; i++) {
            num[i] = ch[i + start];
        }
        if(flag == 1)
        {
            if(end-start>10)
                return min;
            else
            {
                int result = 0;
                for (int i = 0; i < end-start; i++) {
                    result = result - (num[end-start-i-1]-'0')*(int)Math.pow(10,i);
                }
                return result;
            }
        }else
        {
            if(end-start>10)
                return max;
            else
            {
                int result = 0;
                for (int i = 0; i < end-start; i++) {
                    result = result +(num[end-start-i-1]-'0')*(int)Math.pow(10,i);
                }
                return result;
            }
        }

    }
}
