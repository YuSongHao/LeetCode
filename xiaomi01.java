import java.util.ArrayList;
/**
 * @program:MyIdeaTest
 * @description:小米笔试题01
 * @author:JasonYu
 * @date:2019-09-02 10-54
 **/
import java.util.LinkedList;
import java.util.Scanner;
public class xiaomi01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String t = sc.nextLine();
        String s = "//ac.v.a.vsda...wd";
        String t = ".aws///";
        System.out.println(isChild(t,s));
    }
    public static String isChild(String t,String s)
    {
        if(t.length()==0||s.length()==0||t.length()>s.length())
            return "no";
        char[] cht = t.toCharArray();
        char[] chs = s.toCharArray();
        LinkedList<Character> al = new LinkedList<>();
        for (int i = 0; i < chs.length; i++) {
            al.add(chs[i]);
        }
        for (int i = 0; i < cht.length; i++) {
            char temp = cht[i];
            for (int k = 0; k < al.size(); k++) {
                if(temp == al.get(k))
                {
                    al.remove(k);
                    break;
                }
                else if (k==al.size()-1&&temp!=al.get(k))
                    return "No";
            }
        }
        return "Yes";
    }
}
