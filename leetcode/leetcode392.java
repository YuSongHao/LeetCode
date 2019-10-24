package leetcode;

import java.util.ArrayList;

/**
 * @program:MyIdeaTest
 * @description:贪心算法——判断子序列——mid
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 *
 * 返回 true.
 *
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 *
 * 返回 false.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author:JasonYu
 * @date:2019-09-18 19-54
 **/
public class leetcode392 {
    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "abgc";
        System.out.println(isSubString(t,s));
    }
    public static boolean isSubString(String t,String s)
    {
        ArrayList<Integer> al = new ArrayList<>();
        char firstOfS = s.charAt(0);
        char[] ch = t.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==firstOfS)
                al.add(i);
        }
        boolean b = false;
        for (int i = 0; i < al.size(); i++) {
            b = isSubString2(ch,s,al.get(i));
            if(b){
                return b;
            }
        }
        return b;
    }
    public static boolean isSubString2(char[] ch,String s,int startPos)
    {
        int pos = startPos+1;
        int index = 1;
        while(pos<ch.length)
        {
            if (ch[pos]==s.charAt(index))
            {
                index++;
            }
            if (index==s.length())
                return true;
            pos++;
        }
        return false;
    }
}
