package jason.com.leetcode.heap.Solution1021;
import java.util.Stack;
import java.util.ArrayList;

public class Solution1047 {
    public static void main(String[] args) {
        String S = "acdbb";
        System.out.println(removeDuplicates(S));

    }
    public static String removeDuplicates(String S) {
        if (!isDuplicate(S))
            return S;
        else
        {
            char[] ch = S.toCharArray();
            ArrayList<Character> al = new ArrayList<>();
            int i = 0;
            while(i<ch.length){
                //System.out.println(i<=ch.length-2);
                //System.out.println(ch[i]==ch[i+1]);
                if (i<=ch.length-2&&(ch[i]==ch[i + 1])) {
                    i +=2;
                    continue;
                }
                else
                {
                    al.add(ch[i]);
                    i++;
                }
            }
            char[] res = new char[al.size()];
            for (int j = 0; j < al.size(); j++) {
                res[j] = al.get(j);
            }
            String s = String.valueOf(res);
            return removeDuplicates(s);
        }

    }
    public static boolean isDuplicate(String S)
    {
        char[] ch = S.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i]==ch[i+1])
                return true;
        }
        return false;
    }
}
