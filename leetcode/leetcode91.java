package leetcode;

/**
 * @program:MyIdeaTest
 * @description:解码方法
 * @author:JasonYu
 * @date:2019-10-23 09-42
 **/
public class leetcode91 {
    public static void main(String[] args) {
        String s = "226";
    }
    public static int numDecodings(String s) {
        char[] ch = s.toCharArray();
        int result = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]==0&&(i==0||ch[i-1]-'2'>0||ch[i-1]=='0'))
                return result;
        }
        return result;
    }
}
