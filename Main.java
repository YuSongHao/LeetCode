import java.util.Map;
import java.util.Scanner;

/**
 * @program:MyIdeaTest
 * @description:360笔试
 * @author:JasonYu
 * @date:2019-08-31 17-00
 **/
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(findMostSubString(s));
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(findMostSubString(s));
    }
    public static int findMostSubString(String s)
    {
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(i==s.length()-1)
            {
                String sub = s.substring(i,s.length());
                if (hm.containsKey(sub))
                {
                    int value = hm.get(sub);
                    hm.put(sub,value++);
                }
                else
                    hm.put(sub,1);
            }
            else{
                for (int j = i+1; j < s.length(); j++) {
                String sub = s.substring(i,j);
                if (hm.containsKey(sub))
                {
                    int value = hm.get(sub);
                    hm.put(sub,value++);
                }
                else
                    hm.put(sub,1);
            }}
        }
        int result = 0;
        for (Map.Entry me:hm.entrySet()) {
            if ((int)me.getValue()>result)
                result = (int)me.getValue();
        }
        return result;
    }
}
