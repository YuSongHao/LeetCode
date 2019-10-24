

/**
 * @program:MyIdeaTest
 * @description:快手笔试题02
 * @author:JasonYu
 * @date:2019-09-16 21-36
 **/
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
public class kuaishou02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> res = letterCombinations(str);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    public static List<String> letterCombinations(String digits)
    {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        char[] arr = digits.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-'2'<0||arr[i]-'9'>0)
                return ans;
        }
        String[] mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i)
            {
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }
}
