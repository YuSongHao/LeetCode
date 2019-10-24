package leetcode;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;

/**
 * @program:MyIdeaTest
 * @description:宝石与石头
 * @author:JasonYu
 * @date:2019-10-23 20-25
 **/
public class leetcode771 {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }
    public static int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] j = J.toCharArray();
        for (int i = 0; i < j.length; i++) {
            hm.put(j[i],0);
        }
        char[] s = S.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (hm.containsKey(s[i])){
                count+=1;
            }
        }
        return count;
    }
}
