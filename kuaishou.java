/**
 * @program:MyIdeaTest
 * @description:快手编程题
 * @author:JasonYu
 * @date:2019-08-30 16-59
 **/
public class kuaishou {
    public static void main(String[] args) {
        String s = "cccddecca";
        System.out.println(guiyi(s));
    }
    public static String guiyi(String s)
    {
        char[] ch = s.toCharArray();
        int[] num = new int[26];
        for (int i = 0; i < ch.length; i++) {
            int value = ch[i]-'a';
            num[value] += 1;
        }
        String res = "";
        for (int i = 0; i < num.length; i++) {
            if(num[i]!=0)
                res = res+(char)(i+'a')+String.valueOf(num[i]);
//            if(num[i]!=0&&num[i]!=1)
//                res = res+String.valueOf(num[i]);
        }
        return res;
    }
}
