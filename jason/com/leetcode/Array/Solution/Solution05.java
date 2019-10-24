package jason.com.leetcode.Array.Solution;

public class Solution05 {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestSub(s));
    }
    public static String longestSub(String s)
    {
        if(s.length()==0)
            return s;
        char[] ch = s.toCharArray();
        int len = 0;int start = 0;
        String result = "";
        for (int i = 0; i < ch.length; i++) {
            for (int j = ch.length-1; j >=0 ; j--) {
                if(ch[j] == ch[i]&&(j-i)>len)
                {
                    int k = i;
                    while(k<j&&ch[k]==ch[j+i-k])
                    {
                        k++;
                    }
                    if(k==j)
                    {
                        len = j-i+1;
                        start = i;
                        result = s.substring(i,j+1);
                    }
                }
            }
        }
        if (len == 1)
            result = String.valueOf(ch[0]);
        return result;
    }

}
