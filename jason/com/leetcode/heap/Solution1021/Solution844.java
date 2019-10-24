package jason.com.leetcode.heap.Solution1021;
import java.util.Stack;

public class Solution844 {
    public static void main(String[] args) {
        String s = "xywrrmp";
        String t = "xywrrm#p";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String S, String T) {
        char[] chs = S.toCharArray();
        char[] cht = T.toCharArray();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < chs.length; i++) {
            if(chs[i]>='a'&&chs[i]<='z')
            {
                st1.push(chs[i]);
            }else if(chs[i]=='#')
            {
                if(!st1.empty())
                    st1.pop();
            }
        }
        for (int i = 0; i < cht.length; i++) {
            if(cht[i]>='a'&&cht[i]<='z')
            {
                st2.push(cht[i]);
            }else if(cht[i]=='#')
            {
                if(!st2.empty())
                    st2.pop();
            }
        }
        char[] chsAfter = new char[st1.size()];
        char[] chtAfter = new char[st2.size()];
        if(st1.size()!=st2.size())
            return false;
        for (int i = st1.size()-1; i >=0 ; i--) {
            chsAfter[i] = st1.peek();
            st1.pop();
            chtAfter[i] = st2.peek();
            st2.pop();
            if(chtAfter[i]!=chsAfter[i])
                return false;
        }
        return true;
    }
}
